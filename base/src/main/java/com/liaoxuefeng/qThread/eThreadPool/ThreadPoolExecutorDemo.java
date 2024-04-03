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
     * 线程池按以下行为执行任务 1. 当线程数小于核心线程数时，创建线程。
     * 2. 当线程数大于等于核心线程数，且任务队列未满时，将任务放入任务队列。
     * 3. 当线程数大于等于核心线程数，且任务队列已满 -1
     * 若线程数小于最大线程数，创建线程 -2 若线程数等于最大线程数，抛出异常，拒绝任务
     * <p>
     * 说明: 1、默认值 * corePoolSize=1 * queueCapacity=Integer.MAX_VALUE * maxPoolSize=Integer.MAX_VALUE * keepAliveTime=60s
     * * allowCoreThreadTimeout=false * rejectedExecutionHandler=AbortPolicy() 2、如何来设置 * 需要根据几个值来决定 - tasks
     * ：每秒的任务数，假设为1000 - taskcost：每个任务花费时间，假设为0.1s - responsetime：系统允许容忍的最大响应时间，假设为1s * 做几个计算 - corePoolSize =
     * 每秒需要多少个线程处理？ *
     * 一颗CPU核心同一时刻只能执行一个线程，然后操作系统切换上下文，核心开始执行另一个线程的代码，以此类推，超过cpu核心数，就会放入队列，如果队列也满了，就另起一个新的线程执行，所有推荐：corePoolSize =
     * ((cpu核心数 * 2) + 有效磁盘数)，java可以使用Runtime.getRuntime().availableProcessors()获取cpu核心数 - queueCapacity =
     * (coreSizePool/taskcost)*responsetime * 计算可得 queueCapacity = corePoolSize/0.1*1。意思是队列里的线程可以等待1s，超过了的需要新开线程来执行 *
     * 切记不能设置为Integer.MAX_VALUE，这样队列会很大，线程数只会保持在corePoolSize大小，当任务陡增时，不能新开线程来执行，响应时间会随之陡增。 - maxPoolSize = (max(tasks)-
     * queueCapacity)/(1/taskcost) * 计算可得 maxPoolSize = (1000-corePoolSize)/10，即(每秒并发数-corePoolSize大小) / 10 *
     * （最大任务数-队列容量）/每个线程每秒处理能力 = 最大线程数 - rejectedExecutionHandler：根据具体情况来决定，任务不重要可丢弃，任务重要则要利用一些缓冲机制来处理 -
     * keepAliveTime和allowCoreThreadTimeout采用默认通常能满足 计算密集型线程池：数量一般为 N+1个 N为CPU核心数 IO密集型：数量一般为：2N + 1个 N为CPU核心数
     */
    private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();

    private static final int CORE_POOL_SIZE = CPU_COUNT * 2;

    private static final int MAX_POOL_SIZE = CPU_COUNT * 4;


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
