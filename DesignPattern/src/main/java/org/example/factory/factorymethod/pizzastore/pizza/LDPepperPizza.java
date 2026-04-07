package org.example.factory.factorymethod.pizzastore.pizza;

/**
 * ClassName: LDPepperPizza
 * Package: org.example.factory.factorymethod.pizzastore.pizza
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/6 12:15
 * @Version 1.0
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的胡椒pizza");
        System.out.println("伦敦的胡椒pizza 准备原材料");
    }
}
