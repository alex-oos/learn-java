package com.atguigu.day2.logic.exer;

/**
 * @author: 唐凯泽
 * @since: 2020/5/6 21:04
 * @Descprition:
 */
public class TestLogicExer1 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        //&的左：x==2，x++，  false， x = 2，
        //&不是短路与，是逻辑与
        //右边继续
        //右边：++y, y==2， y=2， true
        //false & true 结果为false
        if (x++ == 2 & ++y == 2) {
            x = 7;
        }
        System.out.println("y = " + y);
        System.out.println("x = " + x);
    }
}
