package demo.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Alex
 * @date: 2023/10/7 上午10:09
 * @Descprition:
 */
public class FileLister {

    public static List<String> listFiles(String folderPath) {

        List<String> filePathList = new ArrayList<>();

        File folder = new File(folderPath);


        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        // 如果是子文件夹，递归遍历并且将结果添加到集合中
                        List<String> subFolderFiles = listFiles(file.getAbsolutePath());
                        filePathList.addAll(subFolderFiles);
                    } else {
                        // 如果是文件，将文件路径添加到集合中
                        filePathList.add(file.getAbsolutePath());
                    }
                }
            }
        } else {
            System.out.println("指定的文件的路径不是一个文件夹");
        }
        return filePathList;

    }

    public static void main(String[] args) {

        String path = "/mnt/pipeline_storage";
        List<String> listFilesPath = listFiles(path);
        listFilesPath.forEach(System.out::println);

    }

}
