package com.liaoxuefeng.qThread.bStaus.threadsafe;

import java.util.concurrent.FutureTask;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/6 下午4:52
 */
public class LockDemo {

    public static void main(String[] args) {

        MyCallable callable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(callable);

        Thread t1 = new Thread(futureTask);
        Thread t2 = new Thread(futureTask);
        Thread t3 = new Thread(futureTask);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }

}
