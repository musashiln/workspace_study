package com.atguigu01.create.exer2;

/**
 * ClassName: Exer
 * Package: com.atguigu01.create.exer2
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/5 22:27
 * @Version 1.0
 */
public class Exer {
    public static void main(String[] args) {
        A a = new A();
        a.start();  //1.启动线程 2.调用Thread类的run() ，没有传入对象，走了方法重写

        B b = new B(a); //1.启动线程 2.调用Thread类的run() ，传入对象，走了Thread类的run()中该对象的调用run
        b.start();
    }
}

class A extends Thread{
    @Override
    public void run() {
        System.out.println("线程A的run()...");
    }
}

class B extends Thread{
    private A a;
    public B(A a){
       // this.a = a
        super(a);
    }
//    @Override
//    public void run() {
//        System.out.println("线程B的run()...");
//    }
}