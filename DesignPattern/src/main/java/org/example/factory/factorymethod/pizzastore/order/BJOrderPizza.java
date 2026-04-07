package org.example.factory.factorymethod.pizzastore.order;


import org.example.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import org.example.factory.factorymethod.pizzastore.pizza.Pizza;


import javax.annotation.PreDestroy;

/**
 * ClassName: BJOrderPizza
 * Package: org.example.factory.factorymethod.pizzastore.order
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/6 12:48
 * @Version 1.0
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;

        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJCheesePizza();
        }

        return pizza;
    }
}
