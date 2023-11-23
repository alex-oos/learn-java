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
        // 1、创建线程的对象
        MyThread t1 = new MyThread("飞机");
        MyThread t2 = new MyThread();
        t1.start();
        t2.setName("坦克");
        t2.start();

        // 那条线程执行，打印当前线程的对象
        Thread t = Thread.currentThread();
        System.out.println("thread.getName() = " + t.getName());
        System.out.println("thread.getId() = " + t.getId());
        System.out.println("111111");
        Thread.sleep(5000);
        System.out.println("RRRRRRRRR");


    }
/*     public static void function() {

        Thread t1 = new Thread(new MyRunnable());
        t1.setName("t1");
        Thread t2 = new Thread(new MyRunnable());
        t2.setName("t2");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("t1优先级:" + t1.getPriority());
        System.out.println("t2优先级:" + t2.getPriority());
        t1.start();// 开始线程
        t2.start();
    } */


}
