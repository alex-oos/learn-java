package com.atguigu.day4.exam;

import java.util.Scanner;

/**
 * @author Alex
 * @since 2020/5/19 下午 9:28
 * 
 */
/*
5、使用循环实现如下功能，
从键盘不断输入正整数，输入0或负数结束，统计输入的正整数的个数，并求出最大值
*/
public class Exam5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int zheng = 0;
        int max = 0;

        //循环次数明确？起始值和终止值也不是很明确，一般这种情况下，不考虑for
        //哪些需要循环
        //怎么结束循环
        while(true){
            System.out.print("请输入正整数：");
            int num = input.nextInt();
            if(num<=0){
                break;
            }
            if(num>0){
                zheng ++;
            }
            max = max >= num ? max : num;
        }
        System.out.println("正数的个数：" + zheng +"，最大值是：" + max);
    }
}
