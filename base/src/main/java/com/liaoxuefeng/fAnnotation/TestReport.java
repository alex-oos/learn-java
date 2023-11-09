package com.liaoxuefeng.fAnnotation;

import com.liaoxuefeng.bObject.bCoreClass.bJavaBean.Person;

/**
 * @author Alex
 * @since 2020/6/8 12:22
 * 
 */
public class TestReport {
    public static void main(String[] args) {
        Class cls = Person.class;
        if (cls.isAnnotationPresent(Report.class)) {
            Report report = (Report) cls.getAnnotation(Report.class);
        }
    }
}
