package com.liaoxuefeng.qThread.fasync._03_completablefuture_callback;

import com.liaoxuefeng.qThread.fasync.utils.CommonUtils;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/30 下午2:32
 */
public class ThenAcceptDemo {

    /**
     * 异步任务回调：
     * 1、thenAccept()
     */
    public static void main(String[] args) {
        // 需求：异步读取filter_words.txt文件中的内容，读取完成后，把内容转换成敏感词数组，然后打印敏感词数组
        CommonUtils.printThreadLog("main start");
        // 链式操作
        CompletableFuture.supplyAsync(() -> {
            CommonUtils.printThreadLog("读取filter_words文件");
            String filterWordContent = CommonUtils.readFile("base/src/main/resources/data/filter_words.txt");
            return filterWordContent;
        }).thenApply((content) -> {
            CommonUtils.printThreadLog("把文件内容转换成敏感词数组");
            String[] filterWords = content.split(",");
            return filterWords;
        }).thenAccept(filterWords -> {
            CommonUtils.printThreadLog("filterWorlds = " + Arrays.toString(filterWords));

        });

        CommonUtils.printThreadLog("main continue");
        CommonUtils.sleepSeconds(4);
        CommonUtils.printThreadLog("main end");
    }


}
