package com.atguigu.day9.util;


import java.util.Arrays;

/**
 * @author Alex
 * @since 2021/12/8 5:52 下午
 * <P></p>
 */
public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = util.getArray(20);
        System.out.println("最大值是："+util.getMax(arr));
        System.out.println("最小值是："+util.getMin(arr));
        System.out.println("排序前："+Arrays.toString(util.reverse(arr)));
        System.out.println("排序后："+ Arrays.toString(util.sort(arr)));
        System.out.println("数组反转是："+Arrays.toString(util.reverse(arr)));

    }


}
