package com.atguigu.day13.wrapper;


/**
 * @author Alex
 * @since 2021/12/17 4:29 下午
 * 关于包装类使用的面试题
 */
public class InterviewTest {


    public static void test1() {

        Object o1 = (double) Integer.valueOf(1);
        System.out.println("o1 = " + o1);
    }

    public static void test2() {
        Object o2;
        if (true) o2 = Integer.valueOf(1);
        else o2 = new Double(2.0);
        System.out.println(o2);// 1

    }

    public static void test3() {
        Integer i = Integer.valueOf(1);
        Integer j = Integer.valueOf(1);
        System.out.println(i == j);//false

        //Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[],
        //保存了从-128~127范围的整数。如果我们使用自动装箱的方式，给Integer赋值的范围在
        //-128~127范围内时，可以直接使用数组中的元素，不用再去new了。目的：提高效率

        final Integer m = 1;
        final Integer n = 1;
        System.out.println(m == n);//true

        final Integer x = 128;//相当于new了一个Integer对象
        final Integer y = 128;//相当于new了一个Integer对象
        System.out.println(x == y);//false
    }

}
