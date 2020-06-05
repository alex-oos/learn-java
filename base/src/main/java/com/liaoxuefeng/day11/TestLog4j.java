package com.liaoxuefeng.day11;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.UnsupportedEncodingException;

/**
 * @Auther: 李将
 * @Date: 2020/6/2 20:22
 * @Descprition:
 */
public class TestLog4j {
    static final Log log = LogFactory.getLog(Main.class);

    public static void main(String[] args) {
        log.info("Start process...");
        try {
            "".getBytes("invalidCharsetName");
        } catch (UnsupportedEncodingException e) {
            // TODO: 使用log.error(String, Throwable)打印异常
        }
        log.info("Process end.");
    }
}

