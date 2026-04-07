package ex_1.Annotation;

/**
 * ClassName: SuppressWarningsAnnotationDemo
 * Package: ex_1.Annotation
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/19 11:25
 * @Version 1.0
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class SuppressWarningsAnnotationDemo {
    static class SuppressDemo<T> {
        private T value;

        public T getValue() {
            return this.value;
        }

        public void setValue(T var) {
            this.value = var;
        }
    }

    @SuppressWarnings({"deprecation"})
    public static void main(String[] args) {
        SuppressDemo d = new SuppressDemo();
        d.setValue("南京");
        System.out.println("地名：" + d.getValue());
    }
}
