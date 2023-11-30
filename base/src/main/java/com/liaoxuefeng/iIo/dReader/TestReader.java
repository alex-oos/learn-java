package com.liaoxuefeng.iIo.dReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

/**
 * @author Alex
 * @since 2020/6/29 16:51
 * 字符流： Reader 读取文件
 */
public class TestReader {


    // StandardCharsets 指定文件编码的格式
    public static void readFile() throws IOException {

        Reader reader = new FileReader("base/src/main/resources/data/reader.txt", StandardCharsets.UTF_8);
 /*        for (; ; ) {
            int n = reader.read();
            if (n == -1) {
                break;
            }
            System.out.print((char) n);

        } */
        int n = 0;
        while ((n = reader.read()) != -1) {
            System.out.print((char) n);
        }
        reader.close();
    }

    public static void main(String[] args) throws IOException {

        readFile();
    }

}
