package com.atguigu.day4.exer;

import java.util.Scanner;

/**
 * @Auther: 李将
 * @Date: 2020/5/16 下午 7:00
 * @Descprition:
 */
/*
4、随机生成一个100以内的数，猜数字游戏
从键盘输入数，如果大了提示，大了，如果小了，提示小了，如果对了，就不再猜了，并统计一共猜了多少次
Math.random():[0,1)
Math.random*100:[0,100)100内存
(int)(Math.random*100)

提示：随机数
import java.util.Random;
Random rand = new Random();
int num= rand.nextInt(100);
*/
public class TestExer4 {
    public static void main(String[] args) {

        //随机生成一个100以内的数
        int num = (int)(Math.random()*100);

        Scanner input = new Scanner(System.in);

        //需要重复的代码：
        //不断的输入整数，去猜
        //统计猜了几次
        int count = 0;
		/*
		boolean flag = true;//循环的条件

		while(flag){
			System.out.print("猜数：");
			int cai = input.nextInt();
			count++;
			if(cai == num){
				flag = false;//循环终止
				System.out.println("猜对了");
			}else if(cai > num){
				System.out.println("大了");
			}else if(cai < num){
				System.out.println("小了");
			}
		}
		*/

        while(true){
            System.out.print("猜数：");
            int cai = input.nextInt();
            count++;
            if(cai == num){
                System.out.println("猜对了");
                break;
            }else if(cai > num){
                System.out.println("大了");
            }else if(cai < num){
                System.out.println("小了");
            }

        }
        System.out.print("一共猜了" + count + "次");

    }
}


