package com.atguigu01._static;

/**
 * ClassName: StaticTest
 * Package: com.atguigu01._static
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/29 19:45
 * @Version 1.0
 */
public class StaticTest {
    public static void main(String[] args) {
        Order order = null;
        order.hello();
        System.out.println(order.count);
    }
}

class Order {
    public static int count = 1;
    public static void hello() {
        System.out.println("hello");
    }
}
