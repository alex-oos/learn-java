package com.liaoxuefeng.iIo.cOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * @author Alex
 * @since 2020/6/27 18:10
 * 输出流：字节流：OutputStream
 */
public class OutputStreamDemo {

    /**
     * void write(byte[] b)将 b.length 个字节从指定的 byte 数组写入此输出流。write(b) 的常规协定是：应该与调用 write(b, 0, b.length) 的效果完全相同。
     */
    public static void writeFile() throws IOException {

        OutputStream outputStream = new FileOutputStream("base/src/main/resources/data/outputstream.log");
        // "hello".getBytes(StandardCharsets.UTF_8) 是将String 转化为byte[] 字节数组
        byte[] b = "hello".getBytes(StandardCharsets.UTF_8);
        outputStream.write(b);
        outputStream.write("wolrd".getBytes(StandardCharsets.UTF_8));

        outputStream.close();

    }

    public static void main(String[] args) throws IOException {

        writeFile();
    }

}
