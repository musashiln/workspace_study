package com.atguigu08._interface.jdk8;

/**
 * ClassName: CompareA
 * Package: com.atguigu08._interface.jdk8
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/1 22:29
 * @Version 1.0
 */
public interface CompareA {

    //属性：声明为public static final
    //方法：jdk8之前：只能声明抽象方法

    //方法：jdk8中：静态方法
    public static void method1(){
        System.out.println("CompareA:beijing");

    }

    public default void method2(){
        System.out.println("CompareA:shanghai");
    }

    public default void method3(){
        System.out.println("CompareA:guangzhou");
    }

    public default void method4(){
        System.out.println("CompareA:shenzhen");
        method5();
    }

    private void method5(){
        System.out.println("接口中定义的私有方法");
    }


}
