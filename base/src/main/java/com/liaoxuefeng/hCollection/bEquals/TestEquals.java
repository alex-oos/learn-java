package com.liaoxuefeng.hCollection.bEquals;

import java.util.List;

/**
 * <p>
 * equals方法，使用规则
 * </p>
 *
 * @author Alex
 * @since 2020/6/10 21:04
 * 
 */
public class TestEquals {

    /**
     *
     */
    public static void function() {
        String str = null;
        boolean equals = "SnailClimb".equals(str);
        System.out.println("equals = " + equals);
    }

    /**
     *
     */
    public static void listContatins() {
        List<Person> list = List.of(
                new Person("xiao ming", 10),
                new Person("xiao hong", 10),
                new Person("Bob", 10)
        );

        System.out.println("list.contains(new Person(\"Bob,10\")) = " + list.contains(new Person("Bob", 10)));
    }

    public static void main(String[] args) {
        function();

    }
}
