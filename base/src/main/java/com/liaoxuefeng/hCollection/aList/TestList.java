package com.liaoxuefeng.hCollection.aList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: 李将
 * @since: 2020/6/10 19:41
 * @Descprition:
 */
public class TestList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add(0, "banner");
        list.add(1, "apple");
        list.remove(0);
        list.remove("apple");
        list.get(0);
        list.size();
        System.out.println("list = " + list);
        System.out.println("list = " + list.size());

        // List接口提供的of()方法，根据给定元素快速创建List：
        List<Integer> integerList = List.of(1, 2, 5);

        // 使用Iterator 遍历list
        for (Iterator<Integer> integerIterator = integerList.iterator(); integerIterator.hasNext(); ) {
            Integer next = integerIterator.next();
            System.out.println("next = " + next);

        }


    }
}
