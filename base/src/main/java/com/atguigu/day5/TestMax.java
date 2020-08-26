package com.atguigu.day5;

import java.util.Scanner;

/**
 * @author: 李将
 * @since: 2020/5/19 下午 10:55
 * @Descprition:
 */
/*
数组的相关算法：
1、在数组中找最大值、最小值
*/
public class TestMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenth = scanner.nextInt();
        int[] array = new int[lenth];

        int max = 0;
        int min = 0;
        for (int i = 0; i < lenth; i++) {
            array[i] = scanner.nextInt();
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }

}
