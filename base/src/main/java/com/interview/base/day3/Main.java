package day3;


/**
 * @ClassName Main
 * @Description 接口和抽象类有什么共同点和区别？
 * 共同点 ：
 * <p>
 * 都不能被实例化。
 * 都可以包含抽象方法。
 * 都可以有默认实现的方法（Java 8 可以用 default 关键字在接口中定义默认方法）。
 * 区别 ：
 * <p>
 * 接口主要用于对类的行为进行约束，你实现了某个接口就具有了对应的行为。抽象类主要用于代码复用，强调的是所属关系（比如说我们抽象了一个发送短信的抽象类，）。
 * 一个类只能继承一个类，但是可以实现多个接口。
 * 接口中的成员变量只能是 public static final 类型的，不能被修改且必须有初始值，而抽象类的成员变量默认 default，可在子类中被重新定义，也可被重新赋值
 * @Author Alex
 * @Date 2022/6/12 21:22
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Man persion = new Man();
        persion.eat();
        persion.run();
    }

}
