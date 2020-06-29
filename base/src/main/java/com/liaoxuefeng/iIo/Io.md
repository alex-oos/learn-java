[TOC]

## IO

### 一、File对象

> FIle对象是用于读取文件

##### 1.File对象的用法：

1. getPath：返回构造方法传入的路径
2. getAbsoultPath()：返回绝对路径
3. getCanoniacalPath：返回规范路径（与绝对路径类似）

```java
 File file = new File("base/src/main/resources/data/file.txt");
        // 返回构造方法传入的路径
        System.out.println(file.getPath());
//        返回绝对路径
        System.out.println(file.getAbsolutePath());
        // 返回规范
        System.out.println(file.getCanonicalPath());
        System.out.println(file);
```

##### 2.File的方法：

1. isFile():判断FIle对象是否是一个已经存在的文件，
2. isDirectory()：判断File对象是否是一个已经存在的目录
3. exists():判断文件是否存在
4. File.separator，分隔符

```java
 File f1 = new File("base/src/main/resources/");
        File f2 = new File("base/src/main/resources/data/");
        File f3 = new File("base/src/main/resources/data/file.txt");

        System.out.println(f1.isFile());
        System.out.println(f2.isFile());
        System.out.println(f3.isDirectory());
        if (f1.exists()) {
            System.out.println("文件夹存在");
        } else {
            System.out.println("文件夹不存在");
        }

```

##### 3.File文件操作

1. createNewFile():新建文件

   ```java
   File file = new File("text.txt");
   boolean fileTrue = file.createNewFile();
   ```

2. mkdir()/mkdirs():新建目录

3. delete()：文件删除

4. deleteOnExit()：延迟删除文件

5. renameTo()：重命名文件

##### 4.文件属性：

1. setReadOnly():只读
2. setReadable()：可读
3. setWritable()：可写
4. setExecutable()：可执行
5. lastModified()：获取文件最后修改的日期
6. setLastModified()：设置文件最后修改的时间和日期

5.文件大小：

1. length()：文件的大小

6.列出文件和目录

1. istRoots(）：获取文件系统中可用根目录的列表，返回一个File对象
2. list()或listFiles()方法列出目录中的所有文件和目录

```java
 File[] fsl = file.listFiles(); // 列出所有文件和子目录
        printFiles(fsl);
        // 添加过滤器，仅仅显示，exe文件
        File[] fs2 = file.listFiles(new FilenameFilter(){

            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".exe");
            }

        });
```

二、输入流：InputStream

> InputStream是输入流，主要有以下三种实现方式：FileInputStream，ByteArrayInputStream和PipedInputStream，FilterInputStream

方法如下：

1. read():读取一个字节并将读取的字节作为int返回，当到达输入流的结尾时，它返回-1
2. read(byte[] buffer)：读取最大值到指定缓冲区的长度
3. read(byte[] buffer,int offset,int length)：读取最大值到指定长度字节
4. close()：关闭输入流
5. availble()：返回可以从此输入流读取，但不阻塞的估计字节数

1.文件输入流:FileInputStream

> ​	

2.缓存输入流:BufferedInputStream

> BufferedInputStream 通过缓存数据想输入流添加功能，

3.推回输入流:PushbackInputStream

4.数据输入流:DataInputStream

三、输出流：OutputStream

1.文件输出流

2.打印流

3.数据输出刘

4.管道

5.对象序列化



