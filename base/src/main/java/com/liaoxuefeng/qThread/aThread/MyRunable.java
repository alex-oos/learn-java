package com.liaoxuefeng.qThread.aThread;

/**
 * @author: 李将
 * @since: 2020/7/13 16:14
 * @Descprition:
 */

/*
* 在 Runnable 中只有 一个 public void run() 的抽象方法
实现 Runnable 接口并在 run() 中实现相对应的方法即可实现线程
Runnable 解决了多继承的问题
*
* */
public class MyRunable implements Runnable {

    public static void main(String[] args) {

        Thread t1 = new Thread(new MyRunable());
        t1.setName("t1");
        Thread t2 = new Thread(new MyRunable());
        t2.setName("t2");
        t1.setPriority(8);
        t2.setPriority(6);

        System.out.println("t1优先级:" + t1.getPriority());
        System.out.println("t2优先级:" + t2.getPriority());
        t1.start();//开始线程
        t2.start();
    }

    @Override
    public void run() {

        String strName = Thread.currentThread().getName();

        for (int i = 0; i < 11; i++) {
            System.out.println("当前线程的名字是：" + strName + " " + i);
        }

    }
}
