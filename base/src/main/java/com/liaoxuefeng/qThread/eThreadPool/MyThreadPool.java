package com.liaoxuefeng.qThread.eThreadPool;

import java.util.concurrent.*;

/**
 * @author ALex
 * @since 2021/6/30 15:46
 * 学习教程：https://www.bootwiki.com/note/java-cocurency-multi-thread.html
 * 学习教程：https://blog.csdn.net/qq_40420720/article/details/125774315
 * 线程池的概念：<br>
 * 管理一组工作线程的资源池，线程池与工作队列密切相关，工作队列中保存了所有等待执行的任务。工作者线程的任务就是从工作队列中获取一个任务，执行任务，然后返回线程池并等待下一个任务 <br>
 * Executor 的工具类可以创建三种类型的普通线程池 <br>
 * 1.FixThreadPool(int n); 固定大小的线程池<br>
 * 使用于为了满足资源管理需求而需要限制当前线程数量的场合。使用于负载比较重的服务器。<br>
 * 2.SingleThreadPoolExecutor :单线程池<br>
 * 3.CashedThreadPool(); 缓存线程池<br>
 */
public class MyThreadPool {


    /**
     * 方式一：实现   FixThreadPool方法
     * 创建固定大小的线程池
     */
    public static void fixThreadPool() {

        int numberOfThreads = 1; // 指定线程池中的线程数量
        // 创建一个固定大小的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        // 提交任务给线程池 10个线程，每个线程执行10次
        for (int i = 0; i < 5; i++) {
            // 提交任务
            executorService.submit(new Runnable() {
                @Override
                public void run() {

                    for (int j = 0; j < 10; j++) {
                        System.out.println(Thread.currentThread().getName() + "  " + j);
                    }
                }
            });

        }
        // 关闭任务：它会等待正在执行的任务先完成，然后再关闭
        executorService.shutdown();
    }

    /**
     * 方式二：singleThreadPoolExecutor 单线程池
     * /单线程化
     */

    public static void singleThreadPoolExecutor() {


        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            singleThreadExecutor.submit(new Runnable() {
                @Override
                public void run() {

                    for (int j = 0; j < 5; j++) {
                        System.out.println(Thread.currentThread().getName() + "  " + j);
                    }
                }
            });
        }

        singleThreadExecutor.shutdown();

    }

    /**
     * 方式三：缓存线程池 缓存类型，大小不受限制
     */
    public static void cashedThreadPool() {

        // 1、创建一个可缓存的线程池对象
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        // 2、线程池提交任务
        for (int i = 0; i < 10; i++) {
            cachedThreadPool.submit(new Runnable() {
                @Override
                public void run() {

                    for (int j = 0; j < 5; j++) {
                        System.out.println(Thread.currentThread().getName() + "-----" + j);
                    }
                }
            });
        }


        // 3.关闭线程池，
        cachedThreadPool.shutdown();

    }

    /**
     * 方式四：使用 ThreadPoolExecutor构造函数创建 (推荐使用这种方式）
     * 参数一：corePoolSize:核心线程数
     * 参数二：maximumPoolSize:最大线程数 (最大线程数 = 核心线程数 + 非核心线程数)
     * 参数三：keepAliveTime:线程空闲时间
     * 参数四：unit: 参数keepAliveTime的时间单位，比如秒，分，小时，天等 TimeUnit.SECONDS,TimeUnit.MINUTES,TimeUnit.HOURS,TimeUnit.DAYS 等等
     * 参数五：workQueue:任务队列，
     * 1. linkedBlockingQueue (无界队列) ：队列长度不受限制，当请求越来越多时(任务处理速度跟不上任务提交速度造成请求堆积)可能导致内存占用过多或OOM
     * 2. ArrayBlockingQueue,（有界队列） 队列长度受限，当队列满了就需要创建多余的线程来执行任务
     * 3. SynchronousQueue,（同步移交队列） 队列不作为任务的缓冲方式，可以简单理解为队列长度为零
     * DelayedWorkQueue （）
     * 参数六：threadFactory:线创建线程的工厂类，默认使用Executors.defaultThreadFactory()，也可以使用guava库的ThreadFactoryBuilder来创建
     * 参数七：handler:饱和策略/拒绝处理任务时的策略
     * AbortPolicy：中断抛出异常
     * DiscardPolicy：默默丢弃任务，不进行任何通知
     * DiscardOldestPolicy：丢弃掉在队列中存在时间最久的任务
     * CallerRunsPolicy：让提交任务的线程去执行任务(对比前三种比较友好一丢丢)
     */
    public static void threadPoolExecutorTest() {
        // 获取服务器的CPU的个数
        int cpu_count = Runtime.getRuntime().availableProcessors();
        int corePoolSize = cpu_count * 2;
        int maximumPoolSize = cpu_count * 4;
        long keepAliveTime = 1L;
        // 创建线程池
        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime,
                TimeUnit.MINUTES, new LinkedBlockingQueue<>(100),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());
        // 提交任务
        threadPoolExecutor.execute(() -> {
            try {
                Thread.sleep(3 * 1000);
                System.out.println("任务1执行线程：" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        threadPoolExecutor.execute(() -> {
            System.out.println("任务2执行线程：" + Thread.currentThread().getName());
        });
        // 立刻关闭线程池  shutdownNow() 立刻关闭线程池，不管任务是否执行完毕
        threadPoolExecutor.shutdown();

    }

    public static void main(String[] args) {

        fixThreadPool();
        singleThreadPoolExecutor();
        cashedThreadPool();
        threadPoolExecutorTest();
    }

}
