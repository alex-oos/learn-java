package com.liaoxuefeng.yscheduleTask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <P></p>
 * 参考地址：https://www.cnblogs.com/xuwc/p/14053613.html
 *
 * @author lijiang
 * @since 2024/3/18 下午2:49
 */
public class ScheduleTask {

    /**
     * 定时任务schedule方法的应用场景
     */
    public static void schedule() {

        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(1);
        System.out.println("当前时间为：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {

                System.out.println("开始测试，当前时间为：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                try {
                    TimeUnit.SECONDS.sleep(6);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("结束测试，当前时间为：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            }
        }, 5, TimeUnit.SECONDS); // 延迟5秒后执行,只执行一次

    }

    /**
     * 定时任务scheduleAtFixedRate方法的应用场景
     */
    public static void scheduleAtFixedRate() {

        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(1);

        System.out.println("当前时间为：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {

                System.out.println("开始测试，当前时间为：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                try {
                    TimeUnit.SECONDS.sleep(6);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("结束测试，当前时间为：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            }
        }, 5, 5, TimeUnit.SECONDS); // 延迟5秒后执行，每隔3秒执行一次
    }

    public static void scheduleWithFixedDelay() {

        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(1);
        System.out.println("当前时间为：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {

                System.out.println("开始测试，当前时间为：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                try {
                    TimeUnit.SECONDS.sleep(6);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("结束测试，当前时间为：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            }
        }, 5, 3, TimeUnit.SECONDS); // 延迟5秒后执行，每隔3秒执行一次


    }

    public static void classCreate() {
        // 方式一
        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(1);
        // 方式二，方式二和方式一可以等价
        ScheduledExecutorService scheduledExecutorService1 = Executors.newScheduledThreadPool(1);


    }

    public static void main(String[] args) {

        // schedule();
        // scheduleAtFixedRate();
        scheduleWithFixedDelay();
        classCreate();
    }

}
