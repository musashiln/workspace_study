package atguigu07.object.equals.exer1;

/**
 * ClassName: OrderTest
 * Package: atguigu07.object.equals.exer1
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/24 23:00
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order(1, "orderaa");
        Order order1 = new Order(1, "orderaa");
        System.out.println(order.equals(order1));

        Order order2 = new Order(2, new String("orderaa"));
        Order order3 = new Order(2, new String("orderaa"));
        System.out.println(order2.equals(order3));

        String str1 = "aa";
        String str2 = "aa";
        System.out.println(str1 == str2);
    }
}
