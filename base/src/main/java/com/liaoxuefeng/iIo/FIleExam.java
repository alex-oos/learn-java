package com.liaoxuefeng.iIo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * <P>
 * 实现文件复制功能
 * </p>
 *
 * @author Alex
 * @since 2023/11/30 下午5:34
 */
public class FIleExam {

    public static void main(String[] args) throws IOException {

        Path oldFilePath = Files.createFile(Path.of("./tmp.text"));
        // Path oldFilePath1 = Files.write(oldFilePath, "files create demo".getBytes());

        try (FileWriter fileWriter = new FileWriter(oldFilePath.toFile())) {
            System.out.println("使用 FileWriter 字符流写入文件：");
            fileWriter.write("file create demo");
        }

        StringBuilder content = new StringBuilder();

        try (FileReader fileReader = new FileReader(oldFilePath.toFile())) {
            System.out.println("使用 FileReader 字符流读取文件：");
            int data = 0;
            while ((data = fileReader.read()) != -1) {
                content.append((char) data);
            }
            System.out.println("内容为：" + content);
        }

        Path newFilePath = Files.createFile(Path.of("./tmp-back.text"));

        // 文件流写入文件
        try (FileOutputStream fileOutputStream = new FileOutputStream(newFilePath.toFile())) {
            System.out.println("用FileOutputStream 字节流写入文件");
            fileOutputStream.write(content.toString().getBytes());
        }
        // 读取新的文件，看看文件是否写入成功
        try (FileInputStream inputStream = new FileInputStream(newFilePath.toFile())) {
            StringBuilder content1 = new StringBuilder();
            byte byteData = 0;
            while ((byteData = (byte) inputStream.read()) != -1) {
                content1.append((char) byteData);
            }
            System.out.println("使用FileInputStream流 读取文件：");
            System.out.println(content1);
        }


        Files.deleteIfExists(oldFilePath);

        Files.deleteIfExists(newFilePath);
    }

}
