package com.liaoxuefeng.fAnnotation;

import java.lang.reflect.Field;

/**
 * @author Alex
 * @since 2020/6/8 16:53
 */
public class PersonAnnotationGet {

    public static void check(Person person) throws IllegalAccessException {
        // 通过 foreach循环，依次获取person这个实例的public的字段的字段名称（数据类型为Field）

        for (Field field : person.getClass().getFields()) {
            // 通过Filed类的 .getAnnotation 方法来获得注解

            Range range = field.getAnnotation(Range.class);
            // 判断注解是否为null

            if (range != null) {
                // 使用了注解的情况下，通过Filed的 .get方法，来获取指定字段的字段值

                Object value = field.get(person);
                System.out.println("value = " + value);
                // 如果是对 String字段使用的注解

                if (value instanceof String) {
                    String s = (String) value;
                    if (s.length() < range.min() || s.length() > range.min()) {
                        throw new IllegalArgumentException("Invalid field" + field.getName());
                    }

                }
                // 如果是对 int字段使用的注解

                if (value instanceof Integer) {
                    Integer i = (Integer) value;
                    if (i < range.min() || i > range.max()) {
                        throw new IllegalArgumentException("Invaild field" + field.getName());
                    }
                }

            }

        }
    }

    public static void main(String[] args) throws IllegalAccessException {

        Person p1 = new Person("Bob", "Beijing", 20);

        Person p2 = new Person("", "Shanghai", 20);

        Person p3 = new Person("Alice", "Shanghai", 199);


        for (Person p : new Person[]{p1, p2, p3}) {

            try {

                check(p);

                System.out.println("Person " + p + " checked ok.");

            } catch (IllegalArgumentException e) {

                System.out.println("Person " + p + " checked failed: " + e);

            }

        }

    }

}
