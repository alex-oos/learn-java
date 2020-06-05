package com.liaoxuefeng.day12;

import java.lang.reflect.Field;

/**
 * @Auther: 李将
 * @Date: 2020/6/5 17:03
 * @Descprition: 设置字段值
 * 通过Field实例既然可以获取到指定实例的字段值，自然也可以设置字段的值。
 * <p>
 * 设置字段值是通过Field.set(Object, Object)实现的，其中第一个Object参数是指定的实例，第二个Object参数是待修改的值。示例代码如下
 */
public class TestField3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Persoon3 persoon3 = new Persoon3("xiao ming");
        System.out.println("persoon3 = " + persoon3.getName());
        Class c = persoon3.getClass();
        Field field = c.getDeclaredField("name");
        field.setAccessible(true);
        field.set(persoon3, "xiao  ming");
        System.out.println("persoon3 = " + persoon3.getName());


    }
}

class Persoon3 {
    private String name;

    public Persoon3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
