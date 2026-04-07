package org.example.singleton.type5;

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
 懒汉式(线程不安全,同步代码块)

 优缺点说明:

 1)这种方式,本意是想对第四种实现方式的改进,因为前面同步方法效率太低,
 改为同步产生实例化的的代码块
 2)但是这种同步并不能起到线程同步的作用。跟第3种实现方式遇到的情形一
 致,假如一个线程进入了if(singleton == null)判断语句块,还未来得及往下执行,
 另一个线程也通过了这个判断语句,这时便会产生多个实例
 3)结论:在实际开发中,不能使用这种方式
 */
public class SingletonTest05 {
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
    //已经进入了判断，一个线程结束了，另一个线程进入时，依然会改变
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
