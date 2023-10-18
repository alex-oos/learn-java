package cn.javaguide.base.reflection;

/**
 * @ClassName ReflectionDemo
 * @Description
 * @Author Alex
 * @since 2023/4/28 10:54
 * @Version 1.0
 * 创建反射的几种方式
 */
public class ReflectionDemo {

    public static void main(String[] args) throws ClassNotFoundException {

        // 方式一：通过class
        Object a = String.class;
        System.out.println("方式一： " + a);

        // 方式二： 通过classname
        Class alunbarClass1 = Class.forName("cn.javaguide.base.reflection.ReflectionDemo");
        System.out.println("方式二：" + alunbarClass1);

        // 方式三：通过 类直接引用
        ReflectionDemo demo = new ReflectionDemo();
        Class<? extends ReflectionDemo> demoClass = demo.getClass();
        System.out.println("方式三： " + demoClass);

        // 方式四：通过类加载器直接获取
        Object tmp = ClassLoader.getSystemClassLoader().loadClass("cn.javaguide.base.reflection.ReflectionDemo");
        System.out.println("方式四： " + tmp);
    }

}
