package org.example.singleton.type3;

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
 懒汉式(线程不安全)

 优缺点说明:

 1)起到了Lazy Loading的效果,但是只能在单线程下使用。
 2)如果在多线程下,一个线程进入了if(singleton == null)判断语句块,还未来得及
 往下执行,另一个线程也通过了这个判断语句,这时便会产生多个实例。所以
 在多线程环境下不可使用这种方式
 3)结论:在实际开发中,不要使用这种方式.
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}


//    懒汉式(线程不安全)

class Singleton {

    //1.构造器私有化，外部不能new
    private Singleton() {

    }

    //2.本类内部创建对象实例
    private static Singleton instance;

    //3.提供一个公有的静态方法，当使用到该方法时，才会去创建instance
    //即懒汉式
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
