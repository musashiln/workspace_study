package atguigu07.object.equals.apply;

/**
 * ClassName: CustomerTest
 * Package: atguigu07.object.equals.apply
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/24 22:41
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("tom", 12, new Account(2000));
        Customer customer1 = new Customer("tom", 12, new Account(2000));
        System.out.println(customer.equals(customer1));
    }
}
