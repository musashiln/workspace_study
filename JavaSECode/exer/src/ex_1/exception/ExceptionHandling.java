package ex_1.exception;

/**
 * ClassName: ExceptionHandling
 * Package: ex_1.exception
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/18 13:24
 * @Version 1.0
 */
public class ExceptionHandling {
    public static void main(String[] args) {

        try {
            int myInt = Integer.parseInt("pants");
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}
