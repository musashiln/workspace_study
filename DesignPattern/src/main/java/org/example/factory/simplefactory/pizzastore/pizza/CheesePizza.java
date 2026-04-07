package org.example.factory.simplefactory.pizzastore.pizza;

/**
 * ClassName: CheesePizza
 * Package: org.example.factory.simplefactory.pizzastore
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/6 9:46
 * @Version 1.0
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨 准备原材料");
    }
}
