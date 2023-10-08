package com.atguigu.day4;

import java.util.Scanner;

/*
while循环
语法结构：
while(循环条件){
	循环体：需要重复执行的语句块
}

执行过程：
（1）先上来就判断循环条件
（2）如果条件成立，就执行循环体
（3）回到（1）
（4）直到循环条件不成立结束

循环的四个要素：
（1）循环变量的初始化
（2）循环条件
（3）循环体
（4）迭代表达式：用于修改循环变量的值

for循环比较适用于：起点和终点比较明显，例如1-100，具体多少次，3000米到5米
while循环，适用于，循环条件明显，次数不确定不固定
*/

class TestWhile {

    public static void main(String[] args) {
        // 从键盘不断输入整数，统计正数、负数的个数，输入0结束
        Scanner input = new Scanner(System.in);

        System.out.println("请输入一个整数：");
        int num = input.nextInt();

        int zheng = 0;
        int fu = 0;

        while (num != 0) {
            if (num > 0) {
                zheng++;
            } else if (num < 0) {
                fu++;
            }

            System.out.println("请输入一个整数：");
            num = input.nextInt();
        }

        System.out.println("正数的个数：" + zheng);
        System.out.println("负数的个数：" + fu);
    }

}
