package com.liaoxuefeng.cExcethion;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.UnsupportedEncodingException;

/**
 * @author: 李将
 * @since: 2020/6/2 20:22
 * @Descprition:
 */
public class TestLog4j {
    static final Log log = LogFactory.getLog(Main.class);

    public static void main(String[] args) {
        log.info("Start process...");
        try {
            "".getBytes("invalidCharsetName");
        } catch (UnsupportedEncodingException e) {
            // 使用log.error(String, Throwable)打印异常
            log.error(e);
        }
        log.info("Process end.");
    }
}
