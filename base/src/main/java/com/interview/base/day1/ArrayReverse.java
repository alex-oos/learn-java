package com.interview.base.day1;


import java.util.Arrays;
import java.util.Collections;

/**
 * @author: TangKaiZe
 * @since: 2021/7/7 上午 10:48
 * <p>
 * 数组反转
 * </p>
 */
public class ArrayReverse {

    public static void function(int[] a) {

        System.out.println("反转前的数组是：");
        for (int i : a) {
            System.out.print(i);
        }
        System.out.println();
        int[] b = new int[a.length];
        int j = a.length;
        for (int i = 0; i < a.length; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        System.out.println("反转后的数组是：");

        for (int i : b) {
            System.out.print(i);
        }
        System.out.println();
    }

    /**
     * 数组内取最大值，最小值
     *
     * @param
     */

    public static void arrayMax() {

        Integer[] numbers = {8, 2, 7, 1, 4, 9, 5};
        int min = Collections.min(Arrays.asList(numbers));
        int max = Collections.max(Arrays.asList(numbers));
        System.out.println("最小值: " + min);
        System.out.println("最大值: " + max);
    }

    /**
     * 重复元素
     */
    public static void findDuplicateInArray(int[] array) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("重复元素 : " + array[i]);
                count = 0;
            }

        }
    }

    public static void main(String[] args) {

        int[] array = new int[]{1, 4, 5, 6, 7, 7};
        function(array);
        arrayMax();
        findDuplicateInArray(array);
    }

}
