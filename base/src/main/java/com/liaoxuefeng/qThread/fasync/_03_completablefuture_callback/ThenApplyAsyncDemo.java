package com.liaoxuefeng.qThread.fasync._03_completablefuture_callback;

import com.liaoxuefeng.qThread.fasync.utils.CommonUtils;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * <P></p>
 *
 * @author lijiang
 * @since 2024/1/25 上午11:02
 */
public class ThenApplyAsyncDemo {

    /**
     * 总结
     * 一般而言，commonPool为了提高性能，并不会立马收回线程
     * thenApply中回调任务和supplyAsync中的异步任务使用的是同一个线程
     * 特殊情况
     * 如果supplyAsync中的任务是立即返回结果（不是耗时的任务），那么thenApply回调任务也会在主线程执行
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 回顾： 异步读取filter_words.txt文件中的内容，读取完成后，转换成敏感词数组，主线程获取结果打印输出这个数组
        CommonUtils.printThreadLog("main start");

        CompletableFuture<String[]> future = CompletableFuture.supplyAsync(() -> {
            CommonUtils.printThreadLog("读取filter_words的文件");
            // return CommonUtils.readFile("base/src/main/resources/data/filter_words.txt");
            return "尼玛,NB,tmd";
        }).thenApply(content -> {
            CommonUtils.printThreadLog("把文件内容转换成敏感词数组");
            return content.split(",");
        });
        CommonUtils.printThreadLog("main continue");
        String[] filterWords = future.get();
        CommonUtils.printThreadLog("filterWords = " + Arrays.toString(filterWords));
        CommonUtils.printThreadLog("main end");


    }

}
