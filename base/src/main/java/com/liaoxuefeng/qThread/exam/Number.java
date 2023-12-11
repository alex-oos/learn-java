package com.liaoxuefeng.qThread.exam;

import java.util.concurrent.Callable;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/11 下午6:39
 */
public class Number implements Callable<Integer> {

    public int num = 100;

    @Override
    public Integer call() throws Exception {

        while (true) {
            synchronized (Number.class) {
                if (num == 0) {
                    break;
                } else {
                    if (num % 2 != 0) {
                        System.out.println(num);
                    }
                    num--;

                }
            }
        }
        return null;

    }

}
