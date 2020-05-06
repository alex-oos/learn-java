package com.atguigu.day2;

class TestTypeChangeExer2 {
    public static void main(String[] args) {
        //int a = 5;
        //short s = a;//编译不通过

        //short  s = 5;//判断5这个常量数，是在short或byte等范围内，可以直接赋值。5识别为对应的类型
        //s = s-2;  //编译不通过

        //byte b = 3;
        //b = b + 4;                  //判断：编译不通过
        //b = (byte)(b+4);        //判断：可以

		/*
		char c = 'a';
		int  i = 5;
		float d = .314F;	//像浮点型，如果整数部分是0，可以省略0
		double result = c+i+d;     //判断：char + int + float*/

        byte b = 5;
        short s = 3;
//		short t = s + b;          //判断：编译不通过
    }
}