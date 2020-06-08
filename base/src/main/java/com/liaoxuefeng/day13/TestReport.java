package com.liaoxuefeng.day13;

import com.liaoxuefeng.day7.Person;

/**
 * @Auther: 李将
 * @Date: 2020/6/8 12:22
 * @Descprition:
 */
public class TestReport {
    public static void main(String[] args) {
        Class cls = Person.class;
        if (cls.isAnnotationPresent(Report.class)) {
            Report report = (Report) cls.getAnnotation(Report.class);
        }
    }
}
