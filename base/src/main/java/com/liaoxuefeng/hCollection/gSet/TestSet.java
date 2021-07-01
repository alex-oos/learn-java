package com.liaoxuefeng.hCollection.gSet;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author: 李将
 * @since: 2020/6/15 下午 11:04
 * <p>
 * set用于存储不重复的元素，主要方法如下：
 * 1、boolean add(E,e) 将元素添加到Set<E>
 * 2、boolean remove(E,e) 将元素从Set<E> 中删除
 * 3、boolean contains(Object e) 判断是否包含元素
 * </p>
 */
public class TestSet {

    public static void function() {

        Set<String> set = new HashSet<>();
        System.out.println("set.add(\"asd\") = " + set.add("asd"));
        System.out.println("set.add(\"shj\") = " + set.add("shj"));
        System.out.println("set.add(\"shj\") = " + set.add("shj"));
        System.out.println("set.contains(\"asd\") = " + set.contains("asd"));
        System.out.println("set.remove(\"hello\") = " + set.remove("hello"));
        System.out.println("set = " + set.size());
    }


    /**
     * Set接口并不保证有序，而SortedSet接口则保证元素是有序的：
     * HashSet是无序的，因为它实现了Set接口，并没有实现SortedSet接口；
     * TreeSet是有序的，因为它实现了SortedSet接口。
     */

    public static void function1() {

        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        for (String s : set) {
            System.out.println("s = " + s);

        }
    }


    public static void function2() {

        Set<String> set = new TreeSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        for (String s : set) {
            System.out.println("s = " + s);
        }
    }

    public static void main(String[] args) {

        function();
        function1();
        function2();

    }

}
