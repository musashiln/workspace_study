package org.example.factory.factorymethod.pizzastore.pizza;

/**
 * ClassName: BJPepperPizza
 * Package: org.example.factory.factorymethod.pizzastore.pizza
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/6 12:15
 * @Version 1.0
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的胡椒pizza");
        System.out.println("北京的胡椒pizza 准备原材料");
    }
}
