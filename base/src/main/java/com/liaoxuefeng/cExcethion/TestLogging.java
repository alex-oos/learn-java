package com.liaoxuefeng.cExcethion;

import java.util.logging.Logger;

/**
 * @author Alex
 * @since 2020/6/2 19:55
 *
 */
public class TestLogging {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("start process ---");
        logger.warning("memory is running out ---");
        logger.fine("ignored");
        logger.severe("process will be terminated ---");
    }
}
