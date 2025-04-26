package com.atguigu07._abstract;

/**
 * ClassName: Person
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/17 21:38
 * @Version 1.0
 */
public abstract class Person extends Creature{

    int age;

    String name;

    public Person() {

    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract void eat();

    public void sleep() {
        System.out.println("person sleep");
    }
}
