package com.liaoxuefeng.qThread.fasync._03_completablefuture_callback;

import com.liaoxuefeng.qThread.fasync.utils.CommonUtils;

import java.util.concurrent.CompletableFuture;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/30 下午2:38
 */
public class ThenRunDemo {

    public static void main(String[] args) {
        // 演示案例： 我们仅仅想知道敏感词汇的文件是否读取完成
        CommonUtils.printThreadLog("main start");

        CompletableFuture.supplyAsync(() -> {
            CommonUtils.printThreadLog("读取filter_words文件");
            String filterWordContent = CommonUtils.readFile("base/src/main/resources/data/filter_words.txt");
            return filterWordContent;
        }).thenRun(() -> {
            CommonUtils.printThreadLog("读取filter_words文件读取完成");

        });
        CommonUtils.printThreadLog("main continue");
        CommonUtils.sleepSecond(4);
        CommonUtils.printThreadLog("main end");
    }

}
