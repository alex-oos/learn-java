package com.atguigu.day7;


import java.util.Arrays;

/**
 * @author Alex
 * @since 2021/12/2 6:51 上午
 * <P>
 * java.util.Arrays:操作数组的工具类，里面定义了很多操作数组的方法
 *
 * </p>
 */
public class ArrayUtil {

    public static void main(String[] args) {

        //1.boolean equals(int[] a,int[] b):判断两个数组是否相等。
        int[] arr1 = new int[]{5, 2, 3, 4};
        int[] arr2 = new int[]{1, 2, 4, 3};
        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println(isEqual);
        //2.String toString(int[] a):输出数组信息。
        System.out.println(Arrays.toString(arr1));
        //3.void fill(int[] a,int val):将指定值填充到数组之中。
        Arrays.fill(arr2, 5);
        System.out.println(Arrays.toString(arr2));
        //4.void sort(int[] a):对数组进行排序。
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //5.int binarySearch(int[] a,int key)
        int[] arr3 = new int[]{-9, -8, 1, 3, 6, 10};
        int indexOf = Arrays.binarySearch(arr3, 5);
        if (indexOf > 0) {
            System.out.println(indexOf);
        } else {
            System.out.println("值没有找见");
        }
    }


}
