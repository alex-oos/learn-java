package com.liaoxuefeng.qThread.fasyco._02_completablefuture_create;

import com.liaoxuefeng.qThread.fasyco.utils.CommonUtils;

import java.util.concurrent.CompletableFuture;

/**
 * <P>
 * 需求：使用CompletableFuture开启异步任务读取news.txt文件中的新闻稿，并打印输出。
 * </p>
 *
 * @author Alex
 * @since 2023/11/24 下午5:29
 */
public class RunAsyncDemo3 {

    public static void main(String[] args) {

        // 需求：使用CompletableFuture开启异步任务读取news.txt文件中的新闻稿，并打印输出。
        CommonUtils.printThreadLog("main start");
        CompletableFuture.runAsync(() -> {
            CommonUtils.printThreadLog("读取文件！");
            String content = CommonUtils.readFile("base/src/main/resources/data/news.txt");
            System.out.println(content);
        });
        CommonUtils.printThreadLog("here not blacked main continue");
        CommonUtils.sleepSecond(4);
        CommonUtils.printThreadLog("main end");
    }

}
