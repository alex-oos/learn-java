package com.atguigu.day12oop.exer5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Alex
 * @since 2024/6/13 上午11:04
 * <p></p>
 */

@Data
public class GemetricObject {

    private String color;

    private Double weight;

    public GemetricObject(String color, Double weight) {

        this.color = color;
        this.weight = weight;
    }

    public double findArea() {

        return 0.0;
    }


}
