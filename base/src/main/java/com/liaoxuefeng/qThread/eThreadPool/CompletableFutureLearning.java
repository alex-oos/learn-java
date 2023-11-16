package com.liaoxuefeng.qThread.eThreadPool;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * <P>
 * completableFuture 教程：https://juejin.cn/post/6844903594165026829#heading-4
 * completableFuture：异步任务，用于异步任务创建
 * </p>
 *
 * @author Alex
 * @since 2023/11/13 上午10:25
 */
public class CompletableFutureLearning {


    /**
     * 创建CompletableFuture 异步任务对象的几种方式：
     * 1. 使用runAsync()执行异步无返回值的任务:
     * 2. 使用supplyAsync()执行异步有返回值的任务
     */
    public static void createAsyncTask() throws ExecutionException, InterruptedException {
        // 1、使用runAsync()执行异步无返回值的任务:，返回的CompletableFuture对象的get()方法永远返回null
        // 传入Runnable对象，CompletableFuture会自动在一个新线程中执行
        CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("I'll run in a separate thread than the main thread.");

            }
        });
        // 获取异步执行结果，如果执行结果还没有返回，主线程就会阻塞等待
        future.get();

        // 参数传递，传入一个lambda表达式的形式传入Runnable对象
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I'll run in a separate thread than the main thread.");
        });
        // 获取异步执行结果，如果执行结果还没有返回，主线程就会阻塞等待
        future1.get();

        // 2、使用supplyAsync()执行异步有返回值的任务，传入的参数为Supplier对象，CompletableFuture会自动在一个新线程中执行，
        // 并将返回值传递给CompletableFuture对象的完成回调方法
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Result of the asynchronous computation";
        });
        String result = future2.get();
        System.out.println("result = " + result);


    }

    /**
     * 任务异步回调：
     * 1. 使用thenApply()处理正常结果
     * thenApply() 可以使用 thenApply() 处理和改变CompletableFuture的结果。持有一个Function<R,T>作为参数。Function<R,T>是一个简单的函数式接口，接受一个T类型的参数，产出一个R类型的结果。
     * 2. 使用thenAccept()处理正常结果但不返回值
     */
    public static void taskAsyncCallback() throws ExecutionException, InterruptedException {

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            return "hello world";
        }).thenApply(s -> {
            return s.toUpperCase();
        });
        String s = future.get();
        System.out.println("thenApply的用法" + s);

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            return "hello world";
        });
        // 获取异步执行结果，如果执行结果还没有返回，主线程就会阻塞等待
        String unused = future1.get();
        System.out.println("unused = " + unused);
        // thenAccept() 也是接收一个Consumer<T>类型的参数，Consumer<T>是一个消费型的函数式接口，接受一个T类型的参数，不返回结果。
        // 与thenApply()不同的是，thenAccept()不会将CompletableFuture的结果作为参数传递给该函数式接口，而是直接在CompletableFuture上应用该函数。
        future1.thenAccept(s1 -> {
            System.out.println("thenAccept的用法:" + s1);
        });
        // thenAccept 与get 方法的区别：thenAccept()是异步执行的，而get()是同步执行的，会阻塞等待结果返回
        // thenAccept不会有线程的上下文切换。而get()方法会有线程的上下文切换。
        // 当资源可以不受线程执行影响的时候，建议用thenAccept，比如netty中获取到结果后，通过channel发送发送消息，用thenAccept应该比get更优！


    }


    /**
     * 异步任务编排：
     * 1. 使用thenCompose()实现多个CompletableFuture的串行执行
     * 2. 使用thenCombine()实现多个CompletableFuture的并行执行
     * 3. 使用allOf()实现多个CompletableFuture的并行执行
     * 4. 使用anyOf()实现多个CompletableFuture的并行执行
     */
    public static void function() {

    }

    /**
     * 异常处理：
     * 1. 使用exceptionally()处理异常
     * 2. 使用handle()处理异常
     * 3. 使用whenComplete()处理异常
     * 4. 使用handleAsync()处理异常
     * 5. 使用whenCompleteAsync()处理异常
     * 6. 使用exceptionallyCompose()处理异常
     * 7. 使用handleCompose()处理异常
     */
    public static void function1() {

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        createAsyncTask();
        taskAsyncCallback();
    }


}
