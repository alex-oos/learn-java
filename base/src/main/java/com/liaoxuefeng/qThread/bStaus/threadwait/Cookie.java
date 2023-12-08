package com.liaoxuefeng.qThread.bStaus.threadwait;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/6 下午5:52
 */
public class Cookie extends Thread {


    @Override
    public void run() {
        // 1、先写循环
        // 2、写一个同步代码块
        // 3、判断 共享数据中是否到了末尾（到了末尾）
        // 4、判断共享数据是否到了末尾（没有）
        while (true) {
            synchronized (Desk.lock) {

                if (Desk.count == 0) {
                    break;
                } else {
                    // 判断桌子上是否有食物
                    // 如果有，就等待
                    // 如果没有就制作食物
                    // 修改桌子上食物的状态
                    // 唤醒等待的消费者开吃
                    if (Desk.foodFlag == 1) {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        System.out.println("厨师正在做了一碗面条！");
                        Desk.foodFlag = 1;
                        Desk.lock.notifyAll();

                    }
                }


            }
        }


    }


}
