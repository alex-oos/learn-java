package com.liaoxuefeng.iIo.eWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

/**
 * @Auther: 李将
 * @Date: 2020/6/29 17:01
 * @Descprition:
 */
public class Main {

    public static void main(String[] args) throws IOException {
      try (Writer writer = new FileWriter("base/src/main/resources/data/reader.txt", StandardCharsets.UTF_8)) {
                writer.write('H'); // 写入单个字符
                writer.write("Hello".toCharArray()); // 写入char[]
                writer.write("Hello"); // 写入String
            }

    }
}
