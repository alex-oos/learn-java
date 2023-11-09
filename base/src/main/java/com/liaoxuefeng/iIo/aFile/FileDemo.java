package com.liaoxuefeng.iIo.aFile;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author lijiang
 * @since 2023/10/7 下午3:55
 *  File类 的使用
 */
public class FileDemo {

    /**
     * 创建File 类对象
     * 路径分为：
     * 1.绝对路径：是一个完整的路径 /home/alex/IdeaProjects/learn-java/base/base/src/main/resources/data/file.txt
     * 2.相对路径：是一个简化的路径，相对指的是相对于当前项目的根目录（base/src/main/resources/data/file.txt），一般使用相对路径
     * 可以用.表示当前目录，..表示上级目录。
     * File类中获取路径的方法：
     * 1. public String getPath() ：将此File转换为路径名字符串。
     * 2. public String getAbsolutePath() ：返回此File的绝对路径名字符串。
     * 3. public String getCanonicalPath() ：返回此File的规范路径名字符串。
     */
    public static void createFileObject() throws IOException {
        // File类传入的路径 ，既可以是相对路径，也可以是绝对路径，绝对路径是以根目录开始的完整路径 demo: 'D:\\test\\test.txt'
        // 相对路径是以当前项目的根目录开始的路径，demo: 'test\\test.txt'，这里使用的是相对路径
        // 注意分隔符，windows下使用的是反斜杠，linux下使用的是正斜杠
        // 这个就是绝对路径
        // File file = new File("/home/alex/IdeaProjects/learn-java/base/base/src/main/resources/data/file.txt");
        //  这个就是相对路径
        File file1 = new File("./base/src/main/resources/data/file.txt");
        System.out.println("file = " + file1);
        // 因为Windows和Linux的路径分隔符不同，File对象有一个静态变量用于表示当前平台的系统分隔符： File.separatorChar这个变量表示分隔符
        System.out.println("File 分隔符为： " + File.separator);

        File dir = new File(".");
        System.out.println("当前目录为： " + dir);
        File dir2 = new File("..");
        System.out.println("上一级目录为：" + dir2);

        System.out.println("dir.getPath() = " + dir.getPath());
        System.out.println("dir.getAbsolutePath() = " + dir.getAbsolutePath());
        System.out.println("dir.getCanonicalPath() = " + dir.getCanonicalPath());


    }

    /**
     * File类判断功能的方法
     * 1. public boolean exists() ：此File表示的文件或目录是否实际存在。
     * 2. public boolean isDirectory() ：此File表示的是否为目录。
     * 3. public boolean isFile() ：此File表示的是否为文件。
     * 注意：
     * 电脑的硬盘中只有文件/文件夹，两个方法是互斥的
     * 两个方法使用前提，路径必须是存在的，否则都返回false
     */
    public static void isJudgement() {

        File file = new File("./base/src/main/resources/data/file.txt");
        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.isDirectory() = " + file.isDirectory());

    }

    /**
     * file类的创建功能的方法
     * 1. public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
     * 2. public boolean mkdir() ：创建由此File表示的目录。
     * 3. public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
     */
    public static void create() throws IOException {

        File file = new File("./base/src/main/resources/data/file.txt");
        boolean newFile = file.createNewFile(); // 创建永久文件
        System.out.println("是否创建成功： " + newFile);

        File dir = new File("tmp");
        boolean mkdir = dir.mkdir();// 创建一个文件夹
        System.out.println("文件夹创建：" + mkdir);

        File moreDir = new File("tmp/moreDir");
        boolean mkdirs = moreDir.mkdirs();// 创建多级永久文件夹
        System.out.println("多级文件夹创建： " + mkdirs);
        File temp = File.createTempFile("temp", ".txt", new File("tmp")); // 创建临时文件
        System.out.println("临时文件创建：" + temp);

        // 删除操作
        file.delete(); // 删除文件
        temp.deleteOnExit(); // 在虚拟机终止时，请求删除此抽象路径名表示的文件或目录。
        moreDir.delete(); // 只能删除一个文件夹

        dir.delete();  // delete 方法只能删除一个空文件夹，如果是多个空文件夹，需要一个一个删除，后面演示


    }

    /**
     * File类的遍历功能
     * 1. public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
     * 2. public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
     */
    public static void listFile() {

        File file = new File(".");
        String[] list = file.list();
        System.out.println("list = " + Arrays.toString(list));
        File[] files = file.listFiles(); // 不进行过滤
        System.out.println("files = " + Arrays.toString(files));

        // 使用过滤器，仅仅显示，md文件
        File[] files1 = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {

                return s.endsWith(".md");
            }
        });
        System.out.println("files1 = " + Arrays.toString(files1));

    }

    /**
     * file中常用的方法
     * 1. renameTo(File dest) ：把文件重命名为指定的文件路径
     */
    public static void function() throws IOException {

        File oldFile = new File("./tmp.text");
        oldFile.createNewFile();
        File newFile = new File("./tmp2.text");
        boolean b = oldFile.renameTo(newFile);
        System.out.println("重命名是否成功: " + b);
        newFile.delete();

    }

    /**
     * Paths的使用
     * 1. public String getFileName() ：返回与此路径关联的文件或目录名称。
     * 2. public Path getParent() ：返回此路径父路径，如果没有父目录则返回null。
     * 3. public Path getRoot() ：返回此路径根路径，如果没有根路径则返回null。
     */
    public static void pathsDemo() {

        Path path = Paths.get("base/src/main/resources/data/file.txt");
        System.out.println("path.toAbsolutePath() = " + path.toAbsolutePath()); // 获取绝对路径
        System.out.println("path.normalize() = " + path.normalize());
        System.out.println("path.toFile() = " + path.toFile()); // 转换为File对象
        System.out.println("path.getFileName() = " + path.getFileName()); // 获取文件名
        for (Path p : Paths.get("..").toAbsolutePath()) { // 可以直接遍历Path
            System.out.println("  " + p);
        }

    }


    public static void main(String[] args) throws IOException {

        createFileObject();
        isJudgement();
        // create();
        listFile();
        pathsDemo();
        function();

    }

}
