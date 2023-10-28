package com.liaoxuefeng.eReflection;

import java.lang.reflect.Field;

/**
 * @author Alex
 * @since 2020/6/5 16:28
 * @Descprition: 获取字段值
 */
public class TestField2 {
    /**
     * 通过Field对象的get(Object)方法可以获取字段的当前值：
     *
     * @param args
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     */
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Person1 p = new Person1("xiaoming");
        Class c = p.getClass();
        Field field = c.getDeclaredField("name");
        System.out.println("field = " + field);
        field.setAccessible(true); // Field.setAccessible(true)的意思是，别管这个字段是不是public，一律允许访问。

        Object value = field.get(p); // 根据实例获取字段值
        System.out.println("value = " + value);
    }


}

class Person1 {

    private final String name;

    public Person1(String name) {
        this.name = name;
    }
}
