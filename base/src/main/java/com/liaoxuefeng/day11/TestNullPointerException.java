package com.liaoxuefeng.day11;

/**
 * @Auther: 李将
 * @Date: 2020/6/2 19:45
 * @Descprition: NullPointerException异常，因为city为空，所以报错
 */
public class TestNullPointerException {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("p.address.city.toLowerCase() = " + p.address.city.toLowerCase());

    }
}

class Person {
    String[] name = new String[2];
    Address address = new Address();
}

class Address {
    String city;
    String street;
    String zipcode;
}

