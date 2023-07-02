package day6reflection;


import day5.Persion;

/**
 * @ClassName Reflection
 * @Description 反射
 * @Author Alex
 * @Date 2022/6/14 20:23
 * @Version 1.0
 */
public class Reflection {


    public static void main(String[] args) throws ClassNotFoundException {
        // 1、 获取到反射的四种方式
        // 1. 知道具体类的情况下可以使用：
        Class<Persion> aClass1 = Persion.class;

        System.out.println("aClass1 = " + aClass1);

        //2. 通过 Class.forName()传入类的全路径获取：

        Class<?> aClass = Class.forName("day5.Persion");
        System.out.println("aClass = " + aClass);

        //3. 通过对象实例instance.getClass()获取：
        Persion persion = new Persion("Alex");
        Class<? extends Persion> aClass3 = persion.getClass();
        System.out.println("aClass3 = " + aClass3);

        // 4. 通过类加载器xxxClassLoader.loadClass()传入类路径获取:
        Class<?> aClass4 = ClassLoader.getSystemClassLoader().loadClass("day5.Persion");
        System.out.println("aClass4 = " + aClass4);


    }


}
