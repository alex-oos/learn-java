package com.liaoxuefeng.iIo.aFile;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @Auther: 李将
 * @Date: 2020/6/27 14:57
 * @Descprition:
 */
public class TestFile1 {

    public static void printFiles(File[] files) {
        System.out.println("=======");
        if (files != null) {
            for (File file : files) {
                System.out.println(file);
            }
            System.out.println(files.toString() + "=========");
        }
    }
    public static void function() {
        String pathname = "base/src/main/resources/data";
        File file = new File(pathname);
        File[] fsl = file.listFiles(); // 列出所有文件和子目录
        printFiles(fsl);
        // 添加过滤器，仅仅显示，exe文件
        File[] fs2 = file.listFiles(new FilenameFilter(){

            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".exe");
            }

        });

        printFiles(fs2);
    }

    public static void main(String[] args) {
        function();
    }
}
