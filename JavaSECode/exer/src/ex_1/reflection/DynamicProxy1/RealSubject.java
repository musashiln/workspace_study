package ex_1.reflection.DynamicProxy1;

/**
 * ClassName: RealSubject
 * Package: ex_1.reflection.DynamicProxy1
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/18 21:18
 * @Version 1.0
 */
public class RealSubject implements Subject{
    @Override
    public void hello(String str) {
        System.out.println("hello " + str);
    }

    @Override
    public String bye() {
        System.out.println("goodbye");
        return "over";
    }
}
