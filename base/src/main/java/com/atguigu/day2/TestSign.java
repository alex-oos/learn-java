package com.atguigu.day2;

/**
 * @author: 唐凯泽
 * @since: 2020/5/5 14:54
 * @Descprition:
 */
public class TestSign {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;

        int i = i1++; // i1 的值先赋值给1，然后i1再自增1
        System.out.println("i = " + i);
        System.out.println("i1 = " + i1);

        i = ++i1; //
        System.out.println("i = " + i);
        System.out.println("i1 = " + i1);

        i = i2--;
        System.out.println("i = " + i);
        System.out.println("i2 = " + i2);

        i = --i2;
        System.out.println("i = " + i);
        System.out.println("i2 = " + i2);

    }
}
