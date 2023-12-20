package demo.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: Alex
 * @date: 2023/9/18 下午2:36
 * @Descprition:
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {

            executorService.submit(new Runnable() {
                @Override
                public void run() {

                    for (int j = 0; j < 10; j++) {
                        System.out.println(Thread.currentThread().getName() + "   " + j);
                    }
                }
            });
        }
        executorService.shutdown();
    }

}
