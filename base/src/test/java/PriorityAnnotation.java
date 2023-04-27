import java.lang.annotation.*;

/**
 * @ClassName PriorityAnnotation
 * @Description
 * @Author Alex
 * @Date 2022/8/1 12:34
 * @Version 1.0
 */


@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE_USE, ElementType.METHOD})
@Documented
public @interface PriorityAnnotation {

    String value() default "P1";

}
