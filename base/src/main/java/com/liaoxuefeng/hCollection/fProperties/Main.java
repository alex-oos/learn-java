package com.liaoxuefeng.hCollection.fProperties;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

/**
 * @author Alex
 * @since 2020/6/14 下午 10:08
 * 
 */
public class Main {

    // 读取配置文件里面的配置
    /*使用Properties读取配置文件，
    1、 创建Properties实例：
    2、调用load()读取文件
    3、调用getProperty()获取到配置
    * */
    public static void function1() throws IOException {

        String f = "base/src/main/resources/setting.properties";
        Properties props = new Properties();
        props.load(new FileInputStream(f));
        String filePath = props.getProperty("last_open_file");
        String intervale = props.getProperty("auto_save_interval");
        System.out.println("filePath = " + filePath);
        System.out.println("intervale = " + intervale);

    }

    /*
     *从ClassPath 中读取.properties文件，load(InputStream)方法接收一个InputStream实例，不一定是文件流
     * */

    /*从内存读取一个字节流
     * */
    public static void function3() throws IOException {
        String settings = "# test" + "\n" + "course=Java" + "\n" + "last_open_since=2019-08-07T12:35:01";
        ByteArrayInputStream input = new ByteArrayInputStream(settings.getBytes(StandardCharsets.UTF_8));
        Properties props = new Properties();
        props.load(input);

        System.out.println("course: " + props.getProperty("course"));
        System.out.println("last_open_since: " + props.getProperty("last_open_since"));
        System.out.println("last_open_file: " + props.getProperty("last_open_file"));
        System.out.println("auto_save: " + props.getProperty("auto_save", "60"));

    }

    public static void function4() throws IOException {
        Properties props = new Properties();
        props.setProperty("url", "https://www.liaoxuefeng.com");
        props.setProperty("language", "java");
        props.store(new FileOutputStream("base/src/main/resources/setting.properties"), "这是写入的properties注释");

        props.load(new FileReader("base/src/main/resources/setting.properties", StandardCharsets.UTF_8));

        System.out.println("props.getProperty(\"url\") = " + props.getProperty("url"));


    }

/* 写入配置文件：
setProperty()修改了Properties实例，可以把配置写入文件，以便下次启动时获得最新配置。写入配置文件使用store()方法：
load(InputStream)默认总是以ASCII编码读取字节流，所以会导致读到乱码。我们需要用另一个重载方法load(Reader)读取：
* */

    public static void main(String[] args) throws IOException {
        function4();


    }

    public void function2() throws IOException {

        Properties properties = new Properties();
        properties.load(getClass().getResourceAsStream("base/src/main/resources/setting.properties"));
        System.out.println("properties.getProperty(\"open_file\") = " + properties.getProperty("open_file"));

    }


}
