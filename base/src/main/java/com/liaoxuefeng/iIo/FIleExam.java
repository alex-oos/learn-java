package com.liaoxuefeng.iIo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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

        Path oldFilePath1 = Files.write(oldFilePath, "files create demo".getBytes());
        StringBuilder content = new StringBuilder();

        // 文件流读取文件
        try (FileInputStream inputStream = new FileInputStream(oldFilePath1.toFile())) {
            byte byteData = 0;
            while ((byteData = (byte) inputStream.read()) != -1) {
                content.append((char) byteData);
            }
            System.out.println("读取文件" + content);


        }


        Path newFilePath = Files.createFile(Path.of("./tmp-back.text"));

        // 文件流写入文件
        try (FileOutputStream fileOutputStream = new FileOutputStream(newFilePath.toFile())) {
            fileOutputStream.write(content.toString().getBytes());
        }
        // 读取新的文件，看看文件是否写入成功
        try (FileInputStream inputStream = new FileInputStream(newFilePath.toFile())) {
            StringBuilder content1 = new StringBuilder();
            byte byteData = 0;
            while ((byteData = (byte) inputStream.read()) != -1) {
                content1.append((char) byteData);
            }
            System.out.println(content1);
        }


        Files.deleteIfExists(oldFilePath);

        Files.deleteIfExists(newFilePath);
    }

}
