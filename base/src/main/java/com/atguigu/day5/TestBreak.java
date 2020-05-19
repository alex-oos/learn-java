package com.atguigu.day5;

import java.util.Scanner;

/**
 * @Auther: 李将
 * @Date: 2020/5/19 下午 10:28
 * @Descprition:
 */
public class TestBreak {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        do{
            System.out.println("------测试代码------");
            System.out.println("\t1、执行某功能");
            System.out.println("\t2、退出");

            System.out.print("请选择：");

            while(true){
                int num = input.nextInt();

                if(num==1){
                    System.out.println("........");
                    break;
                }else if(num==2){
                    System.out.print("是否真的退出？（Y/N）");
                    char confirm = input.next().charAt(0);
                    if(confirm=='Y' || confirm =='y'){
                        flag = false;
                        break;//结束内循环while
                    }
                }else{
                    System.out.println("只要1和2选项，重新选择：");
                }
            }

        }while(flag);
    }
}
