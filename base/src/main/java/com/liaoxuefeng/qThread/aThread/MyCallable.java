package com.liaoxuefeng.qThread.aThread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author: 李将
 * @since: 2020/7/13 16:32
 * @Descprition:
 */
public class MyCallable implements Callable<Integer> {
    public static void main(String[] args) {
        MyCallable callable = new MyCallable();
        FutureTask<Integer> f1 = new FutureTask<>(callable);
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
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

    @Override
    public Integer call() throws Exception {
        int i = 0;
        while (i < 7) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
        return i;
    }
}
