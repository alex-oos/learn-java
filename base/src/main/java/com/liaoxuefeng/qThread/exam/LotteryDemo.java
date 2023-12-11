package com.liaoxuefeng.qThread.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/11 下午6:52
 */
public class LotteryDemo {

    /**
     * 有一个抽奖池，该抽奖池中存放了奖励的金额，该抽奖池中的奖项为
     * {10，5，20，100，200，500，800，2，80，300，700}
     * 创建两个抽奖箱（线程），设置线程分别为“抽奖箱1”，“抽奖箱2”
     * 随机从抽奖池中获取奖项元素，并打印在控制台上，格式如下
     * 每次随机抽出一个奖项就打印一个（随机）
     * 抽奖箱1 又产生了一个10元大奖
     * <p>
     * 每次抽的过程中，不打印，抽完一次性打印（随机）
     * 在此次抽奖过程中，抽奖箱1总共产生了6个奖项
     * 分别为：10，20，100，500，3，300 最高奖项为300元，总计额为932元
     * 在此次抽奖过程中，抽奖箱2 总共产生了6个奖项
     *
     * @param
     */

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 20, 100, 200, 500, 800, 2, 80, 300, 700);
        Lottery l1 = new Lottery(list);
        Lottery l2 = new Lottery(list);

        l1.setName("抽奖箱1");
        l2.setName("抽奖箱2");

        l1.start();
        l2.start();
        Lottery2 mc = new Lottery2(list);
        FutureTask<Integer> ft1 = new FutureTask<>(mc);
        FutureTask<Integer> ft2 = new FutureTask<>(mc);

        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);

        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();

        Integer max1 = ft1.get();
        Integer max2 = ft2.get();
        System.out.println(max1);
        System.out.println(max2);
        if (max1 > max2) {
            System.out.println("最大的数为" + max1);
        } else {
            System.out.println("最大的数为" + max2);

        }
    }

}
