package com.liaoxuefeng.qThread.aThread;


import com.alibaba.fastjson.JSON;

import java.util.Map;

import static java.lang.Thread.sleep;

/**
 * @author LiJiang
 * @since 2021/6/29 18:13
 */
public class Test1 extends Thread {


    @Override
    public synchronized void start() {
        super.start();
        System.out.println("线程已经开始启动： " + true);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("线程正在运行 " + true);
    }


    public static void main(String[] args) throws InterruptedException {
 /*       Test1 thread = new Test1();
        thread.setName("线程一");
        thread.start();
        Thread.sleep(1000);
        System.out.println("thread = " + thread);
        try {
            thread.wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/


    }

}
