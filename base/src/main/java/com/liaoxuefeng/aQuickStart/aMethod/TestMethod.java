package com.liaoxuefeng.aQuickStart.aMethod;

/**
 * @author: 李将
 * @since: 2020/6/17 15:19
 * @Descprition:
 */
public class TestMethod {

    public static void main(String[] args) {
        Person ming = new Person();
        ming.setBirth(2008);
        System.out.println(ming.getAge());
    }
}

class Person {
    private String name;
    private int birth;

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getAge() {
        return calcAge(2019); // 调用private方法
    }

    // private方法:
    private int calcAge(int currentYear) {
        return currentYear - this.birth;
    }
}
