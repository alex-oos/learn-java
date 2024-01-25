package com.liaoxuefeng.qThread.fasync._02_completablefuture_create;

import com.liaoxuefeng.qThread.fasync.utils.CommonUtils;

import java.util.concurrent.CompletableFuture;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/24 下午5:11
 */
public class RunAsyncDemo2 {

    public static void main(String[] args) {

        CommonUtils.printThreadLog("main start");
        // runAsync 创建异步任务
        // 方式二：使用Lambda表达式
        CompletableFuture.runAsync(() -> {
            CommonUtils.printThreadLog("读取文件开始：");
            // 使用睡眠来模拟一个长时间的工作任务（例如读取文件，网络请求等）
            CommonUtils.sleepSeconds(3);
            CommonUtils.printThreadLog("读取文件结束");
        });
        CommonUtils.printThreadLog("here are not blacked,main continue");
        CommonUtils.sleepSeconds(4); // 此处休眠 为的是等待CompletableFuture背后的线程池执行完成。
        CommonUtils.printThreadLog("main end");

    }

}
