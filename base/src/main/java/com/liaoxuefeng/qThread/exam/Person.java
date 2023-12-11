package com.liaoxuefeng.qThread.exam;

/**
 * <P></p>
 *
 * @author lijiang
 * @since 2023/12/11 下午7:01
 */
public class Person extends Thread {


    public static double money = 100;

    public static double MIN = 0.01;

    public static int count = 3;


    @Override
    public void run() {

        synchronized (Person.class) {
            if (count == 0) {
                System.out.println(this.getName() + "没有抢到红包");
            } else {
                double price = 0;
                if (count == 1) {
                    price = money;
                } else {
                    price = money / count;
                    if (price < MIN) {
                        price = MIN;
                    }
                }
                money -= price;
                count--;
                System.out.println(this.getName() + "抢了" + price + "红包");
            }
        }


    }

}
