package atguigu02.stringmore.interview;

/**
 * ClassName: InterviewTest1
 * Package: atguigu02.stringmore.interview
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/23 21:30
 * @Version 1.0
 */
public class InterviewTest1 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");

        operate(a, b);

        System.out.println(a +"," + b);

    }

    public static void operate(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
        y. append ('x');

    }
}
