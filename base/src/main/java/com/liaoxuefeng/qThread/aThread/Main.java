package com.liaoxuefeng.qThread.aThread;


/**
 * @author: 李将
 * @since: 2020/7/18 15:19
 * <p>Java用Thread对象表示一个线程，通过调用start()启动一个新线程；
 * 一个线程对象只能调用一次start()方法；
 * 线程的执行代码写在run()方法中；
 * 线程调度由操作系统决定，程序本身无法决定调度顺序；
 * Thread.sleep()可以把当前线程暂停一段时间。
 * </p>
 */

/*
 *直接调用Thread实例的run()方法是无效的：
 * */
public class Main {

    public static void main(String[] args) {
        System.out.println("main start ...");

        Thread thread = new Thread() {

            @Override
            public void run() {
                System.out.println("thread run ....");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("thread end ..");
                }
            }
        };
        thread.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("mian end ..");
        }

    }
}
