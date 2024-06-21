package com.atguigu.day12oop.exer6;

/**
 * @author Alex
 * @since 2024/6/17 下午4:40
 * <p></p>
 */
public class InstanceTest1 {

    public static void main(String[] args) {

        Base b1 = new Sub();
        b1.add(1, 2, 3);

        Sub s =(Sub) b1;
        s.add(1,2,3);

    }
}

class Base {

    public void add(int a, int... arr) {

        System.out.println("base");
    }

}

class Sub extends Base {


    public void add(int a, int[] arr) {

        System.out.println("sub_1");
    }

    // 当一个类中，有两个或多个，优先调用确定的参数方法，最后才调用可变参数方法
    public void add(int a, int b, int c) {

        System.out.println("sub_2");
    }

}
