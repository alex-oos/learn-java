package com.liaoxuefeng.rFunctional.bStream.other;

import java.util.stream.LongStream;

/**
 * @ClassName LongStreamDemo
 * @Description
 * @Author Alex
 * @since 2023/9/26 22:32
 * @Version 1.0
 */
public class LongStreamDemo {

    public static void function() {

        LongStream longStream =LongStream.of(1,2,3,4,5);
        long count = longStream.count();
        System.out.println("count = " + count);

        LongStream.range(0,100).forEach(System.out::println);


    }

    public static void main(String[] args) {

        function();
    }

}
