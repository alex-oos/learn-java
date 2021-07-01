package com.liaoxuefeng.qThread.bStaus;


import com.sun.jdi.PathSearchingVirtualMachine;

/**
 * @author LiJiang
 * @since 2021/7/1 14:05
 * <p>
 * join()方法使用,一个线程等待另一个线程，直到等待结束，可以指定等待时间，超过等待时间线程仍然没有结束就不再等待；
 * </p>
 * <p>
 * 假设有两个线程，一个是线程 A，另一个是线程 B， B 在 A 全部打印 完后再开始打印呢
 * </p>
 */
public class ThreadJoin {

    public static void function() {

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {

                printNumber("线程A-" + Thread.currentThread().getId());
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    threadA.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                printNumber("线程B-" + Thread.currentThread().getId());
            }
        });

        threadA.start();
        threadB.start();

    }

    public static void printNumber(String threadName) {

        int i = 0;
        while (i++ < 3) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " print:  " + i);
        }
    }

    public static void main(String[] args) {

        function();
    }

}
