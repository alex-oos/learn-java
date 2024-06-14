package com.atguigu.day12oop.exer5;

import lombok.Data;
import lombok.ToString;

/**
 * @author Alex
 * @since 2024/6/13 上午11:10
 * <p></p>
 */
@ToString

public class Rectangle extends GemetricObject {

    private double height;
    private double width;


    public Rectangle(String color, Double weight, double width, double height) {

        super(color, weight);
        this.height = height;
        this.width = width;

    }

    @Override
    public double findArea() {

        return this.height * this.width;
    }

}
