package com.liaoxuefeng.hCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Auther: 李将
 * @Date: 2020/6/17 下午 11:44
 * @Descprition:
 */
public class TestSet {
    public static void function() {
        String[] oldarry = {"a", "b", "c", "d", "d"};

        Set<String> set = new TreeSet<>();
        for (String s : oldarry) {
            set.add(s);
        }
        System.out.println("set.size() = " + set.size());
        System.out.println("set.toString() = " + set.toString());
    }

    public static void function1() {
        String[] oldarry = {"a", "b", "c", "d", "d"};
        List<String> list = new ArrayList<>();
        for (String s : oldarry) {
            list.add(s);

        }
        Map<String, Integer> map = new HashMap<>();


    }

    public static void main(String[] args) {


    }
}