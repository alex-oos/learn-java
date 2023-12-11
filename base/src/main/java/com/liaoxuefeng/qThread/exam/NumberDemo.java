package com.liaoxuefeng.qThread.exam;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/11 下午6:39
 */
public class NumberDemo {

    /**
     * 同时开启两个线程，共同获取1-100之间的所有数字
     * 要求，输出所有的奇数
     *
     * @param args
     */
    public static void main(String[] args) {

        Number number = new Number();
        FutureTask<Integer> futureTask = new FutureTask<>(number);

        Thread t1 = new Thread(futureTask);
        Thread t2 = new Thread(futureTask);
        t1.start();
        t2.start();

        try {
            Integer i = futureTask.get();
            System.out.println(i);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

    }

}
