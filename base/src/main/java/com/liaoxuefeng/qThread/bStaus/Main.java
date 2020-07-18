package com.liaoxuefeng.qThread.bStaus;

/**
 * @Auther: 李将
 * @Date: 2020/7/18 15:33
 * @Descprition:
 */

/*
* 线程的状态：
*
* */
public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(() ->{
            System.out.println("hello");
        });
        System.out.println("start");
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
