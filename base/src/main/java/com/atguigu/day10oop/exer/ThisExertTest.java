package com.atguigu.day10oop.exer;


/**
 * @author Alex
 * @since 2022/4/20 07:41
 */

/**
 * this 关键字的使用：
 * 1  this 可以用来修饰：属性、方法、构造器
 * 2 this 修饰属性和方法：
 * this 可以理解为当前对象
 * this.属性名：访问当前对象的属性
 * this.方法名：调用当前对象的方法
 * 通常情况下，我们可以选择省略this,如果 方法的形参和属性同名，那么就不能省略this
 * 3. this 调用构造器
 * 3.1 我们在类的构造器中，可以显式的使用，this（形参列表） 方式，调用本类中的其他构造器
 * 3.2 构造器中 不能通过this（形参列表）方式调用自己
 * 3.3 如果一个类中中有n 个构造器，那么最多有n-1 个构造器中使用了this（形参列表）
 * 3.3 规定：this(形参构造器) 必须放在首行
 * 3.4 构造器内部，最多只能声明一个this(形参构造器) 用来调用其他构造器
 */
public class ThisExertTest {

    public static void main(String[] args) {

        Boy boy = new Boy("梁山伯", 20);
        boy.show();
        Girl girl = new Girl("祝英台", 19);
        girl.marry(boy);

        Girl girl1 = new Girl("小雪", 20);
        Integer compare = girl.compare(girl1);
        if (compare > 0) {
            System.out.println(girl.getAge() + "：年龄大");
        } else if (compare < 0) {
            System.out.println(girl1.getName() + "：年龄大");
        } else {
            System.out.println(girl.getName() + "和" + girl1.getName() + "：一样大");

        }
    }

}
