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
public class DeprecatedAnnotationDemo {
    static class DeprecatedField {
        @Deprecated
        public static final String DEPRECATED_FIELD = "DeprecatedField";
    }

    static class DeprecatedMethod {
        @Deprecated
        public String print() {
            return "DeprecatedMethod";
        }
    }

    @Deprecated
    static class DeprecatedClass {
        public String print() {
            return "DeprecatedMethod";
        }
    }

    public static void main(String[] args) {
        System.out.println(DeprecatedField.DEPRECATED_FIELD);

        DeprecatedMethod dm = new DeprecatedMethod();
        System.out.println(dm.print());


        DeprecatedClass dc = new DeprecatedClass();
        System.out.println(dc.print());
    }
}




