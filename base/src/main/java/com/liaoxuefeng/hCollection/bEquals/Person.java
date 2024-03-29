package com.liaoxuefeng.hCollection.bEquals;

import java.util.Objects;

/**
 * @author Alex
 * @since 2020/6/10 21:04
 * 
 */
public class Person {

    private final String name;
    private final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 重写了equals方法，对比的对象的值是否相等
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                age.equals(person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
