package com.liaoxuefeng.qThread.bStaus.threadsafe;

import java.util.concurrent.TimeUnit;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/6 下午3:22
 */
public class MyRunnable implements Runnable {

    // 场景：某电影院正在上映国产大片，共有100张票，而它有3个窗口卖票，设计一个程序模拟该电影院卖票
    // 使用同步方法来实现

    // 定义的共享数据
    int ticket = 0;
    // 1.循环
    // 2.同步代码块，同步方法
    // 3.判断共享数据是否到达了末尾，如果到了末尾就结束

    @Override
    public void run() {

        while (true) {
            if (method()) break;
        }

    }

    private synchronized boolean method() {

        if (ticket < 100) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "：正在售卖第" + ticket + "张票！");
        } else {
            System.out.println("票已经售罄！");
            return true;
        }
        return false;
    }


}
