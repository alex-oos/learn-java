package com.liaoxuefeng.qThread.bStaus.threadsafe;

import java.util.concurrent.TimeUnit;

/**
 * <P>
 *
 * </p>
 *
 * @author Alex
 * @since 2023/12/6 下午2:40
 */
public class MyThread extends Thread {
    // 场景：某电影院正在上映国产大片，共有100张票，而它有3个窗口卖票，设计一个程序模拟该电影院卖票
    // 存在3个问题：
    // 1、三个窗口在售卖同一张票
    // 2、票会被超卖
    // 最终原因：线程的随机性，随机执行的时候会进行抢夺资源，导致变量ticket没有被修改，从而售卖同一张票
    // 解决方案：线程A售卖票1的时候将其锁住，线程A售卖完毕，然后再让B进行售卖其他票，从而开始使用同步代码块

    static int ticket = 0;  // 0-99

    // 锁对象，锁对象必须是唯一的，加入static 变成一个唯一值
    static Object object = new Object();

    @Override
    public void run() {

        while (true) {
            // 同步代码块
            // 锁一个对象 一般使用的是当前类的字节码，用其保证唯一性
            synchronized (MyThread.class) {
                // synchronized (object) {
                if (ticket < 100) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(this.getName() + ",正在售卖，第" + ticket + "张票！");
                } else {
                    System.out.println("票已经售罄！");
                    break;
                }
            }

        }

    }


}
