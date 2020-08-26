package com.atguigu.day4.exer;

import java.util.Scanner;

/**
 * @author: 李将
 * @since: 2020/5/16 下午 6:05
 * @Descprition:
 */
/*
4、随机生成一个100以内的数，猜数字游戏
从键盘输入数，如果大了提示，大了，如果小了，提示小了，如果对了，就不再猜了，并统计一共猜了多少次
Math.random():[0,1)
Math.random()*100:[0,100)100内存
(int)(Math.random()*100)
*/
public class TestDoWhileExer {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 100);

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        do {
            System.out.println("你猜：");
            int cai = scanner.nextInt();
            count++;
            if(cai>num){
                System.out.println("大了");
            }else if(cai < num){
                System.out.println("小了");
            }else{
                break;
            }

        }
        while (true);
        System.out.println("猜对了，一共猜了" + count + "次");
    }

}
