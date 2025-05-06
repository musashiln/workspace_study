package com.atguigu01.create.exer1;

import org.junit.Test;

/**
 * ClassName: PrintNumberTest
 * Package: com.atguigu01.create.exer1
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/5 21:25
 * @Version 1.0
 */
class EvenNumber extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }

    @Test
    public void test1(){

    }
}

class OddNumber extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 1){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class PrintNumberTest {
    public static void main(String[] args) {
        //方式1:
        EvenNumber evenNumber = new EvenNumber();
        evenNumber.start();

        OddNumber oddNumber = new OddNumber();
        oddNumber.start();

        //方式2：创建Thread类的匿名子类的匿名对象
        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if(i % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if(i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();

        //方式3：使用实现Runnable接口的方式：提供了Runnable接口匿名实现类的匿名对象
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if(i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if(i % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }).start();
    }
}
