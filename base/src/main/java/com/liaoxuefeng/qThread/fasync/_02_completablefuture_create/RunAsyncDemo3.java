package com.liaoxuefeng.qThread.fasync._02_completablefuture_create;

import com.liaoxuefeng.qThread.fasync.utils.CommonUtils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * <P>
 *
 * </p>
 *
 * @author Alex
 * @since 2023/11/24 下午5:29
 */
public class RunAsyncDemo3 {

    /**
     * 练习：需求：使用CompletableFuture开启异步任务读取news.txt文件中的新闻稿，并打印输出。
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // 需求：使用CompletableFuture开启异步任务读取news.txt文件中的新闻稿，并打印输出。
        CommonUtils.printThreadLog("main start");
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            CommonUtils.printThreadLog("读取文件！");
            String content = CommonUtils.readFile("base/src/main/resources/data/news.txt");
            System.out.println(content);
        });
        Void unused = future.get();
        System.out.println(unused);
        CommonUtils.printThreadLog("here not blacked main continue");
        CommonUtils.sleepSeconds(4);
        CommonUtils.printThreadLog("main end");
    }

}
