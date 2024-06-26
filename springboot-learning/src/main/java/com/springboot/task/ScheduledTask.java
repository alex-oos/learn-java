package com.springboot.task;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author Alex
 * @since 2021/9/18 1:06 下午
 * <P>常见的定时任务</p>
 */

@Slf4j
@Component
public class ScheduledTask {


    private static boolean isExecute = true;


    public void changeStatus() {

        isExecute = !isExecute;
    }

    // 异步调用，使用更快一些
    @Async // 异步执行该方法
    // @Scheduled(cron = "10 * * * * ?")
    // @Scheduled(cron = "0/10 * * * * ?")
    public void runFlowTask() {

        if (isExecute) {
            log.info("定时任务开始执行执行为：" + "0/10 * * * * ?");
            log.info("开始执行定时任务：" + LocalDateTime.now());

            log.info("定时任务执行完毕：" + LocalDateTime.now());
        } else {
            log.info("定时任务已经停止，不会再运行！");
        }
    }


}
