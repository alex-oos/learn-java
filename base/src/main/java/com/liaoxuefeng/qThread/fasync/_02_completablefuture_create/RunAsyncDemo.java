package com.liaoxuefeng.qThread.fasync._02_completablefuture_create;

import com.liaoxuefeng.qThread.fasync.utils.CommonUtils;

import java.util.concurrent.CompletableFuture;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/24 上午10:15
 */
public class RunAsyncDemo {

    /**
     * CompletableFuture.runAsync 创建异步线程，没有返回值
     * static CompletableFuture<Void> runAsync(Runnable runnable)
     */
    public static void main(String[] args) {

        CommonUtils.printThreadLog("main start");
        // 方式一：使用匿名内部类
        // runAsync 创建异步任务， 使用runable匿名内部类
        CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {

                CommonUtils.printThreadLog("读取文件");

                CommonUtils.sleepSeconds(3L);

                CommonUtils.printThreadLog("读取文件结束");
            }
        });
        CommonUtils.printThreadLog("here are not blacked,main continue");
        CommonUtils.sleepSeconds(4L); // 此处休眠 为的是等待CompletableFuture背后的线程池执行完成。
        CommonUtils.printThreadLog("main end");
    }

}
