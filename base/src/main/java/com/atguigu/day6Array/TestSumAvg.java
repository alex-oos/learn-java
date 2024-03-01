package com.atguigu.day6Array;

/**
 * @author Alex
 * @since 2020/5/19 下午 11:04
 * 
 */
/*
数组的相关算法：
1、找出最大值、最小值
2、找出最大值、最小值及其下标
3、求元素的总和和平均值
*/

import java.util.Scanner;

class TestSumAvg {

    public static void main(String[] args) {
        // 从键盘输入元素的值
        // n个整数
        //(1)声明一个数组
        int[] array;

        //(2)从键盘确定数组的长度
        Scanner input = new Scanner(System.in);
        System.out.print("请确定数组的长度：");
        int length = input.nextInt();

        //(3)初始化
        array = new int[length];

        //(4)为元素赋值，从键盘输入
        for (int i = 0; i < array.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个元素的值：");
            // 为元素赋值的格式：
            // 数组名[下标] = 值;
            array[i] = input.nextInt();
        }

        System.out.println("数组的元素有：");
        //(5)遍历数组
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //(6)求总和和平均值
		/*
		int sum = 0;
		for(int i=0; i<array.length; i++){
			sum += array[i];
		}
		System.out.println("总和是：" + sum + "，平均值是：" + (double)sum/array.length);
		*/
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("总和是：" + sum + "，平均值是：" + sum / array.length);
    }

}
