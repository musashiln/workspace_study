package ex_1.Annotation;

/**
 * ClassName: OverrideAnnotationDemo
 * Package: ex_1.Annotation
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/19 10:03
 * @Version 1.0
 */
public class OverrideAnnotationDemo {
    static abstract class Person {
        public String getName() {
            return "getName";
        }

    }

    static class Man extends Person {
        @Override
        public String getName() {
            return "override getName";
        }

//        @Override
//        public String getName2() {
//            return "override getName";
//        }
    }

    public static void main(String[] args) {
        Person person = new Man();
        System.out.println(person.getName());
    }
}
