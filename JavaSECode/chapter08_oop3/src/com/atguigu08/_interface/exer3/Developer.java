package com.atguigu08._interface.exer3;

/**
 * ClassName: Developer
 * Package: com.atguigu08._interface.exer3
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/1 21:48
 * @Version 1.0
 */
public class Developer {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void takingVehicle(Vehicle vehicle){
        vehicle.run();
    }
}
