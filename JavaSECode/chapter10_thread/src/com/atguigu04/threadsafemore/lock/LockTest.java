package com.atguigu04.threadsafemore.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: WindowTest1
 * Package: com.atguigu03.threadsafe.notsafe
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/14 21:44
 * @Version 1.0
 */
public class LockTest {
    public static void main(String[] args) {
        SaleTicket1 saleTicket1 = new SaleTicket1();
        SaleTicket1 saleTicket2 = new SaleTicket1();
        SaleTicket1 saleTicket3 = new SaleTicket1();
        saleTicket1.start();
        saleTicket2.start();
        saleTicket3.start();
    }
}

class SaleTicket1 extends Thread{
    static int ticket = 100;

    //1.需要确保多个线程共用同一个lock实例
    private static final ReentrantLock LOCK = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            try {
                LOCK.lock();
                if(ticket > 0){
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "售票，票号为:" + ticket);
                    ticket--;
                }else {
                    break;
                }
            } finally {
                LOCK.unlock();
            }
        }
    }
}
