package com.liaoxuefeng.rFunctional.bStream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Alex
 * @since 2021/8/16 7:29 下午
 * <P>
 * stream 流 简单使用</p>
 */
public class Exer {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        System.out.println("列表是" + strings);
        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println("空字符串数量为：" + count);

        List<String> collect = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("筛选后的列表是 " + collect);

        String collect1 = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));
        System.out.println("合并字符串" + collect1);


        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> collect2 = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println("结果是" + collect2);


    }

}
