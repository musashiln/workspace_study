package org.example.factory.simplefactory.pizzastore.order;

/**
 * ClassName: PizzaStore
 * Package: org.example.factory.simplefactory.pizzastore.order
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/6 10:05
 * @Version 1.0
 */
public class PizzaStore {

    public static void main(String[] args) {
        //传统
        //new OrderPizza();

//        //使用简单工厂模式
//        new OrderPizza(new SimpleFactory());
//        System.out.println("~~退出程序~~");

        //简单工厂模式2--静态工厂
        new OrderPizza2();
    }
}
