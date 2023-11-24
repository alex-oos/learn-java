package com.liaoxuefeng.qThread.fasyco._02_completablefuture_create;

import com.liaoxuefeng.qThread.fasyco.utils.CommonUtils;

import java.util.concurrent.CompletableFuture;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/24 上午10:15
 */
public class RunAsyncDemo {

    public static void main(String[] args) {

        CommonUtils.printThreadLog("main start");
        // runAsync 创建异步任务， 使用runable匿名内部类
        CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {

                CommonUtils.printThreadLog("读取文件");

                CommonUtils.sleepSecond(3L);

                CommonUtils.printThreadLog("读取文件结束");
            }
        });
        CommonUtils.printThreadLog("here are not blacked,main continue");
        CommonUtils.sleepSecond(4L); // 此处休眠 为的是等待CompletableFuture背后的线程池执行完成。
        CommonUtils.printThreadLog("main end");
    }

}
