package com.liaoxuefeng.hCollection.oCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: 李将
 * @since: 2020/6/18 20:08
 * @Descprition:
 */
public class Main {

    //    Collections 排序
    public static void function() {

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("orange");
//        排序前
        System.out.println(list);
        //排序
        Collections.sort(list);
        // 排序后
        System.out.println(list);
    }

    // 洗牌
    public static void function1() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // 洗牌前：
        System.out.println(list);
        Collections.shuffle(list);

        //洗牌后
        System.out.println(list);
    }

    // 不可变集合
/*    public static void function2() {
        List<String> mutable = new ArrayList<>();
        mutable.add("apple");
        mutable.add("pear");
        // 变为不可变集合
        List<String> immutale = Collections.unmodifiableList(mutable);
        immutale.add("orange");
    }*/

    public static void main(String[] args) {
        function();
        function1();
/*
        function2();
*/
    }
}

