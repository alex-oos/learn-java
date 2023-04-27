package com.liaoxuefeng.iIo.aFile;

import java.io.File;
import java.io.IOException;

/**
 * @author: 李将
 * @since: 2020/6/20 17:17
 * @Descprition: File 文件读写操作
 */
public class TestFile {

    public static void function() throws IOException {
        File dummyfile = new File("text.txt");
        boolean fileCreated = dummyfile.createNewFile();
        System.out.println(fileCreated);
    }

    public static void function1() {
        File file = new File("src\\main\\resources\\data");
        if (file.exists()) {
            System.out.println(file.exists());
            file.delete();
            System.out.println(file.delete());
            file.mkdirs();
            System.out.println(file.mkdirs());
        } else {
            file.mkdir();
            System.out.println(file.mkdir());
        }

    }

    public static void function3() throws IOException {
        File oldFile = new File("old_dummy.txt");

        File newFile = new File("new_dummy.txt");
        boolean fileRenamed = oldFile.renameTo(newFile);
        if (fileRenamed) {
            System.out.println(oldFile + "renamed to " + newFile);

        } else {
            System.out.println("Renaming " + oldFile + "  to " + newFile
                    + "  failed.");
        }
    }

    public static void main(String[] args) throws IOException {
        function();
        function1();
        function3();

 /*       File file = new File("base/src/main/resources/data/file.txt");
        boolean fileCreated = file.createNewFile();
        System.out.println(fileCreated);
        File dummyFile = new File("dummy.txt");
        System.out.println(dummyFile.delete());*/

    }
}

