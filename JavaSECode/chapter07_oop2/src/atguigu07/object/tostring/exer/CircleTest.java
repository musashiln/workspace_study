package atguigu07.object.tostring.exer;

/**
 * ClassName: CircleTest
 * Package: atguigu07.object.tostring.exer
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/29 11:50
 * @Version 1.0
 */
public class CircleTest {

    public static void main(String[] args) {

        Circle circle = new Circle(2.3);

        Circle circle1 = new Circle("red",2.0,3.4);

        System.out.println("颜色是否相等?" + circle1.color.equals(circle.color));

        System.out.println("半径是否相等?" + circle1.equals(circle));

        System.out.println(circle);
        System.out.println(circle.toString());
    }
}
