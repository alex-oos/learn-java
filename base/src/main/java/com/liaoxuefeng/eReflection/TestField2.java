package com.liaoxuefeng.eReflection;

import java.lang.reflect.Field;

/**
 * @Auther: 李将
 * @Date: 2020/6/5 16:28
 * @Descprition:
 */
public class TestField2 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Object p = new Person1("xiaoming");
        Class c = p.getClass();
        Field field = c.getDeclaredField("name");

        field.setAccessible(true); // Field.setAccessible(true)的意思是，别管这个字段是不是public，一律允许访问。

        Object value = field.get(p);

        System.out.println("value = " + value);
    }


}

class Person1 {

    private String name;

    public Person1(String name) {
        this.name = name;
    }
}

