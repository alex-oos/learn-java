package com.liaoxuefeng.rFunctional.bStream.other;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Alex
 * @since 2021/9/10 2:09 下午
 * <P></p>
 */
public class IntStreamDemo {

    /**
     * IntStream是Stream的一个子接口，它代表的元素都是int类型，因此，我们无法直接把一个IntStream转换为Stream，但是我们可以把IntStream转换为Stream，例如：
     */
    public static void function() {
        // 生成0到10的数
        IntStream.range(0, 10).forEach(System.out::println);
        IntStream.of(10, 2, 3, 4, 5).forEach(System.out::println);
        IntStream.of(10, 2, 3, 4, 5).filter(e -> e > 2).forEach(System.out::println);

        // 求个数
        long count = IntStream.of(1, 2, 2, 3).distinct().count();
        System.out.println("count = " + count);

        // instream 转换为list boxed()方法是将IntStream转换为Stream<Integer>： 在使用collect()方法转换为list
        List<Integer> collect = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        System.out.println("collect = " + collect);
        // boxed 在类型转化中特别有用



    }

    public static void main(String[] args) {

        function();
    }

}
