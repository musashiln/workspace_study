package org.example.factory.simplefactory.pizzastore.pizza;

/**
 * ClassName: GreekPizza
 * Package: org.example.factory.simplefactory.pizzastore
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/6 9:47
 * @Version 1.0
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作希腊披萨 准备原材料");
    }
}
