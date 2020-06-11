package com.liaoxuefeng.hCollection.bEquals;

import java.util.List;

/**
 * @Auther: 李将
 * @Date: 2020/6/10 21:04
 * @Descprition:
 */
public class TestEquals {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("xiao ming", 10),
                new Person("xiao hong", 10),
                new Person("Bob", 10)
        );

        System.out.println("list.contains(new Person(\"Bob,10\")) = " + list.contains(new Person("Bob", 10)));

    }
}
