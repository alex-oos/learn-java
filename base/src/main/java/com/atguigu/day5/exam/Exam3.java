package com.atguigu.day5.exam;

import java.util.Scanner;

/**
 * @Auther: 李将
 * @Date: 2020/5/19 下午 8:46
 * @Descprition:
 */
/*3、使用循环实现如下功能
从键盘不断输入整数，统计偶数的个数和奇数的个数，输入0结束。
*/
public class Exam3 {
    public static void main(String[] args) {
        int ji = 0, oushu = 0;
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("请输入整数：");
            num = scanner.nextInt();

            if (num % 2 == 0) {
                oushu++;
            } else {
                ji++;
            }
        } while (num != 0);//如果为true，继续循环


        System.out.println("奇数的个数：" + ji);
        System.out.println("偶数的个数：" + oushu);
    }


}

