package com.interview.base.day1;


/**
 * @author Alex
 * @since 2021/7/6 下午 10:11
 * <p>
 * </p>
 */
public class Sort {

    /**
     * 冒泡排序
     */

    public static void function(int[][] array) {

        for (int[] ints : array) {
            for (int i = 0; i < ints.length - 1; i++) {
                if (ints[i] > ints[i + 1]) {
                    int temp = ints[i + 1];
                    ints[i + 1] = ints[i];
                    ints[i] = temp;
                }

            }
        }

    }


    public static void main(String[] args) {

        int[][] array = new int[][]{{4, 5, 6, 8}, {2, 3}, {6, 1, 9}};

        function(array);

    }

}
