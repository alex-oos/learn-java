package com.liaoxuefeng.eReflection;

import java.lang.reflect.Field;

/**
 * @author Alex
 * @since 2020/6/5 17:03
 * @Descprition:
 *              设置字段值
 */
public class TestField3 {

    /**
     * 设置字段值 <br/>
     * 通过Field实例既然可以获取到指定实例的字段值，自然也可以设置字段的值。<br/>
     * 设置字段值是通过Field.set(Object, Object)实现的，其中第一个Object参数是指定的实例，第二个Object参数是待修改的值。示例代码如下
     *
     * @param args
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     */
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Person3 person3 = new Person3("xiao ming");
        System.out.println("person3.getName() = " + person3.getName());
        Class c = person3.getClass();
        Field field = c.getDeclaredField("name");
        field.setAccessible(true);
        field.set(person3, "xiao  bai");
        System.out.println("Person3 = " + person3.getName());


    }
}

class Person3 {
    private String name;

    public Person3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
