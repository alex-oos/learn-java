package com.liaoxuefeng.day10;

/**
 * @Auther: 李将
 * @Date: 2020/6/2 15:39
 * @Descprition: 常用的工具类
 * Math
 */
public class TestMath {
    public static void f() {
        // 求绝对值

        Math.abs(-100);// 100
        Math.abs(-7.8); // 7.8
        //取最大或最小值：
        Math.max(100, 99);
        Math.min(1.2, 2.3);
        //计算xy次方：
        Math.pow(2, 10);
        //计算√x：
        Math.sqrt(2);
        //计算ex次方：
        Math.exp(2);
        //计算以e为底的对数：
        Math.log(4);
        //计算以10为底的对数：
        Math.log10(100);
        // 三角函数：
        Math.sin(3.14);
        Math.cos(3.14);
        Math.tan(3.14);
        Math.asin(1.0);
        Math.acos(1.0);
        //Math还提供了几个数学常量：
        double pi = Math.PI;
        double e = Math.E;
        Math.sin(Math.PI / 6);
        //生成一个随机数x，x的范围是0 <= x < 1：
        Math.random(); // // 0.53907... 每次都不一样


    }

    public static long f1(double min, double max) {
        double x = Math.random();
        double y = x * (max - min) + min; // y的范围是[10,50)
        long n = (long) y; // n的范围是[10,50)的整数
        return n;
    }


    public static void main(String[] args) {
        long a = f1(10, 50);
        System.out.println("a = " + a);
    }
}
