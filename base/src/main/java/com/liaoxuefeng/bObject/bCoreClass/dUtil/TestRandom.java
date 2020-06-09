package com.liaoxuefeng.bObject.bCoreClass.dUtil;

import java.util.Random;

/**
 * @Auther: 李将
 * @Date: 2020/6/2 15:51
 * @Descprition:
 */
public class TestRandom {
    public static void f() {
        Random r = new Random();
        r.nextInt(); // 2071575453,每次都不一样
        r.nextInt(10); // 5,生成一个[0,10)之间的int
        r.nextLong(); // 8811649292570369305,每次都不一样
        r.nextFloat(); // 0.54335...生成一个[0,1)之间的float
        r.nextDouble(); // 0.3716...生成一个[0,1)之间的double
    }

    public static void f1() {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println("r.nextInt(100) = " + r.nextInt(100));
        }
    }

    public static void main(String[] args) {
        f1();
    }
}
