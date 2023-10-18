package com.liaoxuefeng.bObject.bCoreClass.eBigInteger;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @autoer Alex
 * @since: 2020/6/2 15:38
 * @Descprition:
 */
public class TestBIgDecimal {
    public static void main(String[] args) {
        BigDecimal d1 = new BigDecimal("123.456789");
        BigDecimal d2 = d1.setScale(4, RoundingMode.HALF_UP); // 四舍五入，123.4568
        BigDecimal d3 = d1.setScale(4, RoundingMode.DOWN); // 直接截断，123.4567
        System.out.println(d2);
        System.out.println(d3);
    }
}
