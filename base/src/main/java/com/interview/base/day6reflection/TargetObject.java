package com.interview.base.day6reflection;


/**
 * @ClassName TargetObject
 * @Description
 * @Author Alex
 * @since 2022/6/14 20:43
 * @Version 1.0
 */
public class TargetObject {

    private final String value;


    public TargetObject() {
        this.value = "value";
    }

    public void publicMethod(String s) {
        System.out.println("s = " + s);
    }


    private void privateMethod() {
        System.out.println("this.value" + this.value);
    }

}
