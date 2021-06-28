package com.liaoxuefeng.hCollection.aList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author: 李将
 * @since: 2020/6/10 19:41
 * <p>
 * arrayList 的基本用法
 * </p>
 */
public class TestList {

    /**
     * @return
     * @author: LiJiang
     * @description: list的基本用法
     * @date: 2021/6/28 14:25
     */
    public static void function() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add(0, "banner");
        list.add(1, "apple");
        list.remove(0);
        list.remove("apple");
        String s = list.get(0);
        list.size();
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());

        //遍历输出
        list.forEach(System.out::println);
        // List接口提供的of()方法，根据给定元素快速创建List：
        List<Integer> integerList = new ArrayList<>(List.of(9, 5, 109, 2));

        //排序
        integerList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        integerList.forEach(System.out::println);
        // 使用Iterator 遍历list
        for (Iterator<Integer> integerIterator = integerList.iterator(); integerIterator.hasNext(); ) {
            Integer next = integerIterator.next();
            System.out.println("next = " + next);
        }

        /* 删除list中的所有偶数 */
        integerList.removeIf(filter -> filter % 2 == 0);
        integerList.forEach(System.out::println);

    }

    /**
     * <p>
     * 不能在foreach 中进行remove/add 操作，remove操作，应该使用Iterator使用，如果并发操作，需要对Iterator进行加锁
     * </p>
     */
    public static void functionB() {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if ("2".equals(next)) {
                iterator.remove();
            }
        }

        stringList.forEach(System.out::println);

    }

    public static void main(String[] args) {
        functionB();
    }
}
