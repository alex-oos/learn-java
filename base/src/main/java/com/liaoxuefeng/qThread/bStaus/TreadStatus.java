package com.liaoxuefeng.qThread.bStaus;

/**
 * @author: 李将
 * @since: 2020/7/18 15:33
 * 线程的状态：
 * 通过对另一个线程对象调用join()方法可以等待其执行结束；
 * 可以指定等待时间，超过等待时间线程仍然没有结束就不再等待；
 * 对已经运行结束的线程调用join()方法会立刻返回。
 * yield():暂停当前正在执行的线程对象，并执行其他线程。
 * Thread.yield()方法作用是：暂停当前正在执行的线程对象，并执行其他线程。
 * yield()应该做的是让当前运行线程回到可运行状态，以允许具有相同优先级的其他线程获得运行机会。因此，使用yield()的目的是让相同优先级的线程之间能适当的轮转执行。但是，实际中无法保证yield()达到让步目的，因为让步的线程还有可能被线程调度程序再次选中。
 */
public class TreadStatus {

    private static void run() {
        System.out.println("线程运行");
    }

    public static void function() throws InterruptedException {

        Thread thread = new Thread(TreadStatus::run);
        System.out.println(Thread.currentThread().getName() + ": start");
        thread.start();
        System.out.println(thread.getName() + ": start");
        //join就是指等待该线程结束，然后才继续往下执行自身线程
        thread.join();
        System.out.println(thread.getName() + ": end");
        System.out.println(Thread.currentThread().getName() + "主线程运行结束!");
        Thread.yield();


    }

    public static void main(String[] args) throws InterruptedException {
        function();
    }


}
