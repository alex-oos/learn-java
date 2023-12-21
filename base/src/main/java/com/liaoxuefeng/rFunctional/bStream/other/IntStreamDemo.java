package com.liaoxuefeng.rFunctional.bStream.other;


import java.util.List;
import java.util.function.IntSupplier;
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
    public static void createIntStream() {
        // 创建instream 流的三种方式
        // 方式一
        // 生成0到10的数  左闭右开 【0，9】
        IntStream.range(0, 10).forEach(System.out::print);
        System.out.println();
        // 方式二：
        // 生成0到10的数  左闭右闭 【0，10】
        IntStream.rangeClosed(0, 10).forEach(System.out::print);
        System.out.println();
        // 方式三：
        IntStream.of(10, 2, 3, 4, 5).forEach(System.out::print);
        System.out.println();
        // 方式四：
        IntStream.generate(new IntSupplier() {
            int i = 0;

            @Override
            public int getAsInt() {

                i++;
                return i;
            }
        }).limit(10).forEach(System.out::print);
        System.out.println();


    }

    public static void methods() {

        IntStream.of(10, 2, 3, 4, 5).filter(e -> e > 2).forEach(System.out::print);
        System.out.println();
        // 求个数，
        long count1 = IntStream.of(1, 2, 4, 5, 6, 2).count();
        System.out.println(count1);
        // 求不同的元素个数
        long count = IntStream.of(1, 2, 2, 3).distinct().count();
        System.out.println("count = " + count);

        // instream 转换为list boxed()方法是将IntStream转换为Stream<Integer>： 在使用collect()方法转换为list
        List<Integer> collect = IntStream.rangeClosed(0, 10).boxed().collect(Collectors.toList());
        System.out.println("collect = " + collect);
        // boxed 在类型转化中特别有用
    }

    public static void main(String[] args) {

        createIntStream();
        methods();
        IntStream.range(0, 1).forEach(System.out::println);
    }

}
