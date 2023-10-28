package com.atguigu.day4.exer;

import java.util.Scanner;

/**
 * @author Alex
 * @since 2020/5/16 下午 11:51
 * @Descprition:
 */
/*
输入两个正整数m和n，求其最大公约数和最小公倍数
*/
public class TestExer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入m的值");
        int m = scanner.nextInt();
        System.out.println("请输入n的值");
        int n = scanner.nextInt();

        //公约数：这个数能同时把m和n整除，或者说m和n能同时被这个数整除
        System.out.print(m + "," + n + "的最大公约数是：");
        int yue = 0;
        for (int i = m; i >= 1; i--) {
            //判断i是否是m和n的公约数
            if (m % i == 0 && n % i == 0) {
                System.out.println(i);
                yue = i;
                break;
            }
        }

        //System.out.print(m+","+n+"的最小公倍数是：" + m*n/yue);


        //公倍数：这个数能同时被m和n整除
        System.out.print(m + "," + n + "的最小公倍数是：");
        for (int i = n; i <= m * n; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
