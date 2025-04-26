package com.atguigu02.method_lifecycle;

/**
 * ClassName: EvenNumberTest
 * Package: com.atguigu02.method_lifecycle
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/6 10:48
 * @Version 1.0
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber();
        printNumber.setName("子线程");
        printNumber.setPriority(Thread.MIN_PRIORITY);
        printNumber.start();

        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":"
                        + Thread.currentThread().getPriority() + ":" + i);
            }

//            if(i == 20){
//                try {
//                    printNumber.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }

//        System.out.println(printNumber.isAlive());


    }
}

class PrintNumber extends Thread{
    public PrintNumber() {
    }

    public PrintNumber(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException();
//            }
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":"
                        + Thread.currentThread().getPriority() + ":" + i);
            }

//            if(i % 20 == 0){
//                Thread.yield();
//            }
        }
    }
}
