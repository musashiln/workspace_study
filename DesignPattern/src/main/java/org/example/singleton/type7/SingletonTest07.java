package org.example.singleton.type7;

/**
 * ClassName: SingletonTest01
 * Package: org.example.singleton.type1
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/5 20:33
 * @Version 1.0
 */

/**
 静态内部类

 优缺点说明:

 1)这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
 2)静态内部类方式在Singleton类被装载时并不会立即实例化,而是在需要实例化
 时,调用getlnstance方法,才会装载Singletonlnstance类,从而完成Singleton的
 实例化。
 3)类的静态属性金音第一次和就装单时属始化,所以在这里,JVM帮助我们
 保证了线程的全量看蛋类进行初检化时,别的线程是无法进入的。
 4)优点:避免了线程不安全,利用静态内部类特点实现延迟加载,效率高
 5)结论:推荐使用.
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

//Singleton外部类装载时，静态内部类不会被装载，保证了懒汉式
//静态方法用到静态变量的时候，会导致静态内部类被装载,且只会被装载一次,且装载的时候线程安全
//JVM的底层装载机制保证线程安全


// 静态内部类完成，推荐使用
class Singleton {

    //构造器私有化，外部不能new
    private Singleton() {

    }

    //写一个静态内部类，该类中有一个静态属性Singleton
    private static class SingleInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供一个静态的共有方法，直接返回SingletonInstance.INSTANCE
    public static synchronized Singleton getInstance() {
        return SingleInstance.INSTANCE;
    }

}
