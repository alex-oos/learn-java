package com.liaoxuefeng.qThread.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * <P></p>
 *
 * @author lijiang
 * @since 2023/12/11 下午8:44
 */
public class Lottery2 implements Callable<Integer> {


    List<Integer> list;

    public Lottery2(List<Integer> list) {

        this.list = list;
    }


    @Override
    public Integer call() throws Exception {

        List<Integer> boxList = new ArrayList<>(); // 将这个变量放到线程中，线程run起来之后，直接放到线程里面，所以各个线程之间该变量并不一样

        while (true) {
            synchronized (Lottery2.class) {
                if (list.isEmpty()) {
                    int sum = boxList.stream().mapToInt(e -> e).sum();
                    Integer max = Collections.max(boxList);
                    System.out.println(Thread.currentThread().getName() + "包含" + boxList + "和为：" + sum + "最大值为：" + max);
                    break;

                } else {
                    Collections.shuffle(list);
                    Integer price = list.remove(0);
                    // System.out.println(this.getName() + ":又产生了" + price + "元大奖");
                    boxList.add(price);

                }
            }

            TimeUnit.MILLISECONDS.sleep(10);

        }
        if (boxList.isEmpty()) {
            return null;
        }
        return Collections.max(boxList);

    }

}
