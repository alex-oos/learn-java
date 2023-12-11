package com.liaoxuefeng.qThread.bStaus.threadblockqueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * <P></p>
 *
 * @author lijiang
 * @since 2023/12/11 上午10:40
 */
public class Cookie extends Thread {

    ArrayBlockingQueue<String> queue;

    public Cookie(ArrayBlockingQueue<String> queue) {

        this.queue = queue;
    }


    @Override
    public void run() {

        while (true) {
            try {
                System.out.println("生产者生产了一碗面条");
                queue.put("面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

}
