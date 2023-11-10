package com.liaoxuefeng.fAnnotation;

/**
 * <P>
 * 注解一般如何使用呢
 * </p>
 *
 * @author Alex
 * @since 2023/11/9 下午6:41
 */
public class AnnotationUse {

    /**
     * 一般使用注解是通过反射来获取注解的信息
     * 判断某个注解是否存在于Class、Field、Method或Constructor：
     * <p>
     * Class.isAnnotationPresent(Class)
     * Field.isAnnotationPresent(Class)
     * Method.isAnnotationPresent(Class)
     * Constructor.isAnnotationPresent(Class)
     */
    public static void isUseAnnotation() {

    }

    /**
     * 使用反射API读取Annotation：
     * <p>
     * Class.getAnnotation(Class)
     * Field.getAnnotation(Class)
     * Method.getAnnotation(Class)
     * Constructor.getAnnotation(Class)
     */
    public static void getAnnotation() {

    }

    public static void main(String[] args) {


    }

}
