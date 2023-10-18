package com.atguigu.day2Operator;

/*
五、条件运算符：唯一的三元运算符
语法格式：
	条件表达式 ？ 表达式1 : 表达式2

说明：
（1）条件表达式必须是一个boolean结果的表达式
（2）如果条件表达式为true，整个表达式的结果就取表达式1的结果，否则就取表达式2的结果
*/
class TestCondition {
    public static void main(String[] args) {
		/*
		boolean flag = false;

		System.out.println(flag ? "柴老师是大美女" : "柴老师是大大美女");
		*/

		/*
		int a = 1;
		//如果a==1成立，右边整个表达式就取a+1的值，否则就取a+3的值
		//把右边整个表达式的值再赋值给b
		int b = a == 1 ? a + 1 : a + 3;
		System.out.println("b = " + b);//2
		*/

        //找出a和b中的较大者赋值给c
        int a = 2;
        int b = 4;
        int c = a >= b ? a : b;
        System.out.println("c = " + c);

    }
}
