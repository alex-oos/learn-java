package com.atguigu.day9.exer;


import cn.hutool.captcha.CircleCaptcha;

/**
 * @author Alex
 * @date 2021/12/8 6:27 下午
 * 考查参数的值传递
 * 定义一个类PassObject，在类中定义一个方法printAreas()，
 * 该方法的定义如下：public void printAreas(Circle c, int time)
 * 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 * 例如，time为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 * <p>
 * <p>
 * 在main方法中调用printAreas()方法，调用完毕后输出当前半径值。程序运行结果如图所示。
 */
public class PassObject {

    public static void printAreas(Circle c, int time) {

        for (int i = 1; i <= time; i++) {
            c.radius = i;
            System.out.println("半径是：" + c.radius);
            System.out.println("面积是：" + c.aras());
        }
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        printAreas(c, 10);
    }


}

class Circle {

    double radius;
    public double aras() {
        return Math.PI * radius * radius;
    }


}

