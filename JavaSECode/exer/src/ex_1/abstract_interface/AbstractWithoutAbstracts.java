package ex_1.abstract_interface;

/**
 * ClassName: AbstractWithoutAbstracts
 * Package: ex_1.abstract_interface
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/11 9:34
 * @Version 1.0
 */

/**
 * 可以将一个不包含任何抽象方法的类指明为abstract，
 * 在类中的抽象方法没啥意义但想阻止创建类的对象
 */
abstract class Basic3 {
    int f() {
        return 111;
    }

    // No abstract methods
}

public class AbstractWithoutAbstracts {
    // Basic3 b3 = new Basic3();
    // error: Basic3 is abstract; cannot be instantiated
}

