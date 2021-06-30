package com.liaoxuefeng.qThread.aThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author LiJiang
 * @since 2021/6/30 15:46
 * <p>
 * 用线程池的方式创建线程
 * Executor 的工具类可以创建三种类型的普通线程池
 * 1.FixThreadPool(int n); 固定大小的线程池
 * 使用于为了满足资源管理需求而需要限制当前线程数量的场合。使用于负载比较重的服务器。
 * 2.SingleThreadPoolExecutor :单线程池
 * <p>
 * 3.CashedThreadPool(); 缓存线程池
 *
 * </p>
 */
public class MyThreadPool {


    /**
     * 方式一：实现   FixThreadPool方法
     */
    public static void fixThreadPool() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10; j++) {
                        System.out.println(Thread.currentThread().getName() + j);
                    }
                }
            });

        }
        executorService.shutdown();

    }

    /**
     * 方式二：singleThreadPoolExecutor 单线程池
     */

    public static void singleThreadPoolExecutor() {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            singleThreadExecutor.submit(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 5; j++) {
                        System.out.println(Thread.currentThread().getName() + j);
                    }
                }
            });
        }

        singleThreadExecutor.shutdown();

    }

    /**
     * 方式三：缓存线程池
     */
    public static void cashedThreadPool() {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            cachedThreadPool.submit(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 5; j++) {
                        System.out.println(Thread.currentThread().getName() + j);
                    }
                }
            });
        }

        cachedThreadPool.shutdown();
    }

    public static void main(String[] args) {
        fixThreadPool();
        singleThreadPoolExecutor();
        cashedThreadPool();
    }
}
