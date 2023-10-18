package cn.leetcode.old.sort;


import java.util.Arrays;

/**
 * @author Alex
 * @since 2021/11/10 3:36 下午
 * <P>
 * 冒泡排序
 * </p>
 */
public class BubbleSort {

    //核心算法
    public static int[] solve(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array = new int[]{2, 8, 7, 9, 4, 1, 5, 0};
        int[] afterSortArray = solve(array);
        System.out.println("Arrays.toString(afterSortArray) = " + Arrays.toString(afterSortArray));

    }

}
