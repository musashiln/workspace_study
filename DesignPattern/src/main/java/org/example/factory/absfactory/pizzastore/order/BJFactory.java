package org.example.factory.absfactory.pizzastore.order;

import org.example.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import org.example.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import org.example.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * ClassName: BJFactory
 * Package: org.example.factory.absfactory.pizzastore.order
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/6 15:10
 * @Version 1.0
 */

//这是工厂子类
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
