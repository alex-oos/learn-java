package com.atguigu.day12oop.exer5;

import lombok.Data;

/**
 * @author Alex
 * @since 2024/6/13 上午11:05
 * <p></p>
 */
@Data
public class Circle extends GemetricObject {

    private double radius;

    public Circle(String color, Double weight, double radius) {

        super(color, weight);
        this.radius = radius;
    }

    @Override
    public double findArea() {

        return this.radius * this.radius * Math.PI;
    }


}
