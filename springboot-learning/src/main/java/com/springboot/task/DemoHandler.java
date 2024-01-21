// package com.springboot.task;
//
//
// import com.xxl.job.core.biz.model.ReturnT;
// import com.xxl.job.core.handler.IJobHandler;
// import lombok.extern.slf4j.Slf4j;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
//
// /**
//  * @author Alex
//  * @since 2021/9/18 7:06 下午
//  * <P></p>
//  */
// @Slf4j
// @JobHandler("runDemoHandler")
// @Service
// public class DemoHandler extends IJobHandler {
//
//     @Autowired
//     private SuiteService suiteService;
//
//     @Override
//     public ReturnT<String> execute(String s) {
//
//         log.info("xxl-job 开始启动");
//         return ReturnT.SUCCESS;
//     }
//
// }
