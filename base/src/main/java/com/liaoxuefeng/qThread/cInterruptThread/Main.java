package com.liaoxuefeng.qThread.cInterruptThread;

/**
 * @author: 李将
 * @since: 2020/8/27 上午 7:21
 * @Descprition: 中断线程
 * <p>
 * 线程间共享变量需要使用volatile关键字标记，确保每个线程都能读取到更新后的变量值
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        HelloThread t = new HelloThread();
        t.start();
        Thread.sleep(1);
        t.running = false;

    }
}

class HelloThread extends Thread {

    public volatile boolean running = true;


    @Override
    public void run() {
        int n = 0;
        while (running) {
            n++;
            System.out.println(n + " hello!");
        }

        System.out.println("end");
    }
}
