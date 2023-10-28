package com.interview.base.day1;


import java.util.Arrays;

/**
 * @author Alex
 * @since 2021/7/6 下午 9:54
 * <p>
 * 数组排序以及元素查找
 * </p>
 */
public class TestArrayListSort {

    public static void function(int[] array) {

        Arrays.sort(array);
        printArray("排序后的结果是：", array);
        int i = Arrays.binarySearch(array, array[3]);
        System.out.println("查找到的元素是在" + i + "位置");
    }


    public static void printArray(String message, int[] array) {

        System.out.println(message + ": [length: " + array.length + "]");

        for (int i : array) {
            System.out.print(i);
        }
    }


    public static void main(String[] args) {

        int[] array = {3, 1, 4, 6, 8};
        function(array);
    }

}
