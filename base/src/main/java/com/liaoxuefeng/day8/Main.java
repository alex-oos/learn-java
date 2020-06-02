package com.liaoxuefeng.day8;

enum Weekey {
    MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");
    public final int dayVaule;

    private final String chinese;

    Weekey(int dayVaule, String chinese) {
        this.dayVaule = dayVaule;
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return this.chinese;
    }
}

/**
 * @Auther: 李将
 * @Date: 2020/6/2 12:16
 * @Descprition: enum : 枚举类
 * 枚举类的比较，只能使用== ，不能使用equals()方法
 * 用类型比较，要使用equals()方法，如果使用==比较，它比较的是两个引用类型的变量是否是同一个对象
 * <p>
 * enum特点：
 * 1、定义的enum 类型总是继承自java.lang.Enum ,且无法被继承
 * 2、只能定义出enume 的实例，而无法通过new操作符，创建enum的实例
 * 3、定义的每一个实例都是引用类型的唯一实例
 * 4、可以将enum类型用于switch语句
 * <p>
 * Java使用enum定义枚举类型，它被编译器编译为final class Xxx extends Enum { … }；
 * <p>
 * 通过name()获取常量定义的字符串，注意不要使用toString()；
 * <p>
 * 通过ordinal()返回常量定义的顺序（无实质意义）；
 * <p>
 * 可以为enum编写构造方法、字段和方法
 * <p>
 * enum的构造方法要声明为private，字段强烈建议声明为final；
 * <p>
 * enum适合用在switch语句中。
 */
public class Main {
    public static void main(String[] args) {
        Weekey day = Weekey.SUN;
        if (day.dayVaule == 6 || day.dayVaule == 0) {
            System.out.println("Today is " + day + ". Work at home!");
        } else {
            System.out.println("Today is " + day + ". Work at home!");
        }

        // 内部函数
        // name() 返回常量名（）
        String s = Weekey.SUN.name();
        System.out.println(s);

        // ordinal() 返回自你故意的常量的顺序，从0 开始计数
        int n = Weekey.MON.ordinal();
        System.out.println(n);
    }
}
