package com.liaoxuefeng.hCollection.gSet;

import java.util.HashSet;
import java.util.Set;

/**
 * <P>
 * Set 求交集，差集，并集
 * </p>
 *
 * @author Alex
 * @since 2023/11/29 下午5:43
 */
public class SetExam1 {


    public static void main(String[] args) {

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

}
