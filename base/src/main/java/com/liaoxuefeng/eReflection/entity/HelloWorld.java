package com.liaoxuefeng.eReflection.entity;

/**
 * @author Alex
 * @since 2023/9/6 下午4:04
 * <p>
 *     接口实现类
 * </p>
 */
public class HelloWorld implements Hello {
    @Override
    public void morning(String name) {
        System.out.println("Hello, " + name);
    }
}
