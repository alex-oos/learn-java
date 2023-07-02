package day6reflection;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName Test
 * @Description
 * @Author Alex
 * @Date 2022/6/14 20:43
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        /**
         * 获取 TargetObject 类的 Class 对象并且创建 TargetObject 类实例
         */
        Class<?> targetClass = Class.forName("day6reflection.TargetObject");
        TargetObject targetObject = (TargetObject) targetClass.newInstance();
        /**
         * 获取 TargetObject 类中定义的所有方法
         */
        Method[] methods = targetClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method.getName() = " + method.getName());
        }

        /**
         * 获取指定方法的函数
         */
        Method publicMethod = targetClass.getDeclaredMethod("publicMethod", String.class);
        publicMethod.invoke(targetObject, "A");
        System.out.println("publicMethod.getName() = " + publicMethod.getName());

        /**
         * 调用指定的字段
         */
        Field field = targetClass.getDeclaredField("value");
        //为了调用private方法我们取消安全检查

        field.setAccessible(true);
        field.set(targetObject, "hello");

        /**
         * 调用private 方法
         */
        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        //为了调用private方法我们取消安全检查

        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);


    }

}
