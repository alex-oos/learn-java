package com.liaoxuefeng.qThread.eThreadPool;


import com.liaoxuefeng.qThread.aThread.MyRunnable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Alex
 * @since 2021/7/1 15:28
 * <p>
 * 动态创建线程池的方式
 * </p>
 */
public class ThreadPoolExecutorDemo {

    /**
     * corePoolSize: 核心线程数为 5。
     * maximumPoolSize ：最大线程数 10
     * keepAliveTime : 等待时间为 1L。
     * unit: 等待时间的单位为 TimeUnit.SECONDS。
     * workQueue：任务队列为 ArrayBlockingQueue，并且容量为 100;
     * handler:饱和策略为 CallerRunsPolicy
     */
    private static final int CORE_POOL_SIZE = 5;

    private static final int MAX_POOL_SIZE = 10;

    private static final int QUEUE_CAPACITY = 100;

    private static final Long KEEP_ALIVE_TIME = 1L;


    public static void main(String[] args) {

        // 使用阿里巴巴推荐的创建线程池的方式
        // 通过ThreadPoolExecutor构造函数自定义参数创建
        ExecutorService executor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(QUEUE_CAPACITY), new ThreadPoolExecutor.CallerRunsPolicy());
        // i 代表线程数
        for (int i = 0; i < 10; i++) {
            // 创建WorkerThread对象（WorkerThread类实现了Runnable 接口）
            Runnable worker = new MyRunnable();
            // 执行Runnable
            executor.execute(worker);
        }
        // 终止线程池
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }

}
