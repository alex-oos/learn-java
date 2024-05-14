package com.atguigu.day10oop.exer;


/**
 * @author Alex
 * @since 2022/4/20 07:32
 */
public class Girl {

    private String name;

    private Integer age;

    public Girl() {

        System.out.println("无参构造器");
    }

    public Girl(String name, Integer age) {
        //this 构造器必须放在首行
        this();
        this.name = name;
        this.age = age;
        System.out.println("有参构造器");
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void marry(Boy boy) {

        System.out.println("我想嫁给" + boy.getName());
        boy.marry(this);
    }

    /**
     * @param girl
     * @return 正数代表大于 负数代表小于  0 代表相等
     */
    public Integer compare(Girl girl) {

        return this.age - girl.getAge();
    }

    public Integer getAge() {

        return age;
    }

    public void setAge(Integer age) {

        this.age = age;
    }

}
