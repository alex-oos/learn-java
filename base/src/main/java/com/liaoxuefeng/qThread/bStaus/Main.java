package com.liaoxuefeng.qThread.bStaus;

/**
 * @author: 李将
 * @since: 2020/7/18 15:33
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
//            join就是指等待该线程结束，然后才继续往下执行自身线程
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
//可以肯定是main线程先打印start，t线程再打印hello，main线程最后再打印end。

//通过对另一个线程对象调用join()方法可以等待其执行结束；
//可以指定等待时间，超过等待时间线程仍然没有结束就不再等待；
//对已经运行结束的线程调用join()方法会立刻返回。