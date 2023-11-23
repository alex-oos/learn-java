package com.liaoxuefeng.qThread.aThread;

/**
 * <P>
 * 线程内常用的一些方法
 * </p>
 *
 * @author Alex
 * @since 2023/11/23 上午11:20
 */
public class ThreadMethods {

    /**
     * 线程名称
     */
    public static void threadName() {
        // 1、创建线程的对象，设置线程的名称
        MyThread t1 = new MyThread("飞机");
        MyThread t2 = new MyThread();
        // 设置线程的名称
        t2.setName("坦克");
        t1.start();
        t2.start();
    }

    /**
     * Thread.currentThread()
     */
    public static void getThreadObject() {
        // 获取当前线程对象
        Thread t = Thread.currentThread();
        System.out.println("thread.getName() = " + t.getName());
        System.out.println("thread.getId() = " + t.getId());
    }

    /**
     * Thread.sleep(5000); 线程等待
     */

    public static void threadSleep() throws InterruptedException {

        System.out.println("111111");
        // 线程等待方法
        Thread.sleep(5000);
        System.out.println("RRRRRRRRR");

    }

    /**
     * 线程优先级
     */
    public static void threadPriority() {
        // 10 是最高优先级 ,Thread.MAX_PRIORITY 默认是 5  Thread.NORM_PRIORITY  1 是最低 Thread.MIN_PRIORITY
        // 设置为优先级，只是可以增加概率，并不能保证每次运行结果都是某个线程最先运行完毕
        Thread t = Thread.currentThread();
        System.out.println("默认优先级为：" + t.getPriority());
        t.setPriority(Thread.MAX_PRIORITY);
        t.setPriority(Thread.MIN_PRIORITY);
    }

    /**
     * 守护线程
     */
    public static void threadDaemon() {

        // 当其他非守护线程执行完毕之后，守护线程会陆续结束
        // 创建两个线程
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.setName("女神");
        thread2.setName("备胎");
        // 设置为守护线程
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
    }

    /**
     * yield 礼让线程
     */
    public static void threadYield() {
        // yield出让线程 Thread.yield();
        MyThread thread3 = new MyThread();
        MyThread thread4 = new MyThread();
        thread3.setName("飞机");
        thread4.setName("坦克");
    }

    /**
     * // final void join() 插入线程  当该线程执行完毕之后，再执行其他线程
     */
    public static void threadJoin() throws InterruptedException {

        MyThread thread5 = new MyThread();
        thread5.setName("土豆");
        thread5.start();
        // 把t线程插入，当前线程
        // t:土豆
        // 当前线程：main线程
        thread5.join();

        //     执行main线程中
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程" + i);
        }

    }

    /**
     * - String getName()  返回线程的名称
     * <p>
     * - void setName(String name) 设置线程的名字（构造方法也可以设置名称）
     * <p>
     * > 细节：
     * > 1、如果我们没有给线程设置名字，线程也是默认有名字的  格式：Thread-X(X是序号，从0开始)
     * >  2、如果我们要给线程设置名称，可以用set 方法设置，也可以用构造方法设置
     * <p>
     * - static Thread currentThread() 获取当前线程的对象
     * >  细节：
     * >   当JVM虚拟机启动之后，会自动的启动多线程，其中一条线程叫做main线程，他的作用就是调用main方法，并执行里面的代码，在以前我们写的所有代码，其实都在main线程中运行
     * <p>
     * - static void sleep(long time)  让线程休眠指定的时间，单位为毫秒
     * <p>
     * > 细节:
     * >
     * > 1、那条线程执行到这个方法，那么哪条线程就会在这里停留对应的时间
     * >
     * > 2、方法的参数：就表示睡眠的时间，单位毫秒，1秒=1000毫秒
     * >
     * > 3、当时间到了之后，线程会自动的醒来，继续执行下面的其他代码
     */
    public static void main(String[] args) throws InterruptedException {

        threadName();
        threadSleep();
        threadDaemon();
        threadPriority();
        threadYield();
        threadJoin();
    }


}
