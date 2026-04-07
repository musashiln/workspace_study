package org.example.singleton.type6;

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
 * 双检锁
 优缺点说明:

 1)Double-Check概念是多线程开发中常使用到的,如代码中所示,我们进行了两
 次if(singleton == null)检查,这样就可以保证线程安全了。
 2)这样,实例化代码只用执行一次,后面再次访问时,判断if(singleton == null),
 直接return实例化对象,也避免的反复进行方法同步.
 3)线程安全;延迟加载;效率较高
 4)结论:在实际开发中,推荐使用这种单例设计模式
 */
public class SingletonTest06 {
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

    //3.提供一个公有的静态方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    //同时保证了效率，推荐使用
    //比如刚开始时a,b,c同时进入了第一个if里，这时a拿到了锁，进入了代码块创建实例，而b,c被阻塞，
    // a结束后b,c同步不会再创建实例,再后面d,e等其他线程再执行getInstance，不会再需要同步，而是直接return，
    //提高了效率
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
