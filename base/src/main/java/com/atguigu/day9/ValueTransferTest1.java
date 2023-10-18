package com.atguigu.day9;


/**
 * @author Alex
 * @since 2021/12/9 3:56 下午
 * /*
 * 方法的形参的传递机制：值传递
 * <p>
 * 1.形参：方法定义时，声明的小括号内的参数
 * 实参：方法调用时，实际传递给形参的数据
 * <p>
 * 2.值传递机制：
 * 如果参数是基本数据类型，此时实参赋给形参的是实参真实存储的数据值。
 * 如果参数是引用数据类型，此时实参赋给形参的是实参存储数据的地址值。
 */
public class ValueTransferTest1 {

    public static void main(String[] args) {

        int m = 10;
        int n = 20;
        System.out.println("m = " + m + ", n = " + n);

        ValueTransferTest1 v = new ValueTransferTest1();
        v.swap(m, n);

        System.out.println("交换后");
        System.out.println("m = " + m + "  n=" + n);
    }

    public void swap(int m, int n) {
        int tmp = m;
        m = n;
        n = tmp;


    }


}
