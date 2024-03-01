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

        boolean annotationPresent1 = TestAnnotation.class.isAnnotationPresent(Check.class);

        boolean annotationPresent = Check.class.isAnnotationPresent(Check.class);
        System.out.println(annotationPresent);
        // 获取注解的值
        // 获取注解的属性值

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

        Check annotation = TestAnnotation.class.getAnnotation(Check.class);
        System.out.println(annotation.value());
        System.out.println(annotation.min());
        System.out.println(annotation.max());


    }

    public static void main(String[] args) {

        isUseAnnotation();
        getAnnotation();

    }

}
