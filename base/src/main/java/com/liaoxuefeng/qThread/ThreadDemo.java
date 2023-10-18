package com.liaoxuefeng.qThread;


/**
 * @author Alex
 * @since 2021/7/1 15:08
 * <p>
 * 实现java多线程抢票
 * </p>
 */


class ThreadPerson implements Runnable {

    private static int ticket = 100;
    private final Object lock = new Object();

    @Override
    public void run() {

        while (true) {
            synchronized (lock) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "------" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }

        }
    }

}

public class ThreadDemo {

    public static void main(String[] args) {

        new Thread(new ThreadPerson()).start();
        new Thread(new ThreadPerson()).start();
        new Thread(new ThreadPerson()).start();
    }

}
