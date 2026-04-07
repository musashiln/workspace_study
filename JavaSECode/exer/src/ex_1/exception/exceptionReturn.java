package ex_1.exception;

/**
 * ClassName: exceptionReturn
 * Package: ex_1.exception
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/18 13:36
 * @Version 1.0
 */
public class exceptionReturn {
    public static void main(String[] args) {
        System.out.println(printANumber());
    }

    public static int printANumber () {
        try {
            return 3;
        } catch (Exception e) {
            return 4;
        } finally {
            System.out.println("finally");
            //return 5;
        }
    }
}
