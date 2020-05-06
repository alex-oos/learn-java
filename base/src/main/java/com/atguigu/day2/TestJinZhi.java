package com.atguigu.day2;

/*
在Java程序中可能会出现多种进制：
二进制：计算机所有数据都是二进制
	数字：0-1
	逢二进一
十进制：生活中，人更习惯十进制，结果显示都是十进制
	数字：0-9
	逢十进一
八进制：
	数字：0-7
	逢八进一
十六进制：
	数字：0-9，A(a)-F(f)
	逢十六进一

八进制和十六进制都是辅助表示二进制

1、在程序中如何表示某个数字是几进制的？
十进制：默认
二进制：数字前加0b或0B
八进制：数字前加0
十六进制：数字前加0X或0x

*/
class TestJinZhi {
    public static void main(String[] args) {
        //例1：
        System.out.println(10);//10
//		System.out.println(0b10);//2
        System.out.println(010);//8
        System.out.println(0x10);//16

//        System.out.println(0b1101);//1*2^3+1*2^2+0*2^1+1*2^0=8+4+0+1=13
    }
}