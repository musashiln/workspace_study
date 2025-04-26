package com.atguigu08._interface.jdk8;

/**
 * ClassName: SubClass
 * Package: com.atguigu08._interface.jdk8
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/1 22:33
 * @Version 1.0
 */
public class SubClass extends SuperClass implements CompareA,CompareB{

    @Override
    public void method2() {
        System.out.println("subclass:shanghai");
    }

    public void method3() {
        System.out.println("subclass:guangzhou");
    }

    public void method4() {
        System.out.println("subclass:shenzhen");
    }

    public void method(){
        //5.如何在子类或者实现类中调用父类或者接口中被重写的方法
        method4();
        super.method4();
        method3();
        CompareA.super.method4(); //调用接口A中的默认方法
        CompareB.super.method3();
    }
}
