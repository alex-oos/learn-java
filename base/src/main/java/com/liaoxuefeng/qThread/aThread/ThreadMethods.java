package com.liaoxuefeng.qThread.aThread;

/**
 * <P>
 * 线程内常用的一些方法
 * </p>
 *
 * @author Alex
 * @since 2023/11/23 上午11:20
 */
public class ThreadMethods {

    public static void function() {

        Thread t1 = new Thread(new MyRunnable());
        t1.setName("t1");
        Thread t2 = new Thread(new MyRunnable());
        t2.setName("t2");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("t1优先级:" + t1.getPriority());
        System.out.println("t2优先级:" + t2.getPriority());
        t1.start();// 开始线程
        t2.start();
    }


    public static void main(String[] args) {

    }

}
