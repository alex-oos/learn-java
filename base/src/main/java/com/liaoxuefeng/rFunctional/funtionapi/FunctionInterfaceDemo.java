package com.liaoxuefeng.rFunctional.funtionapi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Alex
 * @since 2021/8/16 7:15 下午
 * 函数式编程: 是把函数作为基本运算单位，函数可以作为变量，可以接收函数，还可以返回函数，一般支持 函数式编程的编码风格叫做Lambda表达式
 * 函数式接口： 只包含一个抽象方法的接口，称为函数式接口。可以使用@FunctionalInterface注解修饰，可以检查是否是函数式接口
 */
public class FunctionInterfaceDemo {

    /**
     * 对比 Lambda 表达式与原来的区别
     */
    public static void function() {

        String[] arrays = new String[]{"Apple", "Orange"};
        Arrays.sort(arrays, (s1, s2) -> {
            return s1.compareTo(s2);
        });
        System.out.println(String.join(",", arrays));

    }

    /**
     * Predicate<Integer> predicate = n -> true
     * n 是一个参数传递到 Predicate 接口的 test 方法
     * n 如果存在则 test 方法返回 true
     *
     * @param list
     * @param predicate
     */

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {

        for (Integer n : list) {
            if (predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

    /**
     * 函数式接口的实例：
     * Predicate<T> 接口是一个函数式接口，它接受一个输入参数 T，返回一个布尔值结果。
     * 该接口包含多种默认方法来将Predicate组合成其他复杂的逻辑（比如：与，或，非）。
     * 该接口用于测试对象是 true 或 false。
     */
    public static void function1() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // Predicate<Integer> predicate = n -> true
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // n 如果存在则 test 方法返回 true
        System.out.println("输出所有数据:");

        // 传递参数 n
        eval(list, n -> true);

        // Predicate<Integer> predicate1 = n -> n%2 == 0
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // 如果 n%2 为 0 test 方法返回 true

        System.out.println("输出所有偶数:");
        eval(list, n -> n % 2 == 0);

        // Predicate<Integer> predicate2 = n -> n > 3
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // 如果 n 大于 3 test 方法返回 true

        System.out.println("输出大于 3 的所有数字:");
        eval(list, n -> n > 3);

    }

    /**
     * 常见的函数式接口有哪些：四大核心接口
     * Consumer<T> 消费型接口： 对类型为T的对象应用操作，包含方法：void accept(T t) 代表了接受一个输入参数并且无返回的操作
     * Supplier<T> 供给型接口： 返回类型为T的对象，包含方法：T get() 无参数，返回一个结果
     * Function<T,R> 函数型接口： 对类型为T的对象应用操作，并返回结果，结果是R类型的对象，包含方法：R apply(T t) 接受一个输入参数，返回一个结果
     * Predicate<T> 断言型接口： 确定类型为T的对象是否满足某约束，并返回boolean值，包含方法：boolean test(T t) 接受一个输入参数，返回一个布尔值结果
     */
    public static void function2() {

        Consumer<Integer> consumer = (x) -> System.out.println("www." + x);
        consumer.accept(1);

        List<Integer> list = new ArrayList<>();
        Supplier<Integer> supplier = () -> (int) (Math.random() * 10);
        list.add(supplier.get());
        System.out.println(list);

        String oldStr = "abc123456xyz";
        Function<String, String> function = (s) -> s.substring(1, s.length() - 1);
        System.out.println(function.apply(oldStr));


        Integer age = 35;
        Predicate<Integer> predicate = (i) -> i >= 35;
        if (predicate.test(age)) {
            System.out.println("你该退休了");
        } else {
            System.out.println("我觉得还OK啦");
        }
 
    }

    public static void main(String[] args) {

        //function();
        //function1();
        function2();

    }


}
