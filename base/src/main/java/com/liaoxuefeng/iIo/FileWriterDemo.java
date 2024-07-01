package com.liaoxuefeng.iIo;

import java.io.*;
import java.nio.file.Files;

/**
 * @author Alex
 * @since 2024/7/1 下午2:50
 * <p></p>
 */
public class FileWriterDemo {
    /**
     * 使用 FileWriter 写入文件
     *
     * @param filePath 文件目录
     * @param content  待写入内容
     */
    public static void fileWriterMethod(String filePath, String content) {
        // 是否追加，还是覆盖写入，默认是覆盖写入
        try (FileWriter fileWriter = new FileWriter(filePath);) {
            fileWriter.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 方法2：使用 BufferedWriter写文件
     *
     * @param filePath 文件目录
     * @param content  待写入内容
     */
    public static void bufferWriterMethod(String filePath, String content) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));) {
            bufferedWriter.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 方法3：使用PrintWriter写文件
     *
     * @param filePath 文件目录
     * @param content  待写入内容
     */
    public static void printWriterMethod(String filePath, String content) {

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(filePath));) {
            printWriter.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 方法4：使用FileOutputStream写文件
     *
     * @param filePath 文件目录
     * @param content  待写入内容
     */
    public static void fileOutputStreamMethod(String filePath, String content) {

        try (FileOutputStream outputStream = new FileOutputStream(filePath);) {
            outputStream.write(content.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 方法5：使用BufferedOutputStream写文件
     *
     * @param filePath 文件目录
     * @param content  待写入的内容
     */
    public static void bufferOutputStreamMethod(String filePath, String content) {

        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(filePath));) {
            bufferedOutputStream.write(content.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * files 类的使用
     * @param filePath 文件目录
     * @param content  待写入的内容
     */
    public static void filesTest(String filePath, String content) {

        try {
            Files.write(new File(filePath).toPath(), content.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //如果需要使用内容追加，则需要使用FileWriter(filePath, true)
    //文我们展示了 6 种写入文件的方法，这 6 种方法总共分为 3 类：字符流写入、字节流写入和 Files 类写入。其中操作最便利的是 Files 类，但它的性能不怎么好。如果对性能有要求就推荐使用带有缓存区的流来完成操作，如 BufferedWriter 或 BufferedOutputStream。如果写入的内容是字符串的话，那么推荐使用 BufferedWriter，如果写入的内容是二进制文件的话就推荐使用 BufferedOutputStream。
    //参考资料 https://www.cnblogs.com/rinack/p/14173936.html

    public static void main(String[] args) {

        fileWriterMethod("base/src/main/resources/data/fileWriter.txt", "Hello World!");
        bufferWriterMethod("base/src/main/resources/data/bufferWriter.txt", "Hello World!");
        printWriterMethod("base/src/main/resources/data/printWriter.txt", "Hello World!");
        fileOutputStreamMethod("base/src/main/resources/data/fileOutputStream.txt", "Hello World!");
        bufferOutputStreamMethod("base/src/main/resources/data/bufferOutputStreamMethod.txt", "Hello World!");
        filesTest("base/src/main/resources/data/filesTest.txt", "Hello World!");
    }
}
