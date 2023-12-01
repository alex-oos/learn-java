[TOC]

## Java输入/输出（I/O）

### 一、java流：

1. 概念

> java 程序通过流来完成输入/输出，所有的输入/输出以流的形式处理，要了解I/O系统
>
> 输入就是将数据从各种输入设备（包括文件、键盘等）中读取到内存中，输出则正好相反，是将数据写入到各种输出设备（比如文件、显示器、磁盘等）。例如键盘就是一个标准的输入设备，而显示器就是一个标准的输出设备，但是文件既可以作为输入设备，又可以作为输出设备。

  2. 数据流是 Java 进行 I/O 操作的对象，它按照不同的标准可以分为不同的类别。

      * 按照流的方向分为输入流和输出流

      - 数据流按照数据方位的不同分为字节流（8bit）和字符流(16bit)

      - 按照功能可以划分为节点流和处理流

二、Java系统流

1. System.in:标准输入流
2. System.out：标准输出刘
3. System.err

三、Java字符编码

### 二、File对象

> FIle对象是用于读取文件的实体类

##### 1.File对象的用法：

1. getPath：返回构造方法传入的路径
2. getAbsoultPath()：返回绝对路径
3. getCanoniacalPath：返回规范路径（与绝对路径类似）

```java
        File file=new File("base/src/main/resources/data/file.txt");
        //返回构造方法传入的路径
        System.out.println(file.getPath());
        //返回绝对路径
        System.out.println(file.getAbsolutePath());
        // 返回规范
        System.out.println(file.getCanonicalPath());
        System.out.println(file);
```

##### 2.File的方法：

1. isFile():判断FIle对象是否是一个已经存在的文件，
2. isDirectory()：判断File对象是否是一个已经存在的目录
3. exists():判断文件是否存在
4. File.separator，分隔符 ，因为widows 上用的反斜杠，linux上是斜杠，两者并不一致，而系统多在linux上执行，所以很多时候都用这个

```java
        File f1=new File("base/src/main/resources/");
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
        File[]fsl=file.listFiles(); // 列出所有文件和子目录
        printFiles(fsl);
        // 添加过滤器，仅仅显示，exe文件
        File[] fs2 = file.listFiles(new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".exe");
            }
        });
```

### 三、字节流：

#### 1. 输入流：InputStream

> InputStream是输入流，主要有以下三种实现方式：FileInputStream，ByteArrayInputStream和PipedInputStream，FilterInputStream

方法如下：

1. public abstract int read() throws IOException:

   从输入流中读取数据的下一个字节。返回 0 到 255 范围内的 int 字节值。如果因为已经到达流末尾而没有可用的字节，则返回值 -1。

2. read(byte[] buffer)：

   从此输入流中将最多 buffer.length 个字节的数据读入一个 byte 数组中。如果因为已经到达流末尾而没有可用的字节，则返回值
   -1。否则以整数形式返回实际读取的字节数。

3. read(byte[] buffer,int offset,int length)：

   读取最大值到指定长度字节

4. close()：

   关闭输入流

5. availble()：

   返回可以从此输入流读取，但不阻塞的估计字节数

1.文件输入流:FileInputStream

> 文件的输入流和输出流

```java
    /**
 * FileInputStream 文件输入输出流
 */
public static void fileInputStreamDemo(){

        try(FileInputStream fin=new FileInputStream(pathName+"inputstream.txt")){
        byte byteData;
         // read 读取的是一个ASCII码，为-1的时候就代码读取结束
        while((byteData=(byte)fin.read())!=-1){
            // 将ascii码转化为char类型
        System.out.print((char)byteData);
        }
        }catch(FileNotFoundException e){ // 捕获文件不存在异常
        e.printStackTrace();
        }catch(IOException e){ // 捕获读取异常
        e.printStackTrace();
        }
 }
```

2.缓存输入流:BufferedInputStream

> BufferedInputStream 通过缓存数据想输入流添加功能，

```java
    /**
     * BufferedInputStream:缓存输入流
     */
    public static void bufferedInputStreamDemo() {

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(pathName + "inputstream.txt"))) {
            byte byteData;
            while ((byteData = (byte) bufferedInputStream.read()) != -1) {
                System.out.print((char) byteData);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```

#### 2. 输出流：OutputStream

常用的方法如下：

- void write(int b)
  将指定的字节写入此输出流。write 的常规协定是：向输出流写入一个字节。要写入的字节是参数 b 的八个低位。b 的 24 个高位将被忽略。
  即写入0~255范围的。
- void write(byte[] b)
  将 b.length 个字节从指定的 byte 数组写入此输出流。write(b) 的常规协定是：应该与调用 write(b, 0, b.length) 的效果完全相同。
- void write(byte[] b,int off,int len)
  将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
- public void flush()throws IOException
  刷新此输出流并强制写出所有缓冲的输出字节，调用此方法指示应将这些字节立即写入它们预期的目标。
- public void close() throws IOException
  关闭此输出流并释放与该流关联的所有系统资源。

1.文件输出流

2.打印流

3.数据输出刘

4.管道

5.对象序列化

### 四、字符流

#### 1. 输入流：Reader

- int read()
  读取单个字符。作为整数读取的字符，范围在 0 到 65535 之间 (0x00-0xffff)（2个字节的Unicode码），如果已到达流的末尾，则返回 -1
- int read(char[] cbuf)
  将字符读入数组。如果已到达流的末尾，则返回 -1。否则返回本次读取的字符数。
- int read(char[] cbuf,int off,int len)
  将字符读入数组的某一部分。存到数组cbuf中，从off处开始存储，最多读len个字符。如果已到达流的末尾，则返回 -1。否则返回本次读取的字符数。
- public void close() throws IOException
  关闭此输入流并释放与该流关联的所有系统资源

#### 2. 输入流：Writer

- void write(int c)
  写入单个字符。要写入的字符包含在给定整数值的 16 个低位中，16 高位被忽略。 即写入0 到 65535 之间的Unicode码。
- void write(char[] cbuf)
  写入字符数组。
- void write(char[] cbuf,int off,int len)
  写入字符数组的某一部分。从off开始，写入len个字符
- void write(String str)
  写入字符串。
- void write(String str,int off,int len)
  写入字符串的某一部分。
- void flush()
  刷新该流的缓冲，则立即将它们写入预期目标。
- public void close() throws IOException
  关闭此输出流并释放与该流关联的所有系统资源。
