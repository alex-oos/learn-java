package com.liaoxuefeng.rFunctional.bStream.other;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

/**
 * @ClassName DoubleStreamDemo
 * @Description
 * @Author Alex
 * @Date 2023/9/26 22:34
 * @Version 1.0
 */
public class DoubleStreamDemo {

    public static void function() {

        DoubleStream doubleStream = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0);
        long count = doubleStream.count();
        System.out.println("count = " + count);

        DoubleStream doubleStrea1 = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0);

        OptionalDouble average = doubleStrea1.average();
        System.out.println("average = " + average);


    }

    public static void main(String[] args) {

        function();
    }

}
