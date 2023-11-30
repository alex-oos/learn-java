package com.liaoxuefeng.iIo.bInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Alex
 * @since 2020/6/27 18:00
 * 字节流，inputStream 文件流读写操作
 * 常用的方法：
 * public abstract int read() throws IOException; 这个方法会读取输入流的下一个字节，并返回字节表示的int值（0~255）。如果已读到末尾，返回-1表示不能继续读取了
 * 最典型的就是FileInputStream
 */
public class Main {

    public static final String pathName = "base/src/main/resources/data/";


    /**
     * 读取一个FileInputStream的所有字节
     */
    public static String readAsString(InputStream inputStream) throws IOException {

        int byteData;
        // 定义了一个stringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        // 这个方法会读取输入流的下一个字节，并返回字节表示的int值（0~255）。如果已读到末尾，返回-1表示不能继续读取了。
        while ((byteData = inputStream.read()) != -1) {
            stringBuilder.append((char) byteData);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws IOException {

        String s;
        try (InputStream inputStream = new FileInputStream(pathName + "inputstream.txt")) {
            s = readAsString(inputStream);
        }// 编译器在此自动为我们写入finally并调用close()
        System.out.println(s);
    }

}
