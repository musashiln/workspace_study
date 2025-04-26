package com.atguigu05.field.exer;

/**
 * ClassName: Test01
 * Package: com.atguigu05.field.exer
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/30 13:54
 * @Version 1.0
 */
class HelloA {
    public HelloA() {
        System.out.println("helloA");
    }

    public HelloA(String string) {
        System.out.println("helloA str");
    }

    {
        System.out.println("i'm A class");
    }

    static {
        System.out.println("static A");
    }
}
class HelloB extends HelloA{
    public HelloB() {
        super("abc");
        System.out.println("helloB");
    }

    {
        System.out.println("i'm B class");
    }

    static {
        System.out.println("static B");
    }
}


public class Test01 {
    public static void main(String[] args) {
        new HelloB();
    }
}
