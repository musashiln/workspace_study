package com.atguigu14.review;

/**
 * ClassName: StaticTest
 * Package: com.atguigu14.review
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/4 18:01
 * @Version 1.0
 */
public class StaticTest {
    public static void main(String[] args) {
        Person person = null;
        person.eat();

        person = new Student();
        person.eat();

        //子类父类完全为两个方法，没有发生重写，static方法是由类调用的和对象没有关系，可以
        //理解静态上没有也不会使用多态
        //因此静态方法不能重写，也没有多态性
    }
}

class Person{
    public static void eat(){
        System.out.println("person eat");
    }
}

class Student extends Person{
    public static void eat(){
        System.out.println("student eat");
    }
}