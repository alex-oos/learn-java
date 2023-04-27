package cn.javaguide.base.reflection;

/**
 * @ClassName Demo
 * @Description
 * @Author Alex
 * @Date 2023/4/28 10:54
 * @Version 1.0
 * 反射的几种方式
 */
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {

        //        方式一：通过class
        Object a = String.class;
        System.out.println("a = " + a);
        //        方式二： 通过classname
        Class alunbarClass1 = Class.forName("cn.javaguide.base.Demo");
        System.out.println("alunbarClass1 = " + alunbarClass1);
        //        方式三：通过 类直接引用
        Demo demo = new Demo();
        Class<? extends Demo> demoClass = demo.getClass();
        System.out.println("demoClass = " + demoClass);
        //方式四：通过类加载器直接获取
        Object tmp = ClassLoader.getSystemClassLoader().loadClass("cn.javaguide.base.reflection.Demo");
        System.out.println("tmp = " + tmp);
    }
}
