package com.liaoxuefeng.qThread.bStaus;

/**
 * @Auther: 李将
 * @Date: 2020/7/18 15:45
 * @Descprition: interrupt()  中断线程  目标线程需要反复检测自身状态是否是interrupted状态，如果是，就立刻结束运行。
 */
public class TestInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Mythread();
        t.start();
        Thread.sleep(1); //暂停1豪秒
        t.interrupt(); //中断t线程
        t.join(); // 等待t线程结束
        System.out.println("end");
    }
}

class Mythread extends Thread {

    @Override
    public void run() {
        Thread hello = new HelloThread();
        hello.start();
        try {
            hello.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hello.interrupt();
    }
}

class HelloThread extends Mythread {


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

    ;
}

