package com.atguigu.day9.util;


/**
 * @author Alex
 * @since 2021/12/9 10:49 上午
 * <P></p>
 */
public class ArrayPrintTest {

    public static void main(String[] args) {
        int[] intArray = new ArrayUtil().getArray(10);
        System.out.println(intArray);

        char[] charArray = new ArrayUtil().getCharArray(10);
        System.out.println(charArray);

    }

}
