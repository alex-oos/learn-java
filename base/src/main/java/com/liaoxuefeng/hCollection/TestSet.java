package com.liaoxuefeng.hCollection;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Auther: 李将
 * @Date: 2020/6/17 下午 11:44
 * @Descprition:
 */
public class TestSet {
    public static void main(String[] args) {
        String[] oldarry = {"a", "b", "c", "d", "d"};

        Set<String> set = new TreeSet<>();
        for (String s : oldarry) {
            set.add(s);
        }
        System.out.println("set.size() = " + set.size());
        System.out.println("set.toString() = " + set.toString());

    }
}