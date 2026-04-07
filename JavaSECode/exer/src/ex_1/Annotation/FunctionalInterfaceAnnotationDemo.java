package ex_1.Annotation;

/**
 * ClassName: FunctionalInterfaceAnnotationDemo
 * Package: ex_1.Annotation
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/19 11:55
 * @Version 1.0
 */
public interface FunctionalInterfaceAnnotationDemo {
    @FunctionalInterface
    public interface Func1<T> {
        void printMessage(T message);
    }

//    @FunctionalInterface
//    public interface Func2<T> {
//        void printMessage(T message);
//        void printMessage1(T message);
//    }

    public static void main(String[] args) {
        Func1 func1 = message -> System.out.println(message);
        func1.printMessage("Hello");
        func1.printMessage(100);
    }

}
