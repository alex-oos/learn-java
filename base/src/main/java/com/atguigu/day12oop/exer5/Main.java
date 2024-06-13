package com.atguigu.day12oop.exer5;

/**
 * @author Alex
 * @since 2024/6/13 上午11:15
 * <p></p>
 */
public class Main {

    public static void main(String[] args) {

        GemetricObject gemetricObject = new GemetricObject("red", 5.5);
        System.out.println(gemetricObject.toString());
        System.out.println(gemetricObject.findArea());

        GemetricObject circle = new Circle("red", 5.5, 5.5);
        System.out.println(circle.toString());
        System.out.println(circle.findArea());

        GemetricObject rectangle = new Rectangle("red", 5.5, 5.5);
        System.out.println(rectangle.toString());
        System.out.println(rectangle.findArea());
    }

}
