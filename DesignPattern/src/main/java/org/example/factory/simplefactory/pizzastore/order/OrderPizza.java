package org.example.factory.simplefactory.pizzastore.order;

import org.example.factory.simplefactory.pizzastore.pizza.CheesePizza;
import org.example.factory.simplefactory.pizzastore.pizza.GreekPizza;
import org.example.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ClassName: OrderPizza
 * Package: org.example.factory.simplefactory.pizzastore.order
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/6 9:50
 * @Version 1.0
 */


/**
 * 传统的方式的优缺点
 * 1)优点是比较好理解，简单易操作。
 * 2)缺点是违反了设计模式的ocp原则，即对扩展开放，对修改关闭。即当我们给类增
 * 新功能的时候，尽量不修改代码，或者尽可能少修改代码，
 * 3)比如我们这时要新增加一个pizza的种类（pepper披萨）,我们需要修改OrderPizza类
 */
public class OrderPizza {

//    传统
//   构造器
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;  //订购披萨的类型
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")) {
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//            } else if (orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//                pizza.setName("奶酪披萨");
//            } else {
//                break;
//            }
//            //输出pizza 制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }



    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    //构造器
    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        String orderType = "";

        this.simpleFactory = simpleFactory; //设置简单工厂对象

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            //输出pizza
            if(pizza != null) {
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
