package atguigu02.stringmore.interview;

/**
 * ClassName: Interview4
 * Package: atguigu02.stringmore.interview
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/23 22:08
 * @Version 1.0
 */
public class Interview4 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length());//4

        System.out.println(sb);//"null"

        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);//空指针异常
    }
}
