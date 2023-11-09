package com.atguigu.day3;

/**
 * @author Alex
 * @since 2020/5/8 上午 12:02
 *
 */
/*
键盘输入
*/
//2、导入
import java.util.Scanner;

class TestInput{
    public static void main(String[] args){
        //1、先准备Scanner的变量，理解为,Scanner是键盘输入的工具
        Scanner s = new Scanner(System.in);//System.in键盘输入，System.out往控制台输出

        //3、开始输入
		/*
		System.out.print("请输入一个整数：");
		int num = s.nextInt();
		System.out.println("您输入的整数是：" + num);

		System.out.print("请输入一个小数：");
		double d = s.nextDouble();
		System.out.println("您输入的小数是：" + d);

		System.out.print("请输入一个长整数：");
		long bigNum = s.nextLong();
		System.out.println("您输入的长整数是：" + bigNum);

		System.out.print("请输入一个字符串：");
		String str = s.next();
		System.out.println("您输入的字符串是：" + str);

		System.out.print("请输入一个布尔值：");
		boolean b = s.nextBoolean();
		System.out.println("您输入的字符串是：" + b);
		*/
        System.out.print("请输入一个字符：");
        char c = s.next().charAt(0);//只能从一串字符串中取一个，取第几个，例如，取第一个，charAt(0)
        System.out.println("您输入的字符串是：" + c);
    }
}
