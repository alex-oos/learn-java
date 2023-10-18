package com.springboot.controller;


import com.springboot.task.ScheduledTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex
 * @since 2021/9/18 6:48 下午
 * <P></p>
 */
@Slf4j
@RestController
public class ScheduleController {


    @GetMapping("/schedule")
    public String changeStatus() {

        new ScheduledTask().changeStatus();
        return "成功";


    }

}
