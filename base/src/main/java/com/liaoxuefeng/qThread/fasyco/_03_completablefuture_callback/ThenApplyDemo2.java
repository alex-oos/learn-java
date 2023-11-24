package com.liaoxuefeng.qThread.fasyco._03_completablefuture_callback;

import com.liaoxuefeng.qThread.fasyco.utils.CommonUtils;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * <P></p>
 *
 * @author lijiang
 * @since 2023/11/24 下午6:16
 */
public class ThenApplyDemo2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CommonUtils.printThreadLog("main start");
        // 链式操作
        CompletableFuture<String[]> filterWordsFuture = CompletableFuture.supplyAsync(() -> {
            CommonUtils.printThreadLog("读取filter_words文件");
            String filterWordContent = CommonUtils.readFile("base/src/main/resources/data/filter_words.txt");
            return filterWordContent;
        }).thenApply((content) -> {
            String[] filterWords = content.split(",");
            return filterWords;

        });

        CommonUtils.printThreadLog("main continue");
        String[] filterWords = filterWordsFuture.get();
        System.out.println("Arrays.toString(filterWords) = " + Arrays.toString(filterWords));
        CommonUtils.printThreadLog("main end");
    }

}
