package com.atguigu.day6Array;


/**
 * @author Alex
 * @since 2021/11/26 3:00 下午
 * /*
 * 算法的考查：求数值型数组中元素的最大值、最小值、平均数、总和等
 * <p>
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
 * 然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
 * 要求：所有随机数都是两位数。
 * <p>
 * [10,99]
 * 公式：(int)(Math.random() * (99 - 10 + 1) + 10)
 */

public class ArrayTest1 {

    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
            sum += array[i];

        }
        System.out.println("总和是： " + sum);
        int maxSize = array[0];
        int minSize = array[0];

        for (int i = 0; i < array.length; i++) {
            if (maxSize < array[i]) {
                maxSize = array[i];
            }
            if (minSize > array[i]) {
                maxSize = array[i];
            }

        }
        System.out.println("minSize = " + minSize);
        System.out.println("maxSize = " + maxSize);
        int average = sum / array.length;
        System.out.println("average = " + average);

    }


}
