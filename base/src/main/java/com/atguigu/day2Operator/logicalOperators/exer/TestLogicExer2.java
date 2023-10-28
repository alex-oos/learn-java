package com.atguigu.day2Operator.logicalOperators.exer;

/**
 * @author 唐凯泽
 * @since 2020/5/6 21:06
 * @Descprition:
 */
public class TestLogicExer2 {
    public static void main(String[] args) {
        int x = 1, y = 1;
        //&&左边：x==2，x++  false，x=2，
        //因为是短路与，而且左边已经是false，右边就不看了
        //false &&  ? 结果都为false
        if (x++ == 2 && ++y == 2) {
            x = 7;
        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

}
