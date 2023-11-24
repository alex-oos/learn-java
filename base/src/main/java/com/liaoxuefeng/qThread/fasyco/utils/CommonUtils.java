package com.liaoxuefeng.qThread.fasyco.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringJoiner;
import java.util.concurrent.TimeUnit;

/**
 * <P>
 * 异步工具辅助类
 * </p>
 *
 * @author Alex
 * @since 2023/11/17 上午10:16
 */
public class CommonUtils {

    // 获取指定路径的文件
    public static String readFile(String pathToFile) {

        try {
            return Files.readString(Paths.get(pathToFile));
        } catch (IOException e) {
            e.printStackTrace();
            // throw new RuntimeException(e);
            return "";
        }
    }

    // 休眠指定的毫秒数
    public static void sleepMillis(long millis) {

        try {
            TimeUnit.MILLISECONDS.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // 休眠指定的秒数
    public static void sleepSecond(long seconds) {

        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // 打印线程的信息
    public static void printThreadLog(String message) {
        // 格式为： 时间戳|线程id|线程名|日志信息
        String result = new StringJoiner("|")
                .add(String.valueOf(System.currentTimeMillis()))
                .add(String.format("%2d", Thread.currentThread().getId()))
                .add(Thread.currentThread().getName())
                .add(message)
                .toString();
        System.out.println(result);

    }

    public static void main(String[] args) {

        String s = readFile("./base/src/main/resources/data/reader.txt");
        printThreadLog(s);


    }

}
