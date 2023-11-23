package com.liaoxuefeng.qThread.aThread;


import lombok.NoArgsConstructor;

/**
 * @author Alex
 * @since 2020/7/13 16:14
 * <p>
 * 创建线程的方式二：
 * 实现接口Runnable
 * 在 Runnable 中只有 一个 public void run() 的抽象方法
 * 实现 Runnable 接口并在 run() 中实现相对应的方法即可实现线程
 * Runnable 解决了多继承的问题
 * </p>
 */

@NoArgsConstructor
public class MyRunnable implements Runnable {

    public static void main(String[] args) {

        // 创建myRunnable任务
        MyRunnable myRunnable = new MyRunnable();
        // 创建线程对象，将任务传递给线程
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        t1.setName("线程一");
        t2.setName("线程二");
        // 开启线程
        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        // 获取当前线程的名称
        String strName = Thread.currentThread().getName();
        // 获取当前线程的对象
        // Thread thread = Thread.currentThread();
        // n值代表循环多少次
        int n = 11;
        for (int i = 0; i < n; i++) {
            System.out.println("当前线程的名字是：" + strName + "，第" + i + "次执行！");
        }

    }

}
