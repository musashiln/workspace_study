package ex_1.exception;

/**
 * ClassName: testClassNotFound
 * Package: ex_1.exception
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/18 13:10
 * @Version 1.0
 */
public class testClassNotFound {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("ex_1.exception.test");
        clazz.getClass().getClassLoader().loadClass("");

    }
}
