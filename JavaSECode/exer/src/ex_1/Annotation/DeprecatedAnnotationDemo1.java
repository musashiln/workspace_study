package ex_1.Annotation;

/**
 * ClassName: DeprecatedAnnotationDemo
 * Package: ex_1.Annotation
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/19 10:17
 * @Version 1.0
 */
public class DeprecatedAnnotationDemo1 {

    @Deprecated
    public String DEPRECATED_FIELD = "DeprecatedField";

    @Deprecated
    public String DeprecatedMethod() {
            return "DeprecatedMethod";
        }

    @Deprecated
    static class DeprecatedClass {
        public String print() {
            return "DeprecatedMethod";
        }
    }

}

class subDeprecatedAnnotation extends DeprecatedAnnotationDemo1{
    @Override
    public String DeprecatedMethod() {
        return super.DeprecatedMethod();
    }

}




