package cn.javaguide.base;

/**
 * @ClassName DemoAbstract
 * @Description
 * @Author Alex
 * @since 2023/4/28 10:14
 * @Version 1.0
 */
public abstract class DemoAbstract {

    public String name = "DemoAbstract";


    public abstract void abstractfunction();


    public void showprint() {
        System.out.println("抽象类中的正常方法 = " + "showprint");
    }
}
