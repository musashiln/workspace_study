package org.example.factory.absfactory.pizzastore.order;

import org.example.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * ClassName: AbsFactory
 * Package: org.example.factory.absfactory.pizzastore.order
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/6 15:06
 * @Version 1.0
 */
//一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {
    //让下面的工厂子类来具体实现
    public Pizza createPizza(String orderType);
}
