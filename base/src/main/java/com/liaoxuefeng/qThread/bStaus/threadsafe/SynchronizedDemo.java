package com.liaoxuefeng.qThread.bStaus.threadsafe;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/6 下午2:45
 */
public class SynchronizedDemo {

    // 同步代码块的实际应用
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }

}
