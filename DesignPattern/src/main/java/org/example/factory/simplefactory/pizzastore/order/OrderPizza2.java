package org.example.factory.simplefactory.pizzastore.order;

import org.example.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ClassName: OrderPizza2
 * Package: org.example.factory.simplefactory.pizzastore.order
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/6 11:41
 * @Version 1.0
 */

//静态工厂
public class OrderPizza2 {

    Pizza pizza = null;
    String orderType = "";

    //构造器
    public OrderPizza2() {
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);

            //输出pizza
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类");
            String str = strIn.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
