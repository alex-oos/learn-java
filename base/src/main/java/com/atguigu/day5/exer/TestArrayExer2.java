package com.atguigu.day5.exer;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Alex
 * @date 2021/11/19 3:47 下午
 * <P>
 * 2. 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 * 成绩>=最高分-10    等级为’A’
 * 成绩>=最高分-20    等级为’B’
 * 成绩>=最高分-30    等级为’C’
 * 其余                               等级为’D’
 * <p>
 * 提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
 * </p>
 */
public class TestArrayExer2 {

    public static void main(String[] args) {
        //1、先使用scanner 输入学生的个数，读取学生个数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的个数：");
        int number = scanner.nextInt();

        //2、创建数组，存储学生的成绩：动态初始化
        double[] score = new double[number];
        double maxScore = 0;
        System.out.println("请输入" + number + "个学生的成绩：");

        for (int i = 0; i < score.length; i++) {
            score[i] = scanner.nextDouble();
            //4、对比，找到最大的分数
            if (maxScore < score[i]) {
                maxScore = score[i];
            }
        }
        //5.根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
        char level;

        for (int i = 0; i < score.length; i++) {
            if (maxScore - score[i] <= 10) {
                level = 'A';
            } else if (maxScore - score[i] <= 20) {
                level = 'B';
            } else if (maxScore - score[i] <= 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("student " + i + " score is " + score[i] + ",grade is " + level);

        }

    }

}
