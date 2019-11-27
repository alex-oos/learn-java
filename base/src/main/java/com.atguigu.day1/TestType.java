package com.atguigu.day1;

/**
 * @Auther: 唐凯泽
 * @Date: 2019/11/24
 * @Descprition:
 * 1、基本数据类型 8种
 * 1）整型：
 * byte： 字节类型     1个字节    -128~127
 * short:  短整型      2个字节
 * int :  整型        4个字节     默认类型
 * long: 长整型       8个字节
 * 2)浮点型：  不精确的 ，可以表示小数
 * float:   单精度浮点型    4 个字节
 *         精度：小数点后大约6-7位
 * double:      双精度浮点型    8个字节
 *          精度：小数点后15位-17位
 * 3)字符型
 * char：   2个字节，可以存储一个汉字
 *   第一种形式：单引号中有且只能有一个字符
 *     例如： '尚'，'a'
 *     第二种形式：
 *     例如：转义字符 '\n' '\t'  '\b'
 *     第三种形式：
 *     unicode 编码值向下兼容，兼容最早的ASCII码，最早一共128个，
 *     特殊的几个：A ，65，B 66.....
 *                 a   97
 *
 *
 *
 * 4）布尔型
 * boolean    true  false
 * 2、引用数据类型：类、接口、数组、枚举........
 * 例如： String、System、Math、Date这些都是类
 *
 * 计算机最小的存储单位是bit，比特，位
 * 计算机最基本的存储单位是byte，字节。 1个字节 = 8位
 * 1kb ： 1024byte
 * 1mb ： 1024kb
 * 1gb : 1024mb
 * 1tb : 1024gb
 */
public class TestType {

    public static void main(String[] args) {

        short a = 1;
        System.out.println(a);

        int  b = 2;
        System.out.println(b);

        long c = (long) 1234567890.123245466;
        System.out.println(c);

        float d = 1.2F;
        System.out.println(d);

        double e = 10.12;
        System.out.println(e);

        char f = '尚';

        System.out.println("char f 的变量是" + c);

        char c1 = 'a';// a通过asc码转换为字符，数字是97
        System.out.println("字符c1的变量是" + c1);

        char n = '\n';

        System.out.println("n=" + n);
        System.out.println("over\n");

        System.out.println("over\t bye");


    }


}
