package com.atguigu02.singleton;

/**
 * ClassName: EnumTest1
 * Package: com.atguigu02.singleton
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/4 16:23
 * @Version 1.0
 */
public class EnumTest1 {
    public static void main(String[] args) {
        A a = A.instance;
    }
}

class A{
    private A() {
    }

    public final static A instance = new A();
}
