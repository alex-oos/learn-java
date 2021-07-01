package com.liaoxuefeng.qThread.aThread;


/**
 * @author: 李将
 * @since: 2020/7/13 16:14
 * <p>
 * 创建线程的方式二：实现接口Runnable
 * 在 Runnable 中只有 一个 public void run() 的抽象方法
 * 实现 Runnable 接口并在 run() 中实现相对应的方法即可实现线程
 * Runnable 解决了多继承的问题
 * </p>
 */
public class MyRunnable implements Runnable {

    private String threadName;

    public MyRunnable() {

    }

    public MyRunnable(String threadName) {

    }

    public static void function() {

        Thread t1 = new Thread(new MyRunnable());
        t1.setName("t1");
        Thread t2 = new Thread(new MyRunnable());
        t2.setName("t2");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("t1优先级:" + t1.getPriority());
        System.out.println("t2优先级:" + t2.getPriority());
        t1.start();//开始线程
        t2.start();
    }

    public static void main(String[] args) {

        function();
    }

    @Override
    public void run() {
        //获取线程的名称
        String strName = Thread.currentThread().getName();
        int n = 11;
        for (int i = 0; i < n; i++) {
            System.out.println("当前线程的名字是：" + strName + " " + i);
        }

    }

    public String getThreadName() {

        return threadName;
    }

    public void setThreadName(String threadName) {

        this.threadName = threadName;
    }

}
