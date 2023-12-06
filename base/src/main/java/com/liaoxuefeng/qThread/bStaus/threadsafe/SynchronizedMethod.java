package com.liaoxuefeng.qThread.bStaus.threadsafe;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/6 下午3:29
 */
public class SynchronizedMethod {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();

        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        Thread t3 = new Thread(myRunnable);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }

}
