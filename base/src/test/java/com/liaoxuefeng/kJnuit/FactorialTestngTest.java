package com.liaoxuefeng.kJnuit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * @author: 李将
 * @since: 2020/7/10 17:06
 * @Descprition: TestNG： 是java语言流行的一种测试框架，用于测试，功能比junit强大
 */
public class FactorialTestngTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("afterMethod");
    }

    @Test
    public void testFunction() {
        System.out.println("test");
    }
}