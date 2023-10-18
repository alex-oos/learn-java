package com.atguigu.day9.exam;


/**
 * @author Alex
 * @since 2022/1/20 8:20 上午
 * 要求：使用swap 方法 打印出 m = 100，n = 200
 */
public class ExamOne {


    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        swap(m, n);
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }
    //方法一：
    private static void swap(int m, int n) {
        m = m * 10;
        n = n * 10;
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.exit(0);
    }


}
