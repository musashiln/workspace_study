package org.example.factory.factorymethod.pizzastore.pizza;

/**
 * ClassName: LDCheesePizza
 * Package: org.example.factory.factorymethod.pizzastore.pizza
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/6 12:15
 * @Version 1.0
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的奶酪pizza");
        System.out.println("伦敦的奶酪pizza 准备原材料");
    }
}
