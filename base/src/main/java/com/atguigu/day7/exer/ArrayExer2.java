package com.atguigu.day7.exer;


import java.util.Random;

/**
 * @author Alex
 * @since 2021/11/26 2:44 下午
 * <P>
 * 创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。同时，要求
 * 元素的值各不相同。
 * </p>
 */
public class ArrayExer2 {

    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(30);
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    i--;
                    break;
                }
            }


        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
