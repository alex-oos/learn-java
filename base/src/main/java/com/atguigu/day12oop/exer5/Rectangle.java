package com.atguigu.day12oop.exer5;

import lombok.Data;

/**
 * @author Alex
 * @since 2024/6/13 上午11:10
 * <p></p>
 */
@Data
public class Rectangle extends GemetricObject {

    private double height;


    public Rectangle(String color, Double weight, double height) {

        super(color, weight);
        this.height = height;
    }

    @Override
    public double findArea() {

        return this.height * super.getWeight();
    }

}
