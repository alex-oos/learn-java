package com.liaoxuefeng.iIo.aFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: lijiang
 * @date: 2023/10/7 下午5:16
 * @Descprition:
 */
public class FileExp {

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
                        filePaths.addAll(subFolderFiles);
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
     * 方法二：
     */
    public static List<String> listFiles2(String folderPath) {

        List<String> filePaths = null;
        Path path = Paths.get(folderPath);

        Stream<Path> walk;
        try {
            walk = Files.walk(path);
            filePaths = walk.filter(Files::isRegularFile).map(a -> a.toAbsolutePath().toString()).collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return filePaths;

    }

    public static void main(String[] args) {
        // 获取当前目录下所有的文件夹
        List<String> listFiles = listFiles(".");
        // function.forEach(System.out::println);

        List<String> listFiles2 = listFiles2(".");
        listFiles2.forEach(System.out::println);


    }

}
