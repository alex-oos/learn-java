package com.liaoxuefeng.iIo.aFile;

/**
 * @ClassName TestFile2
 * @Description
 * @Author Alex
 * @Date 2023/4/28 11:30
 * @Version 1.0
 */

import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * @author: 李将
 * @since: 2020/6/18 20:34
 * @Descprition:
 */
public class TestFile2 {

    public static void function() throws IOException {

        File file = new File("base/src/main/resources/data/file.txt");
        // 返回构造方法传入的路径
        System.out.println(file.getPath());
        //        返回绝对路径
        System.out.println(file.getAbsolutePath());
        // 返回规范
        System.out.println(file.getCanonicalPath());
        System.out.println(file);
    }

    public static void function1() {
        File f1 = new File("base/src/main/resources/");
        File f2 = new File("base/src/main/resources/data/");
        File f3 = new File("base/src/main/resources/data/file.txt");

        System.out.println(f1.isFile());
        System.out.println(f2.isFile());
        System.out.println(f3.isDirectory());
        if (f1.exists()) {
            System.out.println("文件夹存在");
        } else {
            System.out.println("文件夹不存在");
        }

    }

    public static void createFile(File f, String pathName1) throws IOException {
        f.createNewFile();
        if (f.isFile() && f.exists()) {
            System.out.println(f.getName() + "新建文件成功");
            File file1 = new File(pathName1 + new Random().nextInt() + "_rename.log");
            f.renameTo(file1);
            System.out.println(file1.getName() + "重命名成功");
        }
    }

    public static void function3() throws IOException {
        String pathName = "base/src/main/resources/data/";
        String fileName = "fileName";
        File file = new File(pathName + fileName + ".log");
        if (!file.exists()) {
            createFile(file, pathName);
        } else {
            file.delete();
            createFile(file, pathName);
        }
    }

    public static void function4() {
        String pathName = "base/src/main/resources/data/";
        File file = new File(pathName + "mkdir");
        file.mkdirs();
        file.deleteOnExit();
//            file.delete();
    }

    public static void main(String[] args) throws IOException {
        function4();
    }


}
