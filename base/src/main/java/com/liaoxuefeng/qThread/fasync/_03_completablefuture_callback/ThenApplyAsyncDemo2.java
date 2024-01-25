package com.liaoxuefeng.qThread.fasync._03_completablefuture_callback;

import com.liaoxuefeng.qThread.fasync.utils.CommonUtils;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * <P></p>
 *
 * @author lijiang
 * @since 2024/1/25 上午11:22
 */
public class ThenApplyAsyncDemo2 {

    /**
     * thenApplyAsync 用法，使用的时候是在线程池中重新创建一个线程在拿到结果
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 回顾： 异步读取filter_words.txt文件中的内容，读取完成后，转换成敏感词数组，主线程获取结果打印输出这个数组
        CommonUtils.printThreadLog("main start");
        CompletableFuture<String[]> future = CompletableFuture.supplyAsync(() -> {
            CommonUtils.printThreadLog("读取filter_words的文件");
            return CommonUtils.readFile("base/src/main/resources/data/filter_words.txt");
        }).thenApplyAsync(content -> {
            CommonUtils.printThreadLog("把文件内容转换成敏感词数组");
            return content.split(",");
        });
        CommonUtils.printThreadLog("main continue");
        String[] filterWords = future.get();
        CommonUtils.printThreadLog("filterWords = " + Arrays.toString(filterWords));
        CommonUtils.printThreadLog("main end");

    }

}
