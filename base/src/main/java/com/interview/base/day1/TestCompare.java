package com.interview.base.day1;


/**
 * @author Alex
 * @since 2021/7/6 下午 9:35
 * <p>
 * 字符串比较
 * </p>
 */
public class TestCompare {


    public static void function(String a, String b) {

        Object objStr = a;

        System.out.println("a.compareTo(b) = " + a.compareTo(b));
        // 忽略大小写
        System.out.println("a.compareToIgnoreCase(b) = " + a.compareToIgnoreCase(b));
        System.out.println("a.compareTo(b) = " + a.compareTo(objStr.toString()));

    }

    public static void main(String[] args) {

        String stA = "hello World";
        String strB = "hello World!";
        function(stA, strB);
    }

}
