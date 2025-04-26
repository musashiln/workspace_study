package com.atguigu01.create.thread;

public class EvenNumberTest {
    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber();
        printNumber.start();

        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i + "***********");
            }
        }

//        printNumber.start();
        PrintNumber printNumber1 = new PrintNumber();
        printNumber1.start();
    }
}

class PrintNumber extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

