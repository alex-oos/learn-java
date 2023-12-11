package com.liaoxuefeng.qThread.exam;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/11 下午6:21
 */
public class MovieTicket {

    /**
     * 电影院卖票，用多线程模拟卖票过程，并且打印剩余电影票的数量
     *
     * @param args
     */
    public static void main(String[] args) {

        WindowsTicket windowsTicket = new WindowsTicket();
        WindowsTicket windowsTicket1 = new WindowsTicket();
        windowsTicket.setName("窗口A");
        windowsTicket1.setName("窗口B");

        windowsTicket.start();
        windowsTicket1.start();
    }

}
