package com.atguigu07._abstract;

/**
 * ClassName: Student
 * Package: com.atguigu07._abstract
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/30 16:06
 * @Version 1.0
 */
public class Student extends Person{
    String school;

    public Student(){

    }

    public Student(int age, String name, String school) {
        super(age, name);
        this.school = school;
    }

    @Override
    public void eat() {
        System.out.println("student eat");
    }

    @Override
    public void sleep() {
        System.out.println("student sleep");
    }

    @Override
    public void breath() {

    }
}
