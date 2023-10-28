package com.liaoxuefeng.qThread.aThread;

/**
 * @author Alex
 * @since 2020/7/13 17:15
 * @Descprition:
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        thread1.setName("制作包子");
        thread1.setPriority(10);
        thread1.start();


        MyThread1 thread2 = new MyThread1();
        thread2.setName("吃包子");
        thread2.setPriority(9);
        thread2.start();
        MyThread1 thread3 = new MyThread1();
        thread3.setName("完毕");
        thread3.setPriority(8);
        thread3.start();


    }


}
