package com.liaoxuefeng.qThread.exam;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/11 下午6:50
 */
public class RedBagDemo {

   /**
    * 抢红包
    * 假设：100块，分成了3个包，现在有5个人去抢
    * 其中，红包是共享数据
    * 5个人是5条线程
    * 打印结果如下：
    * XXX 抢到了XXX元
    * XXX 没抢到
    *
    * @param args
    */

   public static void main(String[] args) {

      Person p1 = new Person();
      Person p2 = new Person();
      Person p3 = new Person();
      Person p4 = new Person();
      Person p5 = new Person();
      p1.setName("A");
      p2.setName("B");
      p3.setName("C");
      p4.setName("D");
      p5.setName("E");
      p1.start();
      p2.start();
      p3.start();
      p4.start();
      p5.start();

   }

}
