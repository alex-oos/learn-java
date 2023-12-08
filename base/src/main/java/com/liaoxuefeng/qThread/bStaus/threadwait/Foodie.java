package com.liaoxuefeng.qThread.bStaus.threadwait;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/6 下午6:03
 */
public class Foodie extends Thread {


    /**
     * 1、先写一个循环
     * 2.同步代码块
     * 3. 判断共享数据是否到达了末尾（到了）
     * 4. 判断共享数据是否到到达了末尾（没有到）
     */


    @Override
    public void run() {

        while (true) {
            synchronized (Desk.lock) {
                // 面条吃完了，结束
                if (Desk.count == 0) {
                    break;
                } else {
                    //     1、先判断桌子上是否有面条
                    //     2、如果没有就等待
                    //     3.如果有就开吃
                    //     4、吃完之后，唤醒厨师
                    //     把吃的总数-1，
                    //     最后修改面条

                    if (Desk.foodFlag == 0) {
                        try {
                            Desk.lock.wait(); // 将当前线程跟锁对象进行绑定
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        Desk.count--;
                        System.out.println("吃货正在吃一碗面条，该食材还能在做" + Desk.count + "碗");
                        Desk.lock.notifyAll();
                        Desk.foodFlag = 0;

                    }

                }

            }
        }

    }

}
