package com.liaoxuefeng.qThread.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * <P></p>
 *
 * @author lijiang
 * @since 2023/12/11 下午8:02
 */
public class Lottery extends Thread {

    List<Integer> list;

    public Lottery(List<Integer> list) {

        this.list = list;

    }

    @Override
    public void run() {

        List<Integer> arrayList = new ArrayList<>(); // 将这个变量放到线程中，线程run起来之后，直接放到线程里面，所以各个线程之间该变量并不一样

        while (true) {
            synchronized (Lottery.class) {
                if (list.isEmpty()) {
                    int sum = arrayList.stream().mapToInt(e -> e).sum();
                    Integer max = Collections.max(arrayList);
                    System.out.println(this.getName() + "包含" + arrayList + "和为：" + sum + "最大值为：" + max);
                    break;

                } else {
                    Collections.shuffle(list);
                    Integer price = list.remove(0);
                    // System.out.println(this.getName() + ":又产生了" + price + "元大奖");
                    arrayList.add(price);

                }
            }
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
