package com.liaoxuefeng.qThread.cInterruptThread;


/**
 * @author Alex
 * @since 2020/7/18 15:45
 * <p>
 * interrupt()  中断线程  目标线程需要反复检测自身状态是否是interrupted状态，如果是，就立刻结束运行。
 * 对目标线程调用interrupt()方法可以请求中断一个线程，目标线程通过检测isInterrupted()标志获取自身是否已中断。如果目标线程处于等待状态，该线程会捕获到InterruptedException；
 * 目标线程检测到isInterrupted()为true或者捕获了InterruptedException都应该立刻结束自身线程；
 * 通过标志位判断需要正确使用volatile关键字；
 * volatile关键字解决了共享变量在线程间的可见性问题。
 * </p>
 */
public class TestInterrupt {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Mythread();
        t.start();
        Thread.sleep(1000); //暂停1豪秒
        t.interrupt(); //中断t线程
        t.join(); // 等待t线程结束
        System.out.println("end");
    }

}

class Mythread extends Thread {

    @Override
    public void run() {

        Thread hello = new HelloThreadA();
        hello.start();
        try {
            hello.join();
        } catch (InterruptedException e) {
            //e.printStackTrace();
            System.out.println("InterruptedException!");
        }
        hello.interrupt();
    }

}

/**
 * 你好threada
 *
 * @author Alex
 * @since 2021/07/01
 */
class HelloThreadA extends Mythread {


    @Override
    public void run() {

        int n = 0;
        while (!isInterrupted()) {
            n++;
            System.out.println(n + " hello");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
//                e.printStackTrace();
                break;
            }
        }

    }

}
