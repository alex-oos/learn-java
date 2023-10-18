package com.atguigu.day12.exer2;


/**
 * @author Alex
 * @since 2021/12/16 4:37 下午
 * <P></p>
 */
public class CylinderTest extends Circle {

    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(2.1);
        c.setLength(2.3);
        double areas = c.areas();
        System.out.println("areas = " + areas);
        System.out.println("************");
    }

}
