package com.atguigu.day10;


/**
 * @author Alex
 * @since 2021/12/13 2:08 下午
 * <P>
 * javaBean 是一种 Java 语言 写成 的可重用的组件
 * 所谓JavaBean，是符合如下标准的Java类：
 * > 类是公共的
 * > 有一个无参的公共的构造器
 * > 有属性，且有对应的get、set 方法
 * </p>
 */


public class Customer {

    private int id;

    private String name;

    public Customer() {

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
