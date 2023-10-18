package com.atguigu.day10;


/**
 * @author Alex
 * @since 2021/12/13 2:00 下午
 * 总结：属性赋值的先后顺序
 *
 *
 * ① 默认初始化
 * ② 显式初始化
 * ③ 构造器中初始化
 *
 * ④ 通过"对象.方法" 或 "对象.属性"的方式，赋值
 *
 * 以上操作的先后顺序：① - ② - ③ - ④
 *
 */
public class UserTest {

    public static void main(String[] args) {
        User user1 = new User();
        System.out.println(user1.age);

        User user2 = new User();
        user2.setAge(3);
        user2.setAge(5);
        System.out.println(user2.age);
    }
    

}

class User{
    String name;
    int age = 1;

    public User(){

    }

    public User(int a){
        age = a;
    }

    public void setAge(int a){
        age = a;
    }

}
