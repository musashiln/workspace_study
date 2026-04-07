package ex_1.Annotation;

import java.lang.annotation.*;

/**
 * ClassName: Description
 * Package: ex_1.Annotation
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/19 13:18
 * @Version 1.0
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Description {
    String value();
}
