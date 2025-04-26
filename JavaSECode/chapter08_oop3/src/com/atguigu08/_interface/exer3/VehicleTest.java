package com.atguigu08._interface.exer3;

/**
 * ClassName: VehicalTest
 * Package: com.atguigu08._interface.exer3
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/1 22:10
 * @Version 1.0
 */
public class VehicleTest {
    public static void main(String[] args) {
         Developer developer = new Developer();

         Vehicle[] vehicles = new Vehicle[3];
         vehicles[0] = new Bicycle("捷安特","红");
         vehicles[1] = new ElectricVehicle("雅迪","蓝");
         vehicles[2] = new Car("奔驰","黑色","沪");

        for (int i = 0; i < vehicles.length; i++) {
            developer.takingVehicle(vehicles[i]);
            if(vehicles[i] instanceof IPower){
                ((IPower) vehicles[i]).power();
            }
        }

    }
}
