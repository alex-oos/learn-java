package com.atguigu.day6;


import java.util.Arrays;

/**
 * @author Alex
 * @since 2020/5/20 上午 12:00
 * 
 */
/*
数组的不同写法：了解
*/
class TestArrayOtherStyle{

    public static void main(String[] args){
        int[] array;//推荐写法


        // 声明数组元素，并且分配空间
        String[] arr = new String[5];
        arr[0] = "aa";
        arr[1] = "nn";
        arr[2] = "cc";
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));


//        //其他写法
//        int  []array;
//        int array[];

    }
}
