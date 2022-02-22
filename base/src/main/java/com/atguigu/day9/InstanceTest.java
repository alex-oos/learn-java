package com.atguigu.day9;


/**
 * @author Alex
 * @date 2021/12/8 6:25 下午
 * <p>
 * 一、理解“万事万物皆对象”
 * 1.在Java语言范畴中，我们都将功能、结构等封装到类中，通过类的实例化，来调用具体的功能结构
 * >Scanner,String等
 * >文件：File
 * >网络资源：URL
 * 2.涉及到Java语言与前端Html、后端的数据库交互时，前后端的结构在Java层面交互时，都体现为类、对象。
 * <p>
 * 二、内存解析的说明
 * 1.引用类型的变量，只可能存储两类值：null  或  地址值（含变量的类型）
 * <p>
 * 三、匿名对象的使用
 * 1.理解：我们创建的对象，没有显式的赋给一个变量名。即为匿名对象
 * 2.特征：匿名对象只能调用一次。
 * 3.使用：如下  new Person()
 */
public class InstanceTest {

    public static void main(String[] args) {
        Phone p = new Phone();
//		p = null;
        System.out.println(p); // 打印的是地址值

        /* 对象数组中，数组存的是变量名，即是地址值，所以不经过实例化直接调用其属性会报空指针异常*/
        Phone[] phoneArray = new Phone[5];
        phoneArray[0] = new Phone();
        System.out.println("phoneArray[1] = " + phoneArray[0]); // 打印出地址值
        System.out.println("phoneArray[0].price = " + phoneArray[0].price); // 打印出price 的值

        System.out.println("phoneArray[1] = " + phoneArray[1]);//对象数组默认的值是null
        // System.out.println("phoneArray[1].price = " + phoneArray[1].price);// 报空针织异常，因为未实力化对象，根本找不见其属性

        p.sendEmail();
        p.playGame();


        //匿名对象
//		new Phone().sendEmail();
//		new Phone().playGame();

        //每一个匿名对象都是独立的，相互之间不会任何影响
        new Phone().price = 1999;
        new Phone().showPrice();//0.0

        //**********************************
        PhoneMall mall = new PhoneMall();
        //mall.show(p);
        //匿名对象的使用
        mall.show(new Phone());

    }

}

class PhoneMall {


    public void show(Phone phone) {
        phone.sendEmail();
        phone.playGame();
    }

}


class Phone {

    double price;//价格

    public void sendEmail() {
        System.out.println("发送邮件");
    }

    public void playGame() {
        System.out.println("玩游戏");
    }

    public void showPrice() {
        System.out.println("手机价格为：" + price);
    }

}

