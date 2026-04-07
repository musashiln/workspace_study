package ex_1._class.object.String;

/**
 * ClassName: substringTest
 * Package: ex_1._class.object.String
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/28 19:05
 * @Version 1.0
 */
public class substringTest {
    public static void main(String[] args) {
        String s = "0123456789";
        System.out.println(s.substring(0, 3));
        System.out.println(s.substring(1, 3));
        System.out.println(s.substring(0, 9));
        System.out.println(s.length());
        System.out.println(s.substring(0, s.length()));
    }
}
