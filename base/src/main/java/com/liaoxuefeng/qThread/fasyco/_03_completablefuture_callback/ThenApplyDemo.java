package com.liaoxuefeng.qThread.fasyco._03_completablefuture_callback;

import com.liaoxuefeng.qThread.fasyco.utils.CommonUtils;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/24 下午6:03
 */
public class ThenApplyDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 需求：异步读取filter_words.txt文件中的内容，读取完成后，把内容转换成数组（敏感词数组），异步任务返回敏感词数组
        CommonUtils.printThreadLog("main start");

        CompletableFuture<String> newFuture = CompletableFuture.supplyAsync(() -> {
            CommonUtils.printThreadLog("读取filter_words文件");
            return CommonUtils.readFile("base/src/main/resources/data/filter_words.txt");
        });

        CompletableFuture<String[]> filterWordsFuture = newFuture.thenApply((content) -> {
            CommonUtils.printThreadLog("把雇佣兵内容转换成敏感词数组");
            String[] filterWords = content.split(",");
            return filterWords;
        });

        CommonUtils.printThreadLog("main continue");
        String[] filterWords = filterWordsFuture.get();
        System.out.println("Arrays.toString(filterWords) = " + Arrays.toString(filterWords));
        CommonUtils.printThreadLog("main end");


    }

}
