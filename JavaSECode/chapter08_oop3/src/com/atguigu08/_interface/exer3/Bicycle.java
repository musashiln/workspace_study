package com.atguigu08._interface.exer3;

/**
 * ClassName: Bicycle
 * Package: com.atguigu08._interface.exer3
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/1 21:59
 * @Version 1.0
 */
public class Bicycle extends Vehicle{

    public Bicycle() {
    }

    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("自行车人力");
    }
}
