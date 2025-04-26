package exer4.test2;

import exer4.test1.Order;

/**
 * ClassName: OrderTest
 * Package: exer4.test2
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/17 22:54
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderPublic = 1;
        order.methodPublic();
    }
}
