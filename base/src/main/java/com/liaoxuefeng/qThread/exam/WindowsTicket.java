package com.liaoxuefeng.qThread.exam;

import java.util.concurrent.TimeUnit;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/11 下午6:17
 */
public class WindowsTicket extends Thread {

    public Integer ticket = 100;


    @Override
    public void run() {

        while (true) {
            synchronized (WindowsTicket.class) {
                if (ticket == 0) {
                    break;
                } else {
                    try {
                        TimeUnit.MILLISECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(this.getName() + "：正在售票");
                    ticket--;
                    System.out.println("还剩" + ticket + "张票");
                }

            }
        }
    }

}
