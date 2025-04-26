package com.atguigu08._interface.exer3;/**
         * ClassName: EletricVehicle
         * Package: com.atguigu08._interface.exer3
         * Description:
         * @Author gxy
         * @Create 2025/4/1 22:00
         * @Version 1.0
         */

public class ElectricVehicle extends Vehicle implements IPower{
    public ElectricVehicle() {
    }

    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("电动车电机驱动");
    }

    @Override
    public void power() {
        System.out.println("电动车使用电力提供动力");
    }
}
