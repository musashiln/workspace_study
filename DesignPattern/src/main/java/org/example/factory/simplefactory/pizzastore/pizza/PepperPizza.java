package org.example.factory.simplefactory.pizzastore.pizza;

/**
 * ClassName: PepperPizza
 * Package: org.example.factory.simplefactory.pizzastore.pizza
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/6 10:44
 * @Version 1.0
 */
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给制作胡椒披萨 准备原材料");
    }
}
