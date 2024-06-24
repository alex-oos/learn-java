package com.liaoxuefeng.iIo.aFile;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Alex
 * @since 2023/10/7 下午5:16
 */
public class FileUtil {

    /**
     * 获取某个目录下的所有文件的绝对路径
     */
    public static List<String> listFiles(String folderPath) {

        List<String> filePaths = new ArrayList<>();

        File folder = new File(folderPath);
        if (!folder.exists()) {
            return null;
        }

        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        List<String> subFolderFiles = listFiles(file.getAbsolutePath());
                        if (subFolderFiles != null) {
                            filePaths.addAll(subFolderFiles);
                        }
                    } else {
                        filePaths.add(file.getAbsolutePath());
                    }
                }
            }


        } else {
            filePaths.add(folderPath);
        }

        return filePaths;


    }

    /**
     * 方法二：获取某个目录下的所有文件的绝对路径
     */
    public static List<String> listFiles2(String folderPath) {

        List<String> filePaths = null;

        try (Stream<Path> walk = Files.walk(Paths.get(folderPath))){
            filePaths = walk.filter(Files::isRegularFile).map(a -> a.toAbsolutePath().toString()).collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return filePaths;

    }

    //方式三：commons-io 中的 FileUtils 类
    public static List<String> listFiles3(String folderPath) {

        List<String> filePaths = FileUtils.listFiles(new File(folderPath), null, true).stream().map(File::getAbsolutePath).collect(Collectors.toList());
        return filePaths;

    }

    public static void main(String[] args) {
        // 获取当前目录下所有的文件夹
        Objects.requireNonNull(listFiles(".")).forEach(System.out::println);
        listFiles2(".").forEach(System.out::println);
        listFiles3(".").forEach(System.out::println);


    }

}
