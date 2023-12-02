package com.liaoxuefeng.qThread.fasync._02_completablefuture_create;

import com.liaoxuefeng.qThread.fasync.utils.CommonUtils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/24 下午5:54
 */
public class SupplyAsyncDemo3 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 需求： 开启异步任务读取news.txt文件中的新闻稿，返回文件中内容并在主线程打印输出
        ExecutorService executor = Executors.newFixedThreadPool(5);
        CommonUtils.printThreadLog("main start");
        // 使用Lambda表达式
        CompletableFuture<String> newsFuture = CompletableFuture.supplyAsync(() -> {
            CommonUtils.printThreadLog("异步读取文件开始");
            return CommonUtils.readFile("base/src/main/resources/data/news.txt");
        }, executor);

        CommonUtils.printThreadLog("here not blacked,main continue");
        // 阻塞并等待newsFuture完成
        String news = newsFuture.get();
        System.out.println("news = " + news);
        // 关闭线程池
        executor.shutdown();
        CommonUtils.printThreadLog("main end");

    }

}
