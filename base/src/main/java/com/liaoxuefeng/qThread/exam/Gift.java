package com.liaoxuefeng.qThread.exam;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/11 下午6:28
 */
public class Gift implements Runnable {

    public static Object lock = new Object();

    public Integer amount = 100;

    @Override
    public void run() {

        while (true) {
            synchronized (Gift.class) {
                if (amount < 10) {
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + ":送了一份礼物");
                    amount--;
                    System.out.println("礼物还剩" + amount + "份");
                }
            }
        }

    }

}
