package com.atguigu.day4.exer;

/**
 * @author: 李将
 * @since: 2020/5/17 上午 12:12
 * @Descprition:
 */
public class TestLoopNestExer {
    public static void main(String[] args){
        int i,j;
        for( i=1; i<=5; i++){//代表5行
            //(1)打印该行的*号
            //第一行：1个
            //第二行：2个
            //第i行：i个
			/*
			当i=1, j=1   第一轮
			当i=2，j=1,2  第二轮
			当i=3, j=1,2,3 第三轮
			当i=4, j=1,2,3,4 第四轮
			当i=5, j=1,2,3,4,5 第五轮
			当i=6  i<=5不成立结束外循环
			*/
            for( j=1; j<=i; j++){
                System.out.print("*");
            }

            //(2)换行
            System.out.println();
        }
    }
}
