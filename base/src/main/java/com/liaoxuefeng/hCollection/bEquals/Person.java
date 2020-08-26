package com.liaoxuefeng.hCollection.bEquals;

import java.util.Objects;

/**
 * @author: 李将
 * @since: 2020/6/10 21:04
 * @Descprition:
 */
public class Person {

    private final String name;
    private final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

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
