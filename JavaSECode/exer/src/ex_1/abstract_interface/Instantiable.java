package ex_1.abstract_interface;

/**
 * ClassName: Instantiable
 * Package: ex_1.abstract_interface
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/11 9:39
 * @Version 1.0
 */
abstract class Uninstantiable {
    abstract void f();
    abstract int g();
}

public class Instantiable extends Uninstantiable {
    @Override
    void f() {
        System.out.println("f()");
    }

    @Override
    int g() {
        return 22;
    }

    public static void main(String[] args) {
        Uninstantiable ui = new Instantiable();
        //Uninstantiable ui = new Uninstantiable();
        ui.f();
        ui.g();
    }
}
