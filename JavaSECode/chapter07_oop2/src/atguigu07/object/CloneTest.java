package atguigu07.object;

/**
 * ClassName: CloneTest
 * Package: atguigu07.object
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/24 20:49
 * @Version 1.0
 */
public class CloneTest {
    public static void main(String[] args) {
        ManKind manKind = new ManKind(1, 2);
        try {
            ManKind manKind1 = (ManKind) manKind.clone();
            System.out.println("mankind:" + manKind);
            System.out.println("mankind1:" + manKind1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
