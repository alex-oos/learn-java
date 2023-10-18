package com.atguigu.day7;


/**
 * @author Alex
 * @since 2021/12/2 7:12 上午
 * <P>
 * <p>
 * * 数组中的常见异常：
 * * 1. 数组角标越界的异常：ArrayIndexOutOfBoundsExcetion
 * * 2. 空指针异常：NullPointerException
 * </p>
 */
public class ArrayException {

    public static void main(String[] args) {
        // 1. 数组角标越界的异常：ArrayIndexOutOfBoundsExcetion
        int[] arr1 = new int[]{1, 3, 4, 5};
        // System.out.println(arr1[5]);
        //   2. 空指针异常：NullPointerException


        // 	int[] arr1 = new int[]{1,2,3};
//		arr1 = null;
//		System.out.println(arr1[0]);

        //情况二：
//		int[][] arr2 = new int[4][];
//		System.out.println(arr2[0][0]);

        //情况三：
        String[] arr3 = new String[]{"AA", "BB", "CC"};
        arr3[0] = null;
        System.out.println(arr3[0]);


    }

}
