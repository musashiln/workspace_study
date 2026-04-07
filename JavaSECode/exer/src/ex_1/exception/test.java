package ex_1.exception;

/**
 * ClassName: test
 * Package: ex_1.exception
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/18 11:13
 * @Version 1.0
 */
public class test {

    private String name;
    private int age;

    public test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print (int n,int m) {
        System.out.println(n + "," + m);
    }

    public void wrapException(String input) throws MyBusinessException {
        try {
            throw new NumberFormatException();
        } catch (NumberFormatException e) {
            throw new MyBusinessException("A message that describes the error.",e);
        }
    }

}

class MyBusinessException extends Exception {
    public MyBusinessException() {
    }

    public MyBusinessException(String message) {
        super(message);
    }

    public MyBusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}

class testException {
    public static void main(String[] args) throws MyBusinessException {
        test test = new test("abc",10);
        test.wrapException("aaa");
        System.out.println("aaaaaaa");
    }
}

