package com.liaoxuefeng.eReflection;

/**
 * @author Alex
 * @since 2023/9/6 下午4:04
 * @Descprition:
 */
public class HelloWorld implements Hello {
    @Override
    public void morning(String name) {
        System.out.println("Hello, " + name);
    }
}
