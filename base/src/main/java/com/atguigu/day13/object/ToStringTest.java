package com.atguigu.day13.object;


import com.atguigu.day13.entity.Customer;

import java.util.Date;

/**
 * @author Alex
 * @since 2021/12/17 3:32 下午
 * Object类中toString()的使用：
 * <p>
 * 1. 当我们输出一个对象的引用时，实际上就是调用当前对象的toString()
 * <p>
 * 2. Object类中toString()的定义：
 * public String toString() {
 * return getClass().getName() + "@" + Integer.toHexString(hashCode());
 * }
 * <p>
 * 3. 像String、Date、File、包装类等都重写了Object类中的toString()方法。
 * 使得在调用对象的toString()时，返回"实体内容"信息
 * <p>
 * 4. 自定义类也可以重写toString()方法，当调用此方法时，返回对象的"实体内容"
 */
public class ToStringTest {

    public static void main(String[] args) {

        Customer customer = new Customer("Alex", 28);
        //toString 方法已经被重写
        System.out.println(customer.toString());


        String s = new String("abc");
        //toString 方法已经被重写
        System.out.println(s.toString());

        Date date = new Date();
        //toString 方法已经被重写
        System.out.println(date.toString());

    }

}
