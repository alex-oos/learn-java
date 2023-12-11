package com.liaoxuefeng.qThread.bStaus.threadblockqueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * <P></p>
 *
 * @author lijiang
 * @since 2023/12/11 上午10:40
 */
public class Foodie extends Thread {

    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {

        this.queue = queue;
    }

    @Override
    public void run() {

        while (true) {
            try {
                String take = queue.take();
                System.out.println("消费者取到了一碗" + take);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
