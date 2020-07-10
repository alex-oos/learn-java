package com.liaoxuefeng.kJnuit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Auther: 李将
 * @Date: 2020/7/10 17:58
 * @Descprition:
 */

/*
 * @BeforeEach来初始化，通过@AfterEach来清理资源：
 * */
class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        this.calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        this.calculator = null;
    }

    @Test
    void add() {
        assertEquals(100, this.calculator.add(100));
        assertEquals(150, this.calculator.add(50));
        assertEquals(130, this.calculator.add(-20));

    }


    @Test
    void sub() {
        assertEquals(-100, this.calculator.sub(100));
        assertEquals(-150, this.calculator.sub(50));
        assertEquals(-130, this.calculator.sub(-20));
    }
}