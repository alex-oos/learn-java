package com.liaoxuefeng.iIo.cOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @Auther: 李将
 * @Date: 2020/6/27 18:10
 * @Descprition:
 */
public class TestOutputStram {

    public  static  void writeFile() throws IOException {
        OutputStream outputStream = new FileOutputStream("base/src/main/resources/data/outputstream.log");
        outputStream.write("hello".getBytes("UTF-8"));
        outputStream.write("wolrd".getBytes("UTF-8"));

        outputStream.close();

    }

    public static void main(String[] args) throws IOException {
        writeFile();
    }
}
