package com.atguigu05.field;

/**
 * ClassName: FieldTest
 * Package: com.atguigu05.field
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/30 11:35
 * @Version 1.0
 */

/**
 * 1.默认赋值，2.显式赋值/3.代码块，4.构造器，5.对象
 */
public class FieldTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);
    }
}

class Order {
    int orderId = 1;

    {
        orderId =2;
    }

    public Order() {
        orderId = 3;
    }
}
