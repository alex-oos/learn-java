package com.liaoxuefeng.kJnuit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @autoer Alex
 * @since: 2020/7/10 18:35
 * @Descprition:
 */
/*
 *   条件测试：
 *       1、 EnabledOnOs 条件判断测试，如果为true的时候执行，如果不为true的时候，
 * */
class ConfigTest {

    Config config;

    //    我们想要测试getConfigFile()这个方法，但是在Windows上跑，和在Linux上跑的代码路径不同，因此，针对两个系统的测试方法，其中一个只能在Windows上跑，另一个只能在Mac/Linux上跑：
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testWindows() {
        assertEquals("C:\\test.ini", config.getConfigFile("test.ini"));
    }


    @Test
    @EnabledOnOs({OS.LINUX, OS.MAC})
    void testLinuxAndMac() {
        assertEquals("/usr/local/test.cfg", config.getConfigFile("test.cfg"));
    }

}
