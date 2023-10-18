package com.liaoxuefeng.qThread.aThread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @autoer Alex
 * @since: 2020/7/13 16:32
 * <p>
 * 1. 创建 Callable 接口的实现类，并实现 call() 方法，该 call() 方法将作为线程执行体，并且有返回值。
 * 2. 创建 Callable 实现类的实例，使用 FutureTask 类来包装 Callable 对象，该 FutureTask 对象封装了该 Callable 对象的 call() 方法的返回值。
 * 3. 使用 FutureTask 对象作为 Thread 对象的 target 创建并启动新线程。
 * 4. 调用 FutureTask 对象的 get() 方法来获得子线程执行结束后的返回值。
 */
public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int i = 0;
        while (i < 10) {
            System.out.println("子线程" + Thread.currentThread().getName() + " : " + i);
            i++;
        }
        return i;

    }

    public static void function() {

        MyCallable callable = new MyCallable();
        FutureTask<Integer> f1 = new FutureTask<>(callable);
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程： " + Thread.currentThread().getName() + " 循环变量i的值: " + i);
            if (i == 7) {
                new Thread(f1, "有返回的线程--call（）").start();
            }
        }
        try {
            System.out.println(" 有返回值的线程返回的数值：" + f1.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        function();
    }


}
