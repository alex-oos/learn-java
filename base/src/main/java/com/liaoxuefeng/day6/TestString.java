package com.liaoxuefeng.day6;

/**
 * @Auther: 李将
 * @Date: 2020/5/28 17:21
 * @Descprition:
 */
public class TestString {
    public static void main(String[] args) {
        String s1 = "hello";

        String s2 = new String(new char[]{'H', 'e'});

        String s3 = "hello";
        String s4 = "HELLO".toLowerCase();
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        System.out.println(s3.contains("11"));
        System.out.println(s3.indexOf(1));
        System.out.println(s3.lastIndexOf(1));
        System.out.println(s3.startsWith("he"));
        System.out.println(s3.endsWith("lo"));

    }
}
