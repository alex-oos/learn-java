package com.liaoxuefeng.qThread.eThreadPool;

import java.util.concurrent.*;

/**
 * @autoer Alex
 * @since: 2023/9/18 下午3:45
 * @Descprition: futrue 是用来接收线程执行的结果
 */
public class FutureDemo {

    /**
     * Future
     */
    public static void function() throws ExecutionException, InterruptedException, TimeoutException {

        // 创建线程池
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue<>(100), new ThreadPoolExecutor.CallerRunsPolicy());
        // 定义了一个任务，实现了Callable接口 ，使用 实现了Callable接口 创建任务，是因为其call 有返回值的状态
        Callable<String> task = new Task();
        // 当我们提交一个Callable任务后，我们会同时获得一个Future对象，然后，我们在主线程某个时刻调用Future对象的get()方法，就可以获得异步执行的结果。在调用get()时，如果异步任务已经完成，我们就直接获得结果。如果异步任务还没有完成，那么get()会阻塞，直到任务完成后才返回结果。
        Future<String> future = executor.submit(task);

        // future 中常用的方法有：
        // 1、get()：获取结果（可能会等待）
        String result = future.get();
        // 2、get(long timeout, TimeUnit unit)：获取结果，但只等待指定的时间；
        future.get(10L, TimeUnit.SECONDS);
        // 3、cancel(boolean mayInterruptIfRunning)：取消当前任务；
        future.cancel(true);
        // 4、isDone()：判断任务是否已完成
        future.isDone();
        System.out.println("result = " + result);


    }

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        function();
    }

}
