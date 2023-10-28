package com.atguigu.day5.exam;

/**
 * @author Alex
 * @since 2020/5/17 上午 6:38
 * @Descprition:
 */
/*
2、用循环打印如下图形
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/
public class Exam2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
