package com.atguigu.day7;


import java.util.Arrays;

/**
 * @author Alex
 * @since 2021/11/26 5:29 下午
 * <P>冒泡排序</p>
 */
public class BubbleSortTest {

    public static void main(String[] args) {
        int[] array = new int[10];
        //随机生成十个不重复的元素
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    i--;
                    break;
                }
            }
        }
        //进行冒泡排序
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }

}
