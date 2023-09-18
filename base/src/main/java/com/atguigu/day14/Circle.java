package com.atguigu.day14;

/**
 * @author: Alex
 * @date: 2023/9/13 下午3:43
 * @Descprition:
 */
public class Circle {

    public static String name = "这是一个圆";

    private final double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    public static String getName() {

        return name;
    }

    public double findArea() {

        return Math.PI * radius * radius;
    }

    public void display() {

        System.out.println("name: " + name + "  radius:" + radius);
    }


}
