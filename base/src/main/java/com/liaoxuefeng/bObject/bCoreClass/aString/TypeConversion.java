package com.liaoxuefeng.bObject.bCoreClass.aString;


import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * @Auther: 李将
 * @Date: 2020/5/28 21:13
 * @Descprition:
 */
public class TypeConversion {
    public static void main(String[] args) {
        //要把任意基本类型或引用类型转换为字符串，可以使用静态方法valueOf()。这是一个重载方法，编译器会根据参数自动选择合适的方法：
        String.valueOf(123);
        String.valueOf(46.23);
        String.valueOf(true);
        String.valueOf(new Object());

        //要把字符串转换为其他类型，就需要根据情况。例如，把字符串转换为int类型：
        int n1 = Integer.parseInt("123");
        int n2 = Integer.parseInt("ff", 16);

        //把字符串转换为boolean类型：
        boolean b1 = Boolean.parseBoolean("true");
        boolean b2 = Boolean.parseBoolean("FALSE");

        //Integer有个getInteger(String)方法，它不是将字符串转换为int，而是把该字符串对应的系统变量转换为Integer：

        Integer.getInteger("java.version");
        System.out.println(Integer.getInteger("java.version"));

        //字符串转化为int型
        String a = "122345";
        System.out.println(Integer.parseInt(a));


        //String和char[]类型可以互相转换，方法是：
        char[] cs = "hello".toCharArray();
        String s = new String(cs);

        byte[] b4 = "Hello".getBytes(); // 按系统默认编码转换，不推荐
        byte[] b5 = "Hello".getBytes(StandardCharsets.UTF_8); // 按UTF-8编码转换
        try {
            byte[] b6 = "Hello".getBytes("GBK"); // 按GBK编码转换
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        byte[] b3 = "Hello".getBytes(StandardCharsets.UTF_8); // 按UTF-8编码转换

 /*       Java字符串String是不可变对象；

        字符串操作不改变原字符串内容，而是返回新字符串；

        常用的字符串操作：提取子串、查找、替换、大小写转换等；

        Java使用Unicode编码表示String和char；

        转换编码就是将String和byte[]转换，需要指定编码；

        转换为byte[]时，始终优先考虑UTF-8编码。*/


    }
}
