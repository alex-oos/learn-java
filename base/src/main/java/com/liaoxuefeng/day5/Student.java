package com.liaoxuefeng.day5;

import java.security.spec.ECField;

/**
 * @Auther: 李将
 * @Date: 2020/5/28 15:32
 * @Descprition:
 */
public class Student implements Person, Hello {
    private final String name;

    public Student(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return this.name;
    }


    @Override
    public void hello() {

    }
}
