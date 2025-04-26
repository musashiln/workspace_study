package com.atguigu01.create.runnable;

/**
 * ClassName: EvenNumberTest
 * Package: com.atguigu01.create.runnable
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/5 21:50
 * @Version 1.0
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        EvenNumberPrint evenNumberPrint = new EvenNumberPrint();
        new Thread(evenNumberPrint).start();

        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }

        new Thread(evenNumberPrint).start();
    }
}

class EvenNumberPrint implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
