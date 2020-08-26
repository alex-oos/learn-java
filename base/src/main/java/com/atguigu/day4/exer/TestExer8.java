package com.atguigu.day4.exer;

import java.util.Scanner;

/**
 * @author: 李将
 * @since: 2020/5/17 上午 12:13
 * @Descprition:
 */
/*
7、赌数游戏：随机产生3个1-6的整数，如果三个数相等，那么称为“豹子”，
如果三个数之和大于9，称为“大”，如果三个数之和小于等于9，称为“小”，
用户从键盘输入押的是“豹子”、“大”、“小”，并判断是否猜对了

Math.random() --> [0,1)
Math.random()* 6 --> [0,6)
Math.random() * 6 + 1 --> [1,7)  相当于  [1,6]
(int) (Math.random() * 6 + 1)
*/
public class TestExer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = (int) ((Math.random() * 6) + 1);
        int num2 = (int) (Math.random() * 6 + 1);
        int num3 = (int) (Math.random() * 6 + 1);
        String result;

        if(num1 == num2 && num2 == num3){
            result = "豹子";
        }else if(num1 + num2 + num3 >9){
            result = "大";
        }else{
            result = "小";
        }

        Scanner input = new Scanner(System.in);
        System.out.print("请押宝：（大、小、豹子）");
        String cai = input.next();

        System.out.println("三个数是：" + num1 + "," + num2 + "," + num3);
        if(cai.equals(result)){
            System.out.print("猜对了");
        }else{
            System.out.print("猜错了");
        }

    }
}
