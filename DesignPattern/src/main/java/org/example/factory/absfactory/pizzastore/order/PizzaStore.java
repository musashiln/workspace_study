package org.example.factory.absfactory.pizzastore.order;

/**
 * ClassName: PizzaStore
 * Package: org.example.factory.absfactory.pizzastore.order
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/6 15:46
 * @Version 1.0
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());

    }
}
