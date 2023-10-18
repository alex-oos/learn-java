package com.liaoxuefeng.qThread.eThreadPool;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @autoer Alex
 * @since: 2023/9/18 下午4:02
 * @Descprition:
 */
public class CompletableFutureDemo {

    public static Double fetchPrice() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        if (Math.random() < 0.3) {
            throw new RuntimeException("fetch price failed!");
        }
        return 5 + Math.random() * 20;
    }

    public static String queryCode(String name) {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        return "601857";
    }

    public static Double fetchPrice(String code) {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        return 5 + Math.random() * 20;
    }

    /**
     * CompletableFuture 其实与future 一样，都是用来接收线程执行的结果 ，他可以传入回调对象，当异步任务完成或发生异常时，自动调用回调对象的回调方法
     * <p>
     * CompletableFuture的优点是：
     * 异步任务结束时，会自动回调某个对象的方法；
     * 异步任务出错时，会自动回调某个对象的方法；
     * 主线程设置好回调后，不再关心异步任务的执行。
     */
    public static void function() throws InterruptedException {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 5, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue<>(10), new ThreadPoolExecutor.CallerRunsPolicy());
        // 创建异步执行任务：
        // 通过：CompletableFuture.supplyAsync() 实现，其实就是实现了Supplier接口，需要一个实现Supplier接口的对象 和线程池对象
        CompletableFuture<Double> completableFuture = CompletableFuture.supplyAsync(() -> fetchPrice(), executor);
        // 如果执行成功
        completableFuture.thenAccept((result) -> {
            System.out.println("price = " + result);
        });
        // 如果运行异常
        completableFuture.exceptionally(((e) -> {
            e.printStackTrace();
            return null;
        }));
        Thread.sleep(200);

    }

    /**
     * 使用com
     */
    public static void f2() {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 5, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue<>(100), new ThreadPoolExecutor.CallerRunsPolicy());
        // 第一个任务
        CompletableFuture cfQuery = CompletableFuture.supplyAsync(() -> {
            return queryCode("中国石油");
        }, executor);
        // 执行完执行下一个任务
        // cfQuery.thenAcceptAsync(((code) -> {
        //     return fetchPrice((String) code);
        // }), executor);

    }

    public static void main(String[] args) throws InterruptedException {

        function();
        f2();
    }

}
