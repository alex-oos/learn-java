package com.atguigu.day2Operator.logicalOperators.exer;

/**
 * @autoer 唐凯泽
 * @since: 2020/5/6 21:09
 * @Descprition:
 */
public class TestLogicExer3 {
    public static void main(String[] args) {
        int x = 1, y = 1;

        //|的左边：x==1，x++，成立true，x=2
        //|逻辑或，右边继续
        //右边：++y, y==1, y=2,2==1不成立
        if (x++ == 1 | ++y == 1) {
            x = 7;
        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
