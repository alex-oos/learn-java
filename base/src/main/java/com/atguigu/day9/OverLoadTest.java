package com.atguigu.day9;




/**
 * @author Alex
 * @date 2021/12/9 11:40 上午
 * /*
 * 方法的重载（overload）  loading...
 * <p>
 * 1.定义：在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
 * <p>
 * "两同一不同":同一个类、相同方法名
 * 参数列表不同：参数个数不同，参数类型不同
 * <p>
 * 2. 举例：
 * Arrays类中重载的sort() / binarySearch()
 * <p>
 * 3.判断是否是重载：
 * 跟方法的权限修饰符、返回值类型、形参变量名、方法体都没有关系！
 * <p>
 * 4. 在通过对象调用方法时，如何确定某一个指定的方法：
 * 方法名 ---> 参数列表
 */

public class OverLoadTest {

    public static void main(String[] args) {
        OverLoadTest o = new OverLoadTest();
        o.sum(1, 2);
        o.sum(0.1, 0.3);
        o.sum(1, "1");
        o.sum("1", 1);


    }

    /*如果sum(int i, int j) 这个不存在，直接调用 o.sum(1, 2），会被调用 sum(double i, double j)，自动类型提升*/
    public void sum(int i, int j) {
        System.out.println(1);
    }

    public void sum(double i, double j) {
        System.out.println(2);
    }

    public void sum(String str, int i) {
        System.out.println(3);
    }

    public void sum(int i, String str) {
        System.out.println(4);
    }


}
