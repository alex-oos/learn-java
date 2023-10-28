package com.atguigu.day1;

/**
 * @author 唐凯泽
 * @since 2019/11/24
 * @Descprition: 1、基本数据类型 8种
 * 1）整型：
 * byte： 字节类型     1个字节    -128~127
 * short:  短整型      2个字节
 * int :  整型        4个字节     默认类型
 * long: 长整型       8个字节
 * 2)浮点型：  不精确的 ，可以表示小数
 * float:   单精度浮点型    4 个字节
 * 精度：小数点后大约6-7位
 * double:      双精度浮点型    8个字节
 * 精度：小数点后15位-17位
 * 3)字符型
 * char：   2个字节，可以存储一个汉字
 * 第一种形式：单引号中有且只能有一个字符
 * 例如： '尚'，'a'
 * 第二种形式：
 * 例如：转义字符 '\n' '\t'  '\b'
 * 第三种形式：
 * unicode 编码值向下兼容，兼容最早的ASCII码，最早一共128个，
 * 特殊的几个：A ，65，B 66.....
 * a   97
 * <p>
 * <p>
 * <p>
 * 4）布尔型
 * boolean    true  false
 * 2、引用数据类型：类、接口、数组、枚举........
 * 例如： String、System、Math、since这些都是类
 * <p>
 * 计算机最小的存储单位是bit，比特，位
 * 计算机最基本的存储单位是byte，字节。
 * 1个字节 = 8位
 * 1kb ： 1024byte
 * 1mb ： 1024kb
 * 1gb : 1024mb
 * 1tb : 1024gb
 */
public class DataType {

    public static void main(String[] args) {
        //整型： byte short int long
        byte a1 = 127;
        System.out.println("基本数据类型byte：" + a1);
        System.out.println("基本类型： " + Byte.SIZE);
        System.out.println("Byte.SIZE = " + Byte.MIN_VALUE);
        System.out.println("Byte.SIZE = " + Byte.MAX_VALUE);

        short a = 1;
        System.out.println(a);
        System.out.println("基本数据类型short: = " + a);
        System.out.println("基本数据类型short: = " + Short.SIZE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);

        int b = 2;
        System.out.println(b);
        System.out.println("基本类型 Integer 二进制位数 " + Integer.SIZE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        long c = (long) 1234567890.123245466;
        System.out.println(c);
        System.out.println("基本类型 Long 二进制位数 " + Long.SIZE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);

        //浮点型： float double
        float d = 1.2F;
        System.out.println(d);
        System.out.println("基本类型 Float 二进制位数 " + Float.SIZE);
        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);
        System.out.println("Float.MIN_VALUE =" + Float.MAX_VALUE);

        double e = 10.12;
        System.out.println(e);
        System.out.println("基本类型 Double 二进制位数 " + Double.SIZE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);

        //字符型：char
        //存储一个汉字
        char f = '尚';
        System.out.println("char f 的变量是" + f);
        System.out.println("基本类型 char 二进制位数" + Character.SIZE);
        System.out.println(" Character.MIN_VALUE" + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE " + Character.MAX_VALUE);
        //存储一个字母
        char c1 = 'a';// a通过asc码转换为字符，数字是97
        System.out.println("字符c1的变量是" + c1);
        //存储转义字符
        char n = '\n';
        System.out.println("n=" + n);
        System.out.println("over\n");
        System.out.println("n = " + n);
        // 布尔类型：boolean
        boolean flag = false;
        System.out.println("flag = " + flag);
        System.out.println("Boolean = " + Boolean.TYPE);
    }


}
