package ex_1.abstract_interface;

/**
 * ClassName: AttemptToUseBasic
 * Package: ex_1.abstract_interface
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/11 9:31
 * @Version 1.0
 */

abstract class Basic {
    abstract void unimplemented();
}

public class AttemptToUseBasic {
    //Basic b = new Basic();
    // error: Basic is abstract; cannot be instantiated
}

class Basic2 extends Basic {
    int f() {
        return 111;
    }


    @Override
    void unimplemented() {

    }
}
