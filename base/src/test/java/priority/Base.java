package priority;

/**
 * @ClassName demo.Base
 * @Description
 * @Author Alex
 * @Version 1.0
 * @since 2022/8/1 15:11
 */
public class Base {


    public void getPriority(String[] args) {

        Class<Base> baseClass = Base.class;
        PriorityAnnotation annotation = baseClass.getAnnotation(PriorityAnnotation.class);
        System.out.println("annotation.value() = " + annotation.value());
    }

}
