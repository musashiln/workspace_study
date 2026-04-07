package org.example.factory.factorymethod.pizzastore.pizza;

/**
 * ClassName: BJCheesePizza
 * Package: org.example.factory.factorymethod.pizzastore.pizza
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/6 12:14
 * @Version 1.0
 */
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的奶酪pizza");
        System.out.println("北京的奶酪pizza 准备原材料");
    }
}
