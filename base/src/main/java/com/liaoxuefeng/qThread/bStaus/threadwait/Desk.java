package com.liaoxuefeng.qThread.bStaus.threadwait;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/6 下午6:03
 */
public class Desk {

    /**
     * 作用：控制生产者消费的执行
     **/

    // 0 有面条，1 没有面条
    public int noodle = 0;

    // 总的消费者个数
    public int count = 10;

    // 定义一个锁
    public Object lock = new Object();


}
