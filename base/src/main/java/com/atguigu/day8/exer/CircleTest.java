package com.atguigu.day8.exer;


/**
 * @author Alex
 * @date 2021/12/8 3:17 下午
 * 2.利用面向对象的编程方法，设计类Circle计算圆的面积。
 */
public class CircleTest {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 3;
        circle.findArea();
        
    }


}

class Circle {

    double radius;

    public void findArea() {
        double areas = Math.PI * radius * radius;
        System.out.println("面积是：" + areas);
    }

}
