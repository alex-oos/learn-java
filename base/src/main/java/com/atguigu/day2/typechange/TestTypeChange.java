package com.atguigu.day2.typechange;

/*
基本数据类型：
1、自动类型转换
byte,short,char -> int -> long -> float -> double
(1)存储范围小的数据类型 与 存储范围大的数据类型 进行运算（算术运算，赋值运算）时，
   存储范围小的数据类型会自动转成存储范围大的数据类型。
(2)byte,short,char之间进行算术运算，就会自动升级为int。
(3)boolean不与任何类型转换
(4)所有类型凡是和String进行拼接，结果都变成了字符串

2、强制类型转换
byte,short,char <- int <- long <- float <- double
强制类型转换符()
(1)存储范围大的数据类型 赋值 给存储范围小的数据类型的变量，需要强制类型转换。
(2)强制类型转换有风险：溢出或损失精度
(3)boolean类型不可以转换为其它的数据类型。
*/
class TestTypeChange {
    public static void main(String[] args) {
        //例1：
		/*
		byte b = 12;
		int i = b;//把b变量中的值赋值（复制）给i变量

		double d = b;
		System.out.println("d = " + d);
		*/

        //例2：
		/*
		byte b1 = 1;
		byte b2 = 2;
		//byte b3 = b1 + b2;//右边byte和byte运算会自动升级为int
		//System.out.println("b3 = " + b3);

		short s1 = 1;
		short s2 = 2;
		//short s3 = s1 + s2;
		//System.out.println("s3 = " + s3);

		char c1 = '0';//ASCII值48
		char c2 = '1';//ASCII值49
		//char c3 = c1 + c2;
		int c3 = c1 + c2;
		System.out.println("c3 = " + c3);

		byte b = 1;
		short s = 2;
		short sum = b + s;
		*/

        //例3：
		/*
		char c1 = '0';
		char c2 = '1';
		System.out.println(c1 + c2);//这里进行的是算术运算的求和
		System.out.println("c1 + c2的和是：" + c1 + c2);
		//"c1 + c2的和是：" + c1先运算，拼接，结果是"c1 + c2的和是：0"，是字符串
		//"c1 + c2的和是：0" + c2再运算，拼接，结果是"c1 + c2的和是：01"，是字符串

		System.out.println(c1 + "" + c2);
		System.out.println("c1 + c2的和是：" + (c1 + c2));
		*/

        char c1 = '0';//ASCII值48
        char c2 = '1';//ASCII值49
        //char c3 = c1 + c2;//右边自动升级为int，左边是char
        char c3 = (char) (c1 + c2);//把c1+c2的运算结果，强制转换为char类型
        System.out.println("c3 = " + c3);

        double d = 3.1415926567844;
        float f = (float) d;
        System.out.println("f = " + f);
    }
}
