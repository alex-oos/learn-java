package com.liaoxuefeng.rFunctional.aLambda;


import java.util.function.Supplier;

/**
 * @author Alex
 * @since 2023/9/26 下午4:01
 * 
 */
public class Car {

    // Supplier是jdk1.8的接口，这里和lamda一起使用了
    public static Car create(final Supplier<Car> supplier) {

        return supplier.get();
    }

    public static void collide(final Car car) {

        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car another) {

        System.out.println("Following the " + another.toString());
    }

    public void repair() {

        System.out.println("Repaired " + this);
    }

}
