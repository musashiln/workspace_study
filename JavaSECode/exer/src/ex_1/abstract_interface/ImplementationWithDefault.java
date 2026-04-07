package ex_1.abstract_interface;

/**
 * ClassName: ImplementationWithDefault
 * Package: ex_1.abstract_interface
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/11 10:29
 * @Version 1.0
 */

interface InterfaceWithDefault {
    void firstMethod();
    void secondMethod();

    default void newMethod() {
        System.out.println("newMethod");
    }
}

public class ImplementationWithDefault implements InterfaceWithDefault{
    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    public static void main(String[] args) {
        InterfaceWithDefault i = new ImplementationWithDefault();
        i.firstMethod();
        i.secondMethod();
        i.newMethod();
    }
}
