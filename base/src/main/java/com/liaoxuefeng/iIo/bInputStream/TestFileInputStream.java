package com.liaoxuefeng.iIo.bInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Alex
 * @since 2020/6/27 16:51
 */
public class TestFileInputStream {

    public static final String pathName = "base/src/main/resources/data/";

    /**
     * FileInputStream 文件输入输出流
     */
    public static void fileInputStreamDemo() {

        try (FileInputStream fin = new FileInputStream(pathName + "inputstream.txt")) {
            byte byteData;
            while ((byteData = (byte) fin.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (FileNotFoundException e) { // 捕获文件不存在异常
            e.printStackTrace();
        } catch (IOException e) { // 捕获读取异常
            e.printStackTrace();
        }
    }

    /**
     * BufferedInputStream:缓存输入流
     */
    public static void bufferedInputStreamDemo() {

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(pathName + "inputstream.txt"))) {

            byte byteData;
            while ((byteData = (byte) bufferedInputStream.read()) != -1) {
                System.out.print((char) byteData);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //
    // public static void readFile() throws IOException {
    //
    //     InputStream input = null;
    //     try {
    //         input = new FileInputStream(pathName + "inputstream.txt");
    //         int n;
    //         while ((n = input.read()) != -1) { // 利用while同时读取并判断
    //             System.out.println((char) n);
    //         }
    //     } finally {
    //         if (input != null) {
    //             input.close();
    //         }
    //     }
    // }


    public static void main(String[] args) throws IOException {

        fileInputStreamDemo();
        bufferedInputStreamDemo();
        // readFile();

    }

}
