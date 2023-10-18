package com.atguigu.day4.exer;

/**
 * @autoer Alex
 * @since: 2020/5/17 上午 12:04
 * @Descprition:
 */
public class TestExer10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {//9行
            //(1)打印该行的“等式”
            //第i行有i个等式
            //代入法：
            //当i=1,j=1，内循环1次
            //当i=5,j=1,2,3,4,5，内循环循环5次
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }

            //(2)换行
            System.out.println();

        }
    }
}
