package com.liaoxuefeng.bObject.bCoreClass.eBigInteger;

import java.math.BigInteger;

/**
 * @author Alex
 * @Descprition: BigInteger 用来模拟大整数， BigInteger内部用一个int[]数组来模拟一个非常大的整数：
 * @since 2020/6/2 15:32
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
        // 转换成二进制
        String bit0 = n.toString(2);
        System.out.println("bit0 = " + bit0);
    }

}
