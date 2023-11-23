package com.liaoxuefeng.qThread.aThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Alex
 * @since 2023/11/23 16:32
 * <p>
 * 线程实现的方式三：
 * 1. 创建 Callable 接口的实现类，并实现 call() 方法，该 call() 方法将作为线程执行体，并且有返回值。
 * 2. 创建 Callable 实现类的实例，使用 FutureTask 类来包装 Callable 对象，该 FutureTask 对象封装了该 Callable 对象的 call() 方法的返回值。
 * 3. 使用 FutureTask 对象作为 Thread 对象的 target 创建并启动新线程。
 * 4. 调用 FutureTask 对象的 get() 方法来获得子线程执行结束后的返回值。
 * </p>
 */
public class MyCallable implements Callable<Integer> {


    @Override
    public Integer call() {
        // 求 1-100的和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建了一个MyCallable的对象，表示多线程要执行的任务
        MyCallable callable = new MyCallable();
        // 创建FutureTask对象（作用管理多线程运行的结果）
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        //  创建线程的对象
        Thread t1 = new Thread(futureTask);
        // 启动线程
        t1.start();
        // 获取多线程运行的结果
        Integer result = futureTask.get();
        System.out.println(result);


    }


}
