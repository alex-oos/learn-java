package com.atguigu.day2Operator;

/**
 * @author 唐凯泽
 * @since 2020/5/5 15:02
 *
 */
/*
练习:
随意给出一个整数，打印显示它的个位数，十位数，百位数的值。
格式如下：
数字xx的情况如下：
个位数：
十位数：
百位数：
例如：
数字153的情况如下：
个位数：3
十位数：5
百位数：1
*/
public class TestBaishiGe {
    public static void main(String[] args) {
        int num = 153;

        System.out.println("数字" + num + "的情况如下：");
        System.out.println("个位数：" + num % 10);

        //方式一：先取出15，再取出5， num/10结果是15，15%10是5
        System.out.println("十位数：" + num / 10 % 10);

        //方式二：先取出53，再取出5,num%100结果是53， 53/10结果是5
        System.out.println("十位数：" + num % 100 / 10);

        System.out.println("百位数：" + num / 100);//整数与整数相除，只保留整数部分

    }
}
