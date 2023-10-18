package com.atguigu.day5.exer;


import java.util.Scanner;

/**
 * @autoer Alex
 * @since: 2020/5/19 下午 9:38
 * @Descprition:
 */
/*
从键盘输入本组学员的人数，本组学员的成绩。
用数组
 */
public class TestArrayExer1 {

    public static void main(String[] args) {
        //从键盘输入本组学员的人数
        Scanner input = new Scanner(System.in);
        System.out.print("请输入本组学员的人数：");
        int length = input.nextInt();

        //声明一个够长的数组
        int[] array = new int[length];

        //遍历求累加和，求最高分，最低分
        //思路：考虑特殊值
        //因为分数的范围[0,100]
        int max = -1;
        int min = 101;
        double sum = 0;

        //输入本组学员的成绩
        for (int i = 0; i < array.length; i++) {
            System.out.print("请输入第" + (i + 1) + "的学员的成绩：");
            array[i] = input.nextInt();

            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            sum += array[i];
        }
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("平均值是：" + sum / array.length);
    }

}
