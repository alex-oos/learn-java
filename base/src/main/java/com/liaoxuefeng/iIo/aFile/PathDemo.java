package com.liaoxuefeng.iIo.aFile;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Alex
 * @since 2023/10/7 下午6:52
 *  Path 类，用来获取相关的路径，并且创建文件
 */
public class PathDemo {

    /**
     * Path接口的使用，用来获取相关的路径，并且创建文件
     * String toString() ： 返回调用 Path 对象的字符串表示形式
     * boolean startsWith(String path) : 判断是否以 path 路径开始
     * boolean endsWith(String path) : 判断是否以 path 路径结束
     * boolean isAbsolute() : 判断是否是绝对路径
     * Path getParent() ：返回Path对象包含整个路径，不包含 Path 对象指定的文件路径
     * Path getRoot() ：返回调用 Path 对象的根路径
     * Path getFileName() : 返回与调用 Path 对象关联的文件名
     * int getNameCount() : 返回Path 根目录后面元素的数量
     * Path getName(int idx) : 返回指定索引位置 idx 的路径名称
     * Path toAbsolutePath() : 作为绝对路径返回调用 Path 对象
     * Path resolve(Path p) :合并两个路径，返回合并后的路径对应的Path对象
     * File toFile(): 将Path转化为File类的对象
     */
    public static void function() {

        Path path = Paths.get("./tmp.text");
        System.out.println("path.toAbsolutePath() = " + path.toAbsolutePath());
        System.out.println("path.toFile() = " + path.toFile());
        Path fileName = path.getFileName();
        System.out.println("fileName = " + fileName);


    }

    public static void main(String[] args) {

        function();
    }

}
