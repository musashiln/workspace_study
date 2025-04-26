package com.atguigu06._final;

/**
 * ClassName: FinalTest
 * Package: com.atguigu06._final
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/30 15:02
 * @Version 1.0
 */
public class FinalTest {
    public static void main(String[] args) {
        E e = new E();
//        e.MAX_SCORE = 20;
        D d = new D();
        d.method();
    }

}

final class A{

}

//class B extends A{}

//class SubString extends String{}

class C{
    public final void method(){
        System.out.println("c method");
    }
}

class D extends C{
//    @Override
//    public void method() {
//        super.method();
//    }
}

class E {
    public final int MAX_SCORE = 10;
    public final int MIN_SCORE;
    public final int LEFT;
//    public final int RIGHT;

    {
        MIN_SCORE = 5;
    }

    public E(){
        LEFT = 1;
    }

    public E(int left){
        LEFT = 2;
    }

//    public void setRIGHT(int right){
//        RIGHT = right;
//    }
}

class F{
    public void method(){
        final int num = 10;
//        num++;
        System.out.println(num);
    }

    public void method1(final int num) {
//        num++;
        System.out.println(num);
    }
}
