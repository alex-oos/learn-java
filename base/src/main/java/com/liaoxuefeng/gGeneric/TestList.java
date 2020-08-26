package com.liaoxuefeng.gGeneric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: 李将
 * @since: 2020/6/8 17:26
 * @Descprition:
 */
public class TestList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("World");
        if (list.get(0) instanceof String) {
            System.out.println(" list类型为String");
        }
        String fist = list.get(0);
        String second = list.get(1);
        System.out.println("fist = " + fist);
        System.out.println("second = " + second);


        List<Number> list1 = new ArrayList<Number>();
        list1.add(new Integer(123));
        list1.add(new Double(12.34));
        Number first1 = list1.get(0);
        Number first2 = list1.get(1);
        System.out.println("first2 = " + first2);

        Person[] ps = new Person[]{
                new Person("Bob", 61),
                new Person("Alice", 88),
                new Person("Lily", 75)
        };

        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}

class Person implements Comparable<Person> {

    String name;
    int score;

    public Person(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

