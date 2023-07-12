package demo;

/**
 * @ClassName demo.Base
 * @Description
 * @Author Alex
 * @Date 2022/8/1 15:11
 * @Version 1.0
 */
public class Base {


    public static void f(String[] args) {
        Class<Base> baseClass = Base.class;
        PriorityAnnotation annotation = baseClass.getAnnotation(PriorityAnnotation.class);
        System.out.println("annotation.value() = " + annotation.value());
    }

}
