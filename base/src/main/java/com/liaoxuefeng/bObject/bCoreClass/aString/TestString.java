package com.liaoxuefeng.bObject.bCoreClass.aString;

import java.util.Arrays;

/**
 * @author: 李将
 * @since: 2020/5/28 17:21
 * @Descprition: String 常用的一些方法
 */
public class TestString {

    public static void main(String[] args) {
        String s1 = "hello";

        s1.charAt(1);
        System.out.println(s1.charAt(1));

        // 可以传入一个char[] 数组类型
        String s2 = new String(new char[]{'H', 'e'});

        s2.length();
        System.out.println("s2的长度为："+s2.length());

        String s3 = "hello";

        // 将字符串转化为小写
        String sLower= "HELLO".toLowerCase();

        // 将字符串转化为大写
        String sUpper = "hello".toUpperCase();

        System.out.println(s3 == sLower);
        //比较是否相等
        System.out.println(s3.equals(sLower));

        //与equals方法类型，忽略大小写
        System.out.println(s3.equalsIgnoreCase(sLower));


        // 比较是否包含
        System.out.println(s3.contains("11"));
        // 比较两个字符串的大小
        System.out.println(s3.compareTo("hello"));


        //搜索子串的更多的例子：
        System.out.println(s3.indexOf(1));
        System.out.println(s3.lastIndexOf(1));
        System.out.println(s3.startsWith("he"));
        System.out.println(s3.endsWith("lo"));

        // subString(int beginindex(),int endindex()),返回一个新字符串，从beginindex 截取到endinex
        System.out.println(s3.substring(2));
        System.out.println(s3.substring(2, 4));

        //去除首尾空白字符
        // 1.trim()去除 ，trim()并没有改变字符串的内容，而是返回了一个新字符串
        String str = " asdsad  ";
        System.out.println(str.trim());

        //String还提供了isEmpty()和isBlank()来判断字符串是否为空和空白字符串：

        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());

        // 正则表达式

        String s = "A,,B;C ,D";
        String c = s.replaceAll("[\\,\\;\\s]+", ",");
        System.out.println(c);

        //分割字符串
        String str11 = "A,B,C,D";
        String[] ss = str11.split("\\,");
        System.out.println(Arrays.toString(ss));

        //拼接字符串
        String[] arr = {"A", "B", "c", "D"};
        String sss = String.join("***", arr);
        System.out.println(sss);

        /*
        字符串提供了formatted()方法和format()静态方法，可以传入其他参数，替换占位符，然后生成新的字符串：
       几个占位符，后面就传入几个参数。参数类型要和占位符一致。我们经常用这个方法来格式化信息。常用的占位符有：
        %s：显示字符串；
        %d：显示整数；
        %x：显示十六进制整数；
        %f：显示浮点数*/
        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));
    }
}
