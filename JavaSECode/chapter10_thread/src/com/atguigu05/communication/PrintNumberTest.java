package com.atguigu05.communication;

/**
 * ClassName: PrintNumberTest
 * Package: com.atguigu05.communication
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/15 23:24
 * @Version 1.0
 */

class PrintNumber implements Runnable{
    private int number = 1;
    @Override
    public void run() {
        while (true){
            synchronized (this) {
                this.notify();

                if(number <= 100){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        this.wait();  //线程一旦执行此方法，就进入等待状态，同时释放同步监视器的调用
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }
        }
    }
}

public class PrintNumberTest {
    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber();
        Thread thread1 = new Thread(printNumber);
        Thread thread2 = new Thread(printNumber);
        thread1.start();
        thread2.start();
    }
}
