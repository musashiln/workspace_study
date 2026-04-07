package org.example.factory.factorymethod.pizzastore.order;

import org.example.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import org.example.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import org.example.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * ClassName: LDOrderPizza
 * Package: org.example.factory.factorymethod.pizzastore.order
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/6 12:55
 * @Version 1.0
 */
public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;

        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDCheesePizza();
        }

        return pizza;
    }
}
