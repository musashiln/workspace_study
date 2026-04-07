package org.example.factory.factorymethod.pizzastore.order;

/**
 * ClassName: PizzaStore
 * Package: org.example.factory.factorymethod.pizzastore.order
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/6 12:58
 * @Version 1.0
 */
public class PizzaStore {
    public static void main(String[] args) {

        System.out.println("北京口味");
        new BJOrderPizza();
        System.out.println("伦敦口味");
        new LDOrderPizza();
    }
}
