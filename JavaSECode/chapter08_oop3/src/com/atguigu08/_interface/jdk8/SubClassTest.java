package com.atguigu08._interface.jdk8;

/**
 * ClassName: SubClassTest
 * Package: com.atguigu08._interface.jdk8
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/1 22:34
 * @Version 1.0
 */
public class SubClassTest {
    public static void main(String[] args) {
        //1.接口中实现的静态方法只能接口来调用，实现类不能调用
        CompareA.method1();
//        SubClass.method1();

        //2.接口中声明的默认方法可以被实现类继承，
        //实现类在没有重写时调用的是接口中声明的默认方法
        SubClass subClass = new SubClass();
        subClass.method2();

        //3.类实现了两个接口，而两个接口中定义了同名参数的默认方法。
        //则实现类在没有重写此两个接口默认方法的情况下，会报错，接口冲突
        //此时实现类必须要重写接口定义的同名同参数的方法 ---》接口冲突
        subClass.method3();

        //4.子类(或实现类)继承了父类并实现了接口。父类和接口中声明了同名同参数的方法（其中，接口中的方法为默认方法)
        //默认情况下，子类或实现类在没有重写此方法的请款修改，调用的是父类中的方法----》类优先原则
        subClass.method4();

        CompareA.method1();

        subClass.method();

    }
}
