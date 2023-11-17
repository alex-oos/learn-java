package com.liaoxuefeng.qThread.eThreadPool.completablefuredemo.futuredemo;

import com.liaoxuefeng.qThread.eThreadPool.completablefuredemo.utills.CommonUtils;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * <P></p>
 *
 * @author lijiang
 * @since 2023/11/17 上午11:07
 */
public class FutureDemo {

    // 1、获取新闻稿
    // 2、获取敏感词
    // 3、将新闻稿中的敏感词进行替换
    // 4、将替换后的新闻稿打印输出结果


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建固定大小的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Future<String> newsFuture = executorService.submit(() -> {
            return CommonUtils.readFile("base/src/main/resources/data/news.txt");
        });

        Future<String> wordsFuture = executorService.submit(() -> {
            return CommonUtils.readFile("base/src/main/resources/data/words.txt");
        });

        Future<String> filedNewsFuture = executorService.submit(() -> {

            String news = newsFuture.get();
            String words = wordsFuture.get();

            String[] wordsArray = words.split(",");
            for (String word : wordsArray) {
                if (news.lastIndexOf(word) >= 0) {
                    news = news.replace(word, "**");
                }
            }

            return news;

        });


        String result = filedNewsFuture.get();
        System.out.println(result);


    }

}
