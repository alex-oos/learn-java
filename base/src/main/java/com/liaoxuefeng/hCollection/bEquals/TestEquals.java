package com.liaoxuefeng.hCollection.bEquals;

import java.util.List;

/**
 * <p>
 * equals方法，使用规则
 * </p>
 *
 * @author Alex
 * @since 2020/6/10 21:04
 */
public class TestEquals {

    /**
     * 对比两个字符串是否相等
     */
    public static void function() {

        String str = null;
        boolean isEquals = "SnailClimb".equals(str);
        System.out.println("equals = " + isEquals);
    }

    /**
     * 对比list中是否包含某个对象
     */
    public static void listContains() {

        List<Person> list = List.of(
                new Person("xiao ming", 10),
                new Person("xiao hong", 10),
                new Person("Bob", 10)
        );

        System.out.println("list.contains(new Person(\"Bob,10\")) = " + list.contains(new Person("Bob", 10)));
    }

    public static void main(String[] args) {

        function();
        listContains();
    }

}
