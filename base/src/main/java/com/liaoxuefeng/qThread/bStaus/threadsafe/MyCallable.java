package com.liaoxuefeng.qThread.bStaus.threadsafe;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/6 下午4:52
 */
public class MyCallable implements Callable<Integer> {

    // 场景：某电影院正在上映国产大片，共有100张票，而它有3个窗口卖票，设计一个程序模拟该电影院卖票

    static int ticket = 1;
    // 定义了一个锁lock，静态的是为了防止多线程锁不生效，这里使用的Callable接口实现，不需要添加静态，因为这个Callable的实现类是共用的

    // 定义了一个锁lock，采用他的实例化对象ReentrantLock 来实现
    static Lock lock = new ReentrantLock();

    @Override
    public Integer call() throws Exception {

        while (true) {
            // 手动加锁
            lock.lock();
            // 这里使用try  catch  finally 是为了保证每次运行完，一定释放锁，不然锁没有被释放

            try {
                if (ticket > 100) {
                    break;
                } else {
                    TimeUnit.MILLISECONDS.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "：正在售卖第" + ticket + "张票！");
                    ticket++;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                // 手动释放锁
                lock.unlock();
            }

        }
        return 0;
    }

}
