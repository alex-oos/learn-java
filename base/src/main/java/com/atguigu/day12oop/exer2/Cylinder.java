package com.atguigu.day12oop.exer2;


/**
 * @author Alex
 * @since 2021/12/16 4:44 下午
 * <P></p>
 */
public class Cylinder extends Circle {

    private double length;

    public Cylinder() {
        length = 1.0;
    }
    public Cylinder(double length) {
        this.length = length;
    }
    public Cylinder(double radius, double length) {
        super(radius);
        this.length = length;
    }

    @Override
    public double areas() {
        return super.areas() * getLength();
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "length=" + length +
                '}';
    }

}
