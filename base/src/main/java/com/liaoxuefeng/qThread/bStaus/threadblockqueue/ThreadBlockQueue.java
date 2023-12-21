package com.liaoxuefeng.qThread.bStaus.threadblockqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/11 上午10:21
 */
public class ThreadBlockQueue {


    // 阻塞队列的用法
    public static void arrayBlockQueue() {
        // 创建了一个有界阻塞队列，并且指定大小为1，必须指定大小
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        try {
            // 向队列里面存放了一条数据
            queue.put("面条");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            // 从队列中取出数据
            String take = queue.take();
            System.out.println(take);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void linkedBlockingQueue() {

        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>(1);
        try {
            // 存放数据
            queue.put("数据");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String take = null;
        try {
            // 取出数据
            take = queue.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(take);
    }


    /*
     * 使用阻塞队列来实现等待唤醒机制，即生产者消费者模式
     *  场景： 厨师做了一碗面条，美食家来吃掉它
     *  使用阻塞队列方式来实现它
     * 细节：生产者和消费者必须在同一个阻塞队列中
     *
     *  */
    public static void main(String[] args) {

        // arrayBlockQueue();
        // linkedBlockingQueue();

        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        Cookie cookie = new Cookie(queue);

        Foodie foodie = new Foodie(queue);

        cookie.start();
        foodie.start();
    }

}
