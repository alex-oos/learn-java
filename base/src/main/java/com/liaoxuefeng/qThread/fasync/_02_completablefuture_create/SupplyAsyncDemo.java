package com.liaoxuefeng.qThread.fasync._02_completablefuture_create;

import com.liaoxuefeng.qThread.fasync.utils.CommonUtils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/24 下午5:42
 */
public class SupplyAsyncDemo {

    /**
     * CompletableFuture.supplyAsync（）创建有返回值的异步线程
     * static <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier)
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 需求： 开启异步任务读取news.txt文件中的新闻稿，返回文件中内容并在主线程打印输出
        CommonUtils.printThreadLog("main start");
        // 方式一：使用 匿名类
        CompletableFuture<String> newsFuture = CompletableFuture.supplyAsync(new Supplier<String>() {

            @Override
            public String get() {

                CommonUtils.printThreadLog("读取文件");
                return CommonUtils.readFile("base/src/main/resources/data/news.txt");

            }
        });

        CommonUtils.printThreadLog("here not blacked,main continue");
        // 阻塞并等待newsFuture完成
        String news = newsFuture.get();
        System.out.println("news = " + news);
        CommonUtils.printThreadLog("main end");


    }

}
