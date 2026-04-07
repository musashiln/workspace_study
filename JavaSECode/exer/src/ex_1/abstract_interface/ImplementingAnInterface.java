package ex_1.abstract_interface;

/**
 * ClassName: ImplementingAnInterface
 * Package: ex_1.abstract_interface
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/11 10:22
 * @Version 1.0
 */
public class ImplementingAnInterface {
}

interface Concept { // Package access
    void idea1();
    void idea2();
}

class Implementation implements Concept {
    @Override
    public void idea1() {
        System.out.println("idea1");
    }

    @Override
    public void idea2() {
        System.out.println("idea2");
    }
}