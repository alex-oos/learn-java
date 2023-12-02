package com.jmeter;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 计算scprit 脚本下jmx 文件的个数
 */
public class FileUtil {


    // 寻找File文件夹下所有的jmx结尾的文件名
    public static List<String> printFileName(File file1) {

        File file = new File("./scprit");
        List<String> list = new ArrayList<>();

        if (file.isDirectory() && file.exists()) {// 参数file是目录并且存在
            // 生成File数组
            File[] fileList = file.listFiles();
            // 遍历集合
            for (File f : fileList) {
                if (f.isDirectory()) {// 次元素是目录
                    list.addAll(printFileName(f));// 递归调用
                } else {
                    if (f.getName().endsWith(".jmx")) {// 如果是以.jmx结尾
//                            System.out.println(f.getName());//打印该文件的名字
                        StringBuffer a = new StringBuffer(f.getName());
                        a.delete(a.length() - 4, a.length());
                        list.add(a.toString());
                    }
                }
            }
            return list;
        } else {
            System.out.println("未找到scprit文件夹,退出运行");
            // 强制退出进程
            System.exit(1);
        }
        return null;
    }

    // 删除文件夹，和文件夹中的所有文件
    public static void deleteFolder(File folder) {

        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
    }

    /**
     * 创建目录
     *
     * @param dirPath
     */
    public static boolean createDirectory(String dirPath) {

        File file = new File(dirPath);
        if (file.exists()) {
            deleteFolder(file);
        }
        return file.mkdirs();


    }


}
