package exer4.test1;

/**
 * ClassName: OrderTest
 * Package: exer4.test1
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/17 22:21
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        //order.orderPrivate = 1;
        //order.methodPrivate();

        order.orderPublic = 1;
        order.orderDefault = 1;
        order.methodPublic();
        order.methodDefault();
    }


}
