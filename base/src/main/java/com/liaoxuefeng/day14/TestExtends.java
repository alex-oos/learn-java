package com.liaoxuefeng.day14;

/**
 * @Auther: 李将
 * @Date: 2020/6/9 20:12
 * @Descprition: 使用类似<? extends Number>通配符作为方法参数时表示：
 * 方法内部可以调用获取Number引用的方法，例如：Number n = obj.getFirst();；
 * 1、方法内部无法调用传入Number引用的方法（null除外），例如：obj.setFirst(Number n);。
 * 2、即一句话总结：使用extends通配符表示可以读，不能写。
 * 使用类似<T extends Number>定义泛型类时表示：
 * 泛型类型限定为Number以及Number的子类。
 */
public class TestExtends {
    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>(123, 456);
        int n = add(pair);
        System.out.println("n = " + n);
    }

    public static int add(Pair<? extends Number> pair) {
        Number first = pair.getFirst();
        Number last = pair.getLast();
//        pair.setFirst(new Integer(first.intValue() + 100));
//        pair.setLast(new Integer(last.intValue() + 100));
        return first.intValue() + last.intValue();
    }
}
