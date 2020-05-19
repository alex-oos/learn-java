package com.atguigu.day4;


/*

break可以用于结束当前循环

break的用法：
（1）在switch中表示结束switch
（2）break在循环中，表示结束当前循环
*/

import java.util.Scanner;

class TestBreak{
	public static void main(String[] args){
		//从键盘不断输入整数，统计正数、负数的个数，输入0结束
		Scanner input = new Scanner(System.in);

		int zheng = 0;
		int fu = 0;

		while(true){
			System.out.println("请输入一个整数：");
			int num = input.nextInt();

			if(num>0){
				zheng++;
			}else if(num<0){
				fu++;
			}else{//num==0
				break;
			}
		}

		System.out.println("正数的个数：" + zheng);
		System.out.println("负数的个数：" + fu);
	}
}