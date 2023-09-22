package cn.javaguide.base;

/**
 * @ClassName ReflectionDemo
 * @Description
 * @Author Alex
 * @Date 2023/4/28 10:07
 * @Version 1.0
 */


public class Demo extends DemoAbstract implements DemoInterface {
    public Demo() {
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.show();
        demo.showprint();
        demo.abstractfunction();
    }

    @Override
    public void show() {
        System.out.println("DemoInterface.className = " + DemoInterface.className);

    }

    @Override
    public void abstractfunction() {
        System.out.println("name = " + "抽象方法");
    }

    @Override
    public void showprint() {
        super.showprint();
    }


}
