package com.liaoxuefeng.qThread.bStaus;

/**
 * @author LiJiang
 * @since 2021/6/30 17:40
 * * 线程的状态：
 * * yield():暂停当前正在执行的线程对象，并执行其他线程。
 * * Thread.yield()方法作用是：暂停当前正在执行的线程对象，并执行其他线程。
 * * yield()应该做的是让当前运行线程回到可运行状态，以允许具有相同优先级的其他线程获得运行机会。因此，使用yield()的目的是让相同优先级的线程之间能适当的轮转执行。但是，实际中无法保证yield()达到让步目的，因为让步的线程还有可能被线程调度程序再次选中。
 */
public class ThreadYield extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(" " + this.getName() + " i: " + i);
            if (i == 5) {
                this.yield();
            }
        }
    }

    public static void main(String[] args) {
        ThreadYield threadYield = new ThreadYield();
        threadYield.setName("牛牛");
        ThreadYield threadYield1 = new ThreadYield();
        threadYield1.setName("三三");
        threadYield.start();
        threadYield1.start();
    }
}
