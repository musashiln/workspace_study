package ex_1.exception;

/**
 * ClassName: testNoclassDefFound
 * Package: ex_1.exception
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/18 13:13
 * @Version 1.0
 */
public class testNoclassDefFound {
    public static void main(String[] args) {
        try {
            new B();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        new B();
    }
}

class B {
    static {
        int i = 1 / 0;
    }
}

