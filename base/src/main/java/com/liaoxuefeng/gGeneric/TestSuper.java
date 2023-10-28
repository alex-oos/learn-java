package com.liaoxuefeng.gGeneric;

/**
 * @author Alex
 * @since 2020/6/9 20:25
 * @Descprition: <? super Integer>通配符表示：
 * 1、允许调用set（？ super Integer） 方法传入Integer的引用
 * 2、不允许调用get（）方法获取到Interger的引用
 * 3、例外获取Object的引用：Object o = p.getFirst()。
 * 使用<? super Integer>通配符作为方法参数，表示方法内部代码对于参数只能写，不能读。
 * 对比extends和super通配符
 * 我们再回顾一下extends通配符。作为方法参数，<? extends T>类型和<? super T>类型的区别在于：
 * 1、<? extends T>允许调用读方法T get()获取T的引用，但不允许调用写方法set(T)传入T的引用（传入null除外）；
 * 2、<? super T>允许调用写方法set(T)传入T的引用，但不允许调用读方法T get()获取T的引用（获取Object除外）。
 * 一个是允许读不允许写，另一个是允许写不允许读。
 * PECS原则：
 * 如果需要返回T，它是生产者（Producer），要使用extends通配符；如果需要写入T，它是消费者（Consumer），要使用super通配符。
 */
public class TestSuper {

    //Pair<? super Integer>表示，方法参数接受所有泛型类型为Integer或Integer父类的Pair类型
    public static void setSame(Pair<? super Integer> pair, Integer integer) {
        pair.setFirst(integer);
        pair.setLast(integer);

    }

    public static void main(String[] args) {

        Pair<Number> pair = new Pair<>(12.3, 4.56);
        Pair<Integer> pair1 = new Pair<>(123, 456);
        setSame(pair, 100);
        setSame(pair1, 200);
        System.out.println("pair.getLast() = " + pair.getLast());
        System.out.println("pair1.getLast() = " + pair1.getLast());

    }
}
