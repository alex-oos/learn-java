package com.liaoxuefeng.gGeneric;

/**
 * @author Alex
 * @since 2020/6/9 19:45
 *  擦拭法：决定了泛型<T>:
 * 1、不能是基本类型，例如：int；
 * 2、不能获取带泛型类型的Class，例如：Pair<String>.class；
 * 3、不能判断带泛型类型的类型，例如：x instanceof Pair<String>；
 * 4、不能实例化T类型，例如：new T()。
 */
public class Main {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("hello", "world");
        String first = pair.getFirst();
        String last = pair.getLast();
        System.out.println("last = " + first);
        System.out.println("last = " + last);
    }
}
