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

    // 是否有面条， 0 没有面条，1 有面条
    public static int foodFlag = 0;

    // 总个数 总共能做10碗面条
    public static int count = 10;

    // 锁对象
    public static Object lock = new Object();


}
