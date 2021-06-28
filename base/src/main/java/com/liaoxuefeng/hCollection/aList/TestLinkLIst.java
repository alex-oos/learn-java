package com.liaoxuefeng.hCollection.aList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author: 李将
 * @since: 2020/6/11 16:37
 * @Descprition:
 */
public class TestLinkLIst {

    public static void function() {

        List<Integer> stringList = new ArrayList<>();
        stringList.add(3);
        stringList.add(1);
        System.out.println("stringList.size() = " + stringList.size());
        Integer s = stringList.get(0);
        // list 中的排序，使用compareTo方法
        stringList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        stringList.forEach(System.out::println);

        System.out.println("s = " + s);
        stringList.clear();
        stringList.forEach(System.out::println);
    }

    public static void main(String[] args) {
//        List<String> list1 = new LinkedList<>();
        function();

    }
}
