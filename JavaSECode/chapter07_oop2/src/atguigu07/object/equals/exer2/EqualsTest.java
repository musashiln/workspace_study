package atguigu07.object.equals.exer2;

/**
 * ClassName: EqualsTest
 * Package: atguigu07.object.equals.exer2
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/24 23:08
 * @Version 1.0
 */
public class EqualsTest {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(14, 3, 1976);
        MyDate myDate2 = new MyDate(14, 3, 1976);
        if (myDate1 == myDate2) {
            System.out.println("m1 == m2");
        } else {
            System.out.println("m1 != m2");
        }

        if (myDate1.equals(myDate2)) {
            System.out.println("m1 is eqaul m2");
        } else {
            System.out.println("m1 is not equal m2");
        }
    }
}
