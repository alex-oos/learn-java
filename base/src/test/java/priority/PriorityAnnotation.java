package priority;

import java.lang.annotation.*;

/**
 * <p>
 * 优先级注解
 * </p>
 *
 * @author Alex
 * @version 1.0
 * @since 2022/8/1 12:34
 */


@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE_USE, ElementType.METHOD})
@Documented
public @interface PriorityAnnotation {

    String value() default "P3";

}
