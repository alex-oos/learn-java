package com.liaoxuefeng.rFunctional.stream;


import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Alex
 * @date 2021/9/10 2:09 下午
 * <P></p>
 */
public class IntStreamLearn {

    public static void function() {
        IntStream.range(0, 10).forEach(System.out :: println);
        IntStream.of(10, 2, 3, 4, 5).forEach(System.out :: println);
        IntStream.of(10, 2, 3, 4, 5).filter(e-> e>2).forEach(System.out::println);

        long count = IntStream.of(1, 2, 2, 3).distinct().count();
        System.out.println("count = " + count);

    }

    public static void main(String[] args) {
        function();
    }

}
