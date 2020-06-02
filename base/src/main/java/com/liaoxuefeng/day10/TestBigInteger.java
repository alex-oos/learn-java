package com.liaoxuefeng.day10;

import java.math.BigInteger;

/**
 * @Auther: 李将
 * @Date: 2020/6/2 15:32
 * @Descprition: BigInteger 用来模拟大整数， BigInteger内部用一个int[]数组来模拟一个非常大的整数：
 */
public class TestBigInteger {

    public static void main(String[] args) {
        BigInteger i1 = new BigInteger("1234567890");
        BigInteger i2 = new BigInteger("123213213123");
        BigInteger sum = i1.add(i2);
        System.out.println(sum);

        BigInteger n = new BigInteger("999999").pow(99);
        float f = n.floatValue();
        System.out.println(f);
    }

}
