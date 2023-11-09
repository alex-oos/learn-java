package com.liaoxuefeng.kJnuit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Alex
 * @since 2020/7/10 18:47
 *
 */
class TestTest {

    //    Junit 参数化ParameterizedTest
    @ParameterizedTest
    @Test
    @ValueSource(ints = {0, 1, 5, 100})
    void testAbs(int x) {
        assertEquals(x, Math.abs(x));
    }


    @ParameterizedTest
    @ValueSource(ints = {-1, -5, -100})
    @Test
    void testAbsNegative(int x) {
        assertEquals(-x, Math.abs(x));
    }
}
