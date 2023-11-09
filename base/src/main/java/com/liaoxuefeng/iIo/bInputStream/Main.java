package com.liaoxuefeng.iIo.bInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Alex
 * @since 2020/6/27 18:00
 *  inputStream 文件流读写操作
 */
public class Main {
    public static final String pathName = "base/src/main/resources/data/";

    public static void main(String[] args) throws IOException {
        String s;
        try (InputStream inputStream = new FileInputStream(pathName + "1.log")) {
            s = readAsString(inputStream);
        }
        System.out.println(s);
    }

    public static String readAsString(InputStream inputStream) throws IOException {
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        while ((n = inputStream.read()) != -1) {
            stringBuilder.append((char) n);
        }
        return stringBuilder.toString();
    }
}
