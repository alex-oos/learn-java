package com.liaoxuefeng.iIo.bInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

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
    public static void readAsString() {

        try (InputStream inputStream = new FileInputStream(pathName + "inputstream.txt")) {
            int byteData;
            // 定义了一个stringBuilder用来接收所有的结果
            StringBuilder stringBuilder = new StringBuilder();
            // 这个方法会读取输入流的下一个字节，并返回字节表示的int值（0~255）。如果已读到末尾，返回-1表示不能继续读取了。
            while ((byteData = inputStream.read()) != -1) {
                // 打印出每次读取出来的数据 read 读取的数据是ASCII码，且是一个一个字节读取，所以需要转化为char类型，我们才能看懂
                System.out.print((char) byteData);
                stringBuilder.append((char) byteData);
            }
            System.out.println(stringBuilder);
        }// 编译器在此自动为我们写入finally并调用close()
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void readChinese() {

        try (FileInputStream inputStream = new FileInputStream(pathName + "chinese-inputstream.txt")) {
            // 中文在utf-8 编码格式下占用3个字节，所以这里定义了byte数组设置长度为3
            byte[] bytes = new byte[3];
            // 用于接收所有的结果
            StringBuilder content = new StringBuilder();
            while ((inputStream.read(bytes)) != -1) {
                // 打印出来每次读取的数据 ,byte[] 类型转化为String类型
                System.out.print(new String(bytes, StandardCharsets.UTF_8));
                content.append(new String(bytes, StandardCharsets.UTF_8));
            }

            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) throws IOException {

        readAsString();
        readChinese();

    }


}
