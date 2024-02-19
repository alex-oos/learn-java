package com.liaoxuefeng.hCollection.gSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Alex
 * @since 2020/6/15 下午 11:04
 */
public class SetDemo {

    /**
     * Set接口实现类：
     * HashSet：内部使用HashMap实现，不保证有序；
     * TreeSet：内部使用TreeMap实现，保证元素有序（不是按插入顺序排序，而是按元素大小排序）；
     * set 中如何保证元素有序？ 通过TreeSet实现
     * Set接口并不保证有序，而SortedSet接口则保证元素是有序的：
     * HashSet是无序的，因为它实现了Set接口，并没有实现SortedSet接口；
     * TreeSet是有序的，因为它实现了SortedSet接口。
     */

    public static void setClass() {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        for (String s : hashSet) {
            System.out.println("s = " + s);

        }
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("one");
        treeSet.add("two");
        treeSet.add("three");
        for (String s : treeSet) {
            System.out.println("s = " + s);
        }

    }

    /**
     * <p>
     * Set用于存储不重复的元素，其实就是实现了Set 接口，具体可以查看API 文档，set接口中有哪些方法，下面罗列了一些
     * 主要方法如下： <br>
     * 1、boolean add(E,e) 将元素添加到Set <br>
     * 2、boolean remove(E,e) 将元素从Set 中删除 <br>
     * 3、boolean contains(Object e) 判断是否包含元素<br>
     * </p>
     */
    public static void setMethods() {

        Set<String> stringSet = new HashSet<>();
        System.out.println("set.add(\"asd\") = " + stringSet.add("asd"));
        System.out.println("set.add(\"shj\") = " + stringSet.add("shj"));
        System.out.println("set.add(\"shj\") = " + stringSet.add("shj"));
        System.out.println("set.contains(\"asd\") = " + stringSet.contains("asd"));
        System.out.println("set.remove(\"hello\") = " + stringSet.remove("hello"));
        System.out.println("set = " + stringSet.size());
    }

    /**
     * Set 求交集，差集，并集
     */
    public static void other() {

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set2.add("c");
        set2.add("d");
        set2.add("e");

        // 求交集
        // set1.retainAll(set2);
        System.out.println(set1);
        // 求并集
        // set1.addAll(set2);
        System.out.println(set1);
        // 求差集
        set1.removeAll(set2);
        System.out.println(set1);
    }


    public static void main(String[] args) {

        setClass();
        setMethods();
        other();


    }

}
