package com.atguigu.day2Operator;

/**
 * @author 唐凯泽
 * @since 2020/5/4 11:09
 *
 */
/*
 * 在java中的运算符
 * 一、算术运算符
 * 加、减、乘，除,取余（取余）： +,-,*,/,%
 * 除法：如果两个证书相除，结果只保留整数部分
 * 取余： 模数的符号被忽略
 *        被模数%模数
 * 2、正号、负号： + ，-
 * 运算符：一元运算符，二元运算符，三元运算符
 * 根据需要的操作数的不同
 * 3、+ 如果有一边是字符串，都是字符串拼接
 * 4、自增
 *   i++   先 取出i的值，参与别的运算，然后a再自增1
 *   ++i·   先运算a的自增，然后用i自增的结果i自增的结果在参与别的运算
 * */
public class TestArithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("sum=" + sum);
        System.out.println("sum = " + (a + b));
        System.out.println("乘积是：" + a * b);

        double c = 10;
        double d = 20;
        System.out.println("商是：" + c / d);

        int e = 10;
        int f = 3;

        System.out.println("余数= " + e % f);
        System.out.println("余数= " + 1 % 3);
        System.out.println("余数= " + -5 % -2);
        System.out.println("余数= " + e % f);

        int aa = 10;
        int bb = -aa;
        System.out.println(bb);

        int aaa = 1;
        int bbb = ++aaa; // a 称为 自增变量，对于a来说，a要自增1，b= ++a 的意思是将a自增后的结果赋值给b
        System.out.println("aaa = " + aaa);
        System.out.println("bbb = " + bbb);

        int aaaa = 1;
        int bbbb = aaaa++; //a称为自增变量，对于a来说，a要自增1，b=a++的意思是，先把a的结果赋值给b，在a++自增
        System.out.println("aaaa = " + aaaa);
        System.out.println("bbbb = " + bbbb);


        int aaaaa = 1;
        int bbbbb = --aaaaa;
        System.out.println("aaaaa = " + aaaaa);
        System.out.println("bbbbb = " + bbbbb);
        int cccc = aaaaa--;
        System.out.println("cccc = " + cccc);

        /*
         * 面试题
         * */
        int i = 1;
        i = i++;
        System.out.println("i = " + i);
        i = ++i;
        System.out.println("i = " + i);


    }
}
