package com.liaoxuefeng.kJnuit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author Alex
 * @since 2020/7/10 17:37
 * @Descprition: Junit: 是使用与单元测试
 * JUnit是一个开源的Java语言的单元测试框架，专门针对Java设计，使用最广泛。JUnit是事实上的单元测试的标准框架，任何Java开发者都应当学习并使用JUnit编写单元测试。
 */
class FactorialTest {

    @BeforeEach
    void setUp() {
        System.out.println("befirEach");
    }

    @AfterEach
    void tearDown() {
        System.out.println("afterEach");
    }

    @Test
    void fact() {
        assertEquals(1, Factorial.fact(1));
        assertEquals(2, Factorial.fact(2));
        assertEquals(6, Factorial.fact(3));
        assertEquals(3628800, Factorial.fact(10));
        assertEquals(2432902008176640000L, Factorial.fact(20));

        System.out.println("test");

 /*     Junit 断言方法
         assertEquals：断言是否相等
        assertTrue(): 期待结果为true
        assertFalse(): 期待结果为false
        assertNotNull(): 期待结果为非null
        assertArrayEquals(): 期待结果为数组并与期望数组每个元素的值均相等*/
    }

    //    assertThrows()来期望捕获一个指定的异常。第二个参数Executable封装了我们要执行的会产生异常的代码。当我们执行Factorial.fact(-1)时，必定抛出IllegalArgumentException。assertThrows()在捕获到指定异常时表示通过测试，未捕获到异常，或者捕获到的异常类型不对，均表示测试失败。
    @Test
    void testNegative() {
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Factorial.fact(-1);
            }
        });
    }

    //name 就被忽视了，Disabled主要是忽略以下测试
    @Disabled
    @Test
    void name() {
        System.out.println("这条用例不用运行");
    }
}
