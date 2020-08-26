package com.atguigu.day2;

/**
 * @author: 唐凯泽
 * @since: 2020/5/5 15:20
 * @Descprition:
 */
/*
二、赋值运算符
1、基本赋值运算符：=
把=右边的值赋值给左边的变量。
右边的值有各种形式：
（1）常量值
（2）表达式的值
（3）方法（函数）调用的结果

2、扩展赋值运算符
+= ，-=，*=, /=， %= ，...
说明：前面的运算符与=之前不能有空格
注意：扩展赋值运算符要警惕它隐含了强转类型转换，有风险，可能溢出，和损失精度（总之，结果与预期不同）
*/
public class TestAssign {
    public static void main(String[] args) {
        int a = 10;
        int b = a + 10;
        double c = Math.random(); //产生一个随机数,范围在[0,1)
        System.out.println("c = " + c);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int aa = 10;
        int bb = 20;
        bb += a; //意思是： b = b +a;
        System.out.println("aa = " + aa);
        System.out.println("bb = " + bb);

        int cc = 2;
        int d = 5;
        cc *= d + 3;//意思是：c = c*(d+3);
        System.out.println("cc = " + cc);
        System.out.println("d = " + d);

        int f = 1;
        int e = 2;
        f += e++; // 意思是： f = f +e;e++;
        System.out.println("f = " + f);
        System.out.println("e = " + e);

        byte b1 = 127;
        byte b2 = 2;
        b2 += b1;//意思是：b2= (byte)(b1+b2);
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        int i = 1;
        i *= 0.1;//double被强制转成int  i = (int) (i * 0.1);

        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
    }
}
