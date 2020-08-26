package com.atguigu.day6;

import java.util.Arrays;

/**
 * @author: 李将
 * @since: 2020/5/26 18:40
 * @Descprition:
 */
public class TestTwoArrays {
    public static void main(String[] args) {
        int[][] ns = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println(ns.length);
        int[] arr0 = ns[0];
        System.out.println("arr0.length = " + arr0.length);

        for (int[] arr : ns) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(ns));
    }
}
