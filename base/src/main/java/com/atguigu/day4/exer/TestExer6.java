package com.atguigu.day4.exer;

/**
 * @Auther: 李将
 * @Date: 2020/5/16 下午 11:46
 * @Descprition:
 */
/*
6、编写程序FooBizBaz.java，从1循环到150并在每行打印一个值，
另外在每个3的倍数行上打印出“foo”,在每个5的倍数行上打印“biz”,
在每个7的倍数行上打印输出“baz”。
*/
public class TestExer6 {
    public static void main(String[] args) {
        for (int i = 1; i < 150; i++) {
            System.out.println("i = " + i);
            if (i % 3 == 0) {
                System.out.println("foo");
            }
            if (i % 5 == 0) {
                System.out.println("biz");
            }
            if (i % 7 == 0) {
                System.out.println("baz");
            }
        }
    }
}
