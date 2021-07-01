package com.liaoxuefeng.qThread.bStaus;


/**
 * @author LiJiang
 * @since 2021/7/1 14:19
 * <p>
 * 两个线程按照指定方式有序交叉运行呢
 * </p>
 */
public class ThreadWait {

    public static void function() {

        Object lock = new Object();

        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("INFO: A 等待锁 ");

                synchronized (lock) {
                    System.out.println("A 1");
                    try {
                        System.out.println("INFO: A 准备进入等待状态，放弃锁 lock 的控制权 ");

                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("INFO: 有人唤醒了 A, A 重新获得锁 lock");

                    System.out.println("A 2");
                    System.out.println("A 3");
                }
            }
        });

        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("INFO: B 等待锁 ");
                synchronized (lock) {
                    System.out.println("INFO: B 得到了锁 lock");
                    System.out.println("B 1");
                    System.out.println("B 2");
                    System.out.println("B 3");
                    System.out.println("INFO: B 打印完毕，调用 notify 方法 ");
                    lock.notify();
                }
            }
        });

        a.start();
        b.start();
    }

    public static void main(String[] args) {

        function();
    }

}
