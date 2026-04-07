package org.example.factory.absfactory.pizzastore.order;

import org.example.factory.absfactory.pizzastore.pizza.*;

/**
 * ClassName: LDFactory
 * Package: org.example.factory.absfactory.pizzastore.order
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/6 15:17
 * @Version 1.0
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
