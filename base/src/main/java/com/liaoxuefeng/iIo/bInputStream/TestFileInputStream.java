package com.liaoxuefeng.iIo.bInputStream;

import java.io.*;

/**
 * @Auther: 李将
 * @Date: 2020/6/27 16:51
 * @Descprition:
 */
public class TestFileInputStream {

    public static final String pathName = "base/src/main/resources/data/";

    //    FileInputStream 文件输入输出流
    public static void function() {
        try (FileInputStream fin = new FileInputStream(pathName + "1.log")) {

            byte byteData;
            int i;
            while ((byteData = (byte) fin.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (FileNotFoundException e) {
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 缓存输入流
    public static void function2() {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(pathName + "1.log"))){

            byte byteData;
            while ((byteData = (byte) bufferedInputStream.read()) != -1) {
                System.out.print((char) byteData);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

   public static void readFile() throws IOException {

       InputStream input = null;
       try {
           input = new FileInputStream(pathName + "1.log");
           int n;
           while ((n = input.read()) != -1) { // 利用while同时读取并判断
               System.out.println((char) n);
           }
       } finally {
           if (input != null) { input.close(); }
       }
   }



    public static void main(String[] args) throws IOException {
        readFile();

    }
}
