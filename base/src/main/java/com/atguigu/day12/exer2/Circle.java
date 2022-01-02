package com.atguigu.day12.exer2;


/**
 * @author Alex
 * @date 2021/12/16 4:44 下午
 * <P></p>
 */
public class Circle {
    private double radius;

    public double areas() {
        return this.radius * this.radius * Math.PI;
    }
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
