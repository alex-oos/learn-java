package com.atguigu.day13.wrapper;


/**
 * @author Alex
 * @date 2021/12/17 3:41 下午
 * 包装类的使用:
 * 1.java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
 * 2.掌握的：基本数据类型、包装类、String三者之间的相互转换
 */
public class WrapperTest {

    public static void method(Object obj) {
        System.out.println(obj);
    }
    //基本数据类型、包装类--->String类型：调用String重载的valueOf(Xxx xxx)
    public static void test4() {

        final int num1 = 10;
        //方式1：连接运算
        final String str1 = num1 + "";
        //方式2：调用String的valueOf(Xxx xxx)
        final float f1 = 12.3f;
        String str2 = String.valueOf(f1);//"12.3"

        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str2);
        System.out.println(str3);//"12.4"

    }
    //包装类--->基本数据类型:调用包装类Xxx的xxxValue()
    public static void test2() {
        Integer in1 = new Integer(12);

        int i1 = in1.intValue();
        System.out.println(i1 + 1);


        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2 + 1);
    }
    //基本数据类型 --->包装类：调用包装类的构造器

    public static void test1() {

        final int num1 = 10;
//		System.out.println(num1.toString());
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());

        Integer in2 = new Integer("123");
        System.out.println(in2.toString());

        //报异常
//		Integer in3 = new Integer("123abc");
//		System.out.println(in3.toString());

        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f1);
        System.out.println(f2);

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("TrUe");
        System.out.println(b2);
        Boolean b3 = new Boolean("true123");
        System.out.println(b3);//false


        Order1 order = new Order1();
        System.out.println(order.isMale);//false
        System.out.println(order.isFemale);//null
    }
    /*
     * JDK 5.0 新特性：自动装箱 与自动拆箱
     */

    public static void test3() {
//		int num1 = 10;
//		//基本数据类型-->包装类的对象
//		method(num1);

        //自动装箱：基本数据类型 --->包装类
        final int num2 = 10;
        final Integer in1 = num2;//自动装箱

        final boolean b1 = true;
        final Boolean b2 = b1;//自动装箱

        //自动拆箱：包装类--->基本数据类型
        System.out.println(in1.toString());

        final int num3 = in1;//自动拆箱

    }
    //String类型 --->基本数据类型、包装类：调用包装类的parseXxx(String s)

    public static void test5() {
        final String str1 = "123";
        //错误的情况：
//		int num1 = (int)str1;
//		Integer in1 = (Integer)str1;
        //可能会报NumberFormatException
        int num2 = Integer.parseInt(str1);
        System.out.println(num2 + 1);

        final String str2 = "true1";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
    }

}

class Order1 {

    boolean isMale;

    Boolean isFemale;

}



