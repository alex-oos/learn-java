package com.atguigu.day9.exer;


/**
 * @author Alex
 * @date 2021/12/8 6:31 下午
 * 1.编写程序，定义三个重载方法并调用。方法名为mOL。
 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。
 * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
 * 在主类的main ()方法中分别用参数区别调用三个方法。
 * 2.定义三个重载方法max()，
 * 第一个方法求两个int值中的最大值，
 * 第二个方法求两个double值中的最大值，
 * 第三个方法求三个double值中的最大值，
 * 并分别调用三个方法。
 */

public class OverloadExer {


    public static void main(String[] args) {
        OverloadExer overloadExer = new OverloadExer();
        overloadExer.mOl(1);
        overloadExer.mOl(1, 2);
        overloadExer.mOl("222");
        overloadExer.getMax(1, 2);
        overloadExer.getMax(1.0, 2.0);
        overloadExer.getMax(1.0, 2.0, 3.0);

    }
    private void mOl(int i) {
        System.out.println(1 * 1);
    }
    private void mOl(int i, int j) {
        System.out.println("i*j = " + i * j);
    }
    private void mOl(String s) {
        System.out.println("s = " + s);
    }
    private int getMax(int i, int j) {
        return (i > j) ? i : j;
    }
    private double getMax(double a, double b) {
        return (a > b) ? a : b;
    }
    private double getMax(double a, double b, double c) {
        double tmp = (a > b) ? a : b;
        return (tmp > c) ? tmp : c;
    }


}
