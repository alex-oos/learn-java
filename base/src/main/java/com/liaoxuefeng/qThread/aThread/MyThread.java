package com.liaoxuefeng.qThread.aThread;

/**
 * @author Alex
 * @since 2023/11/23 14:47
 * <p>
 * Java用Thread对象表示一个线程，通过调用start()启动一个新线程；
 * * 一个线程对象只能调用一次start()方法；
 * * 线程的执行代码写在run()方法中；
 * * 线程调度由操作系统决定，程序本身无法决定调度顺序；
 * * Thread.sleep()可以把当前线程暂停一段时间。
 * Java线程（Thread类）的常用用法
 * 线程名字可以通过 t.setName() 来设置
 * 优先级可以通过 t.setPriority() 括号里传入1~10的整数即可
 * 延时操作 可以通过 t.sleep() 括号传入整数，单位是毫秒
 * 线程开始 可以同过 t.start(),结束是 t.stop() 等等
 */
public class MyThread extends Thread {

    /**
     * * 线程实现的方式一：
     * * 1. 自己定义一个类继承Thread
     * * 2. 重写run方法
     * * 3. 创建子类的对象，并启动线程
     */

    private int x = 0;


    @Override
    public void run() {
        // 书写执行代码
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + " x : " + (this.x++));
        }

    }

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        // 线程名字可以通过 t.setName() 来设置
        t1.setName("线程一");
        t2.setName("线程二");
        t1.start();
        t2.start();
        System.out.println("main方法执行结束");
    }

}
