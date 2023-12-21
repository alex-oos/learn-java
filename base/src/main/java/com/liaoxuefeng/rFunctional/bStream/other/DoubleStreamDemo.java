package com.liaoxuefeng.rFunctional.bStream.other;

import java.util.OptionalDouble;
import java.util.function.DoubleSupplier;
import java.util.stream.DoubleStream;

/**
 * @ClassName DoubleStreamDemo
 * @Description
 * @Author Alex
 * @Version 1.0
 * @since 2023/9/26 22:34
 */
public class DoubleStreamDemo {

    public static void function() {

        DoubleStream doubleStream = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0);
        long count = doubleStream.count();
        System.out.println("count = " + count);

        DoubleStream doubleStrea1 = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0);

        OptionalDouble average = doubleStrea1.average();
        System.out.println("average = " + average);
        // double 生成器
        DoubleStream.iterate(1, n -> n + 1).limit(10).forEach(System.out::print);
        System.out.println();
        // double 生成器
        DoubleStream.generate(new DoubleSupplier() {
            double i = 0.1;

            @Override
            public double getAsDouble() {

                i++;
                return i;
            }
        }).limit(10).forEach(System.out::print);


    }

    public static void main(String[] args) {

        function();
    }

}
