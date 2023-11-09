package com.liaoxuefeng.qThread.aThread;

/**
 * @author Alex
 * @since 2020/7/13 14:47
 * 
 */


/* Java线程（Thread类）的常用用法
*线程名字可以通过 t.setName() 来设置
优先级可以通过 t.setPriority() 括号里传入1~10的整数即可
延时操作 可以通过 t.sleep() 括号传入整数，单位是毫秒
线程开始 可以同过 t.start(),结束是 t.stop() 等等
*
*
* */
public class MyThread extends Thread {

    private int x = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + " x : " + (this.x++));
        }

    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
//        线程名字可以通过 t.setName() 来设置
        MyThread t2 = new MyThread();
        t1.setName("线程一");
        t2.setName("线程二");
        t1.start();
        t2.start();
        System.out.println("main方法执行结束");
    }
}
