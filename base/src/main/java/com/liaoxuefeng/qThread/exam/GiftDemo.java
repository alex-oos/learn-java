package com.liaoxuefeng.qThread.exam;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/11 下午6:33
 */
public class GiftDemo {

    /**
     * 场景：有100份礼品，两个人同时发送，当剩下的礼品小于10份的时候则不再送出
     * 利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来
     */
    public static void main(String[] args) {

        Gift gift = new Gift();
        Thread t1 = new Thread(gift);
        Thread t2 = new Thread(gift);
        t1.setName("线程A");
        t2.setName("线程B");
        t1.start();
        t2.start();

    }

}
