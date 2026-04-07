package org.example.singleton.type4;

/**
 * ClassName: SingletonTest01
 * Package: org.example.singleton.type1
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/5 20:33
 * @Version 1.0
 */

/**懒汉式(线程安全,同步方法)

 优缺点说明:

 1)解决了线程不安全问题
 2)效率太低了,每个线程在想获得类的实例时候,执行getInstance()方法都要进行
 同步。而其实这个方法只执行一次实例化代码就够了,后面的想获得该类实例,
 直接return就行了。方法进行同步效率太低
 3)结论:在实际开发中,不推荐使用这种方式
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}


//    懒汉式(线程安全，同步方法)

class Singleton {

    //1.构造器私有化，外部不能new
    private Singleton() {

    }

    //2.本类内部创建对象实例
    private static Singleton instance;

    //3.提供一个公有的静态方法，当使用到该方法时，才会去创建instance
    //加入同步处理的代码，解决线程安全问题
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
