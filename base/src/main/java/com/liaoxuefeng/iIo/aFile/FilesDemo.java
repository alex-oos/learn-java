package com.liaoxuefeng.iIo.aFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author: lijiang
 * @date: 2023/10/7 下午6:48
 * @Descprition: java.nio.file.Files 用于操作文件或目录的工具类
 */
public class FilesDemo {

    /**
     * Path copy(Path src, Path dest, CopyOption … how) : 文件的复制
     *  Path createDirectory(Path path, FileAttribute<?> … attr) : 创建一个目录
     *  Path createFile(Path path, FileAttribute<?> … arr) : 创建一个文件
     *  void delete(Path path) : 删除一个文件/目录，如果不存在，执行报错
     *  void deleteIfExists(Path path) : Path对应的文件/目录如果存在，执行删除
     *  Path move(Path src, Path dest, CopyOption…how) : 将 src 移动到 dest 位置
     *  long size(Path path) : 返回 path 指定文件的大小
     */
    public static void function() {

        try {
            Path file = Files.createFile(Paths.get("./tmp.text"));
            System.out.println("file.toFile() = " + file.toFile());
            boolean deleted = Files.deleteIfExists(file);
            System.out.println("是否删除成功= " + deleted);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Files常用方法：用于判断
     * boolean exists(Path path, LinkOption … opts) : 判断文件是否存在
     * boolean isDirectory(Path path, LinkOption … opts) : 判断是否是目录
     * boolean isRegularFile(Path path, LinkOption … opts) : 判断是否是文件
     * boolean isHidden(Path path) : 判断是否是隐藏文件
     * boolean isReadable(Path path) : 判断文件是否可读
     * boolean isWritable(Path path) : 判断文件是否可写
     * boolean notExists(Path path, LinkOption … opts) : 判断文件是否不存在
     */
    public static void function1() {

    }

    /**
     * Files常用方法：用于操作内容
     *  SeekableByteChannel newByteChannel(Path path, OpenOption…how) : 获取与指定文件的连
     * 接，how 指定打开方式。
     *  DirectoryStream<Path> newDirectoryStream(Path path) : 打开 path 指定的目录
     *  InputStream newInputStream(Path path, OpenOption…how):获取 InputStream 对象
     *  OutputStream newOutputStream(Path path, OpenOption…how) : 获取 OutputStream 对象
     */
    public static void function2() {

    }

    public static void main(String[] args) {

        function();
    }

}
