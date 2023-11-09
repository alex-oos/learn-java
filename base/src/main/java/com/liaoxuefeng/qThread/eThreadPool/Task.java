package com.liaoxuefeng.qThread.eThreadPool;

import java.util.concurrent.Callable;

/**
 * @author Alex
 * @since 2023/9/18 下午3:50
 * 
 */
public class Task implements Callable<String> {

    @Override
    public String call() throws Exception {

        return String.valueOf(System.currentTimeMillis());
    }

}
