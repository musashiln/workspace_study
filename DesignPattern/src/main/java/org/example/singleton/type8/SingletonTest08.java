package org.example.singleton.type8;

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
  枚举

 优缺点说明:

 1)这借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题,而
 且还能防止反序列化重新创建新的对象。
 2)这种方式是Effective Java作者Josh Bloch 提倡的方式
 3)结论:推荐使用
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        instance.sayOK();
    }
}


//使用枚举，推荐使用
enum Singleton {
    INSTANCE;
    public void sayOK() {
        System.out.println("ok");
    }
}
