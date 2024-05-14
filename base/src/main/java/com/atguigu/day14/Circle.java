package com.atguigu.day14;

/**
 * @author Alex
 * @since 2023/9/13 下午3:43
 */
public class Circle {

    /**
     * 定了一个静态的变量，这个静态变量，在类加载的时候，就初始化好了，所以，这个变量，无论创建多少个对象，这个变量的值都是相同的。
     */
    public static String name = "这是一个圆";

    /**
     * 定义一个实例常量
     */
    private final double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    public static String getName() {

        return name;
    }

    public double findArea() {

        return Math.PI * this.radius * this.radius;
    }

    // static 变量不能使用this来引用
    @Override
    public String toString() {

        System.out.println("name: " + name + "  radius:" + this.radius);
        return null;
    }


}
