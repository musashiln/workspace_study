package org.example.singleton.type2;

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
 饿汉式(静态代码块)

 优缺点说明:

 1)这种方式和饿汉式(静态常量)其实类似,只不过将类实例化的过程放在了静态代码块
 中,也是在类装载的时候,就执行静态代码块中的代码,初始化类的实例。优
 缺点和上面是一样的。
 2)结论:这种单例模式可用,但是可能造成内存浪费
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}


//饿汉式(静态代码块)

class Singleton {

    //1.构造器私有化，外部不能new
    private Singleton() {

    }

    //2.本类内部创建对象实例
    private static Singleton instance;

    static {   //在静态代码块中，创建单例对象（）
        instance = new Singleton();
    }


    //3.提供一个公有的静态方法，返回对象实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
