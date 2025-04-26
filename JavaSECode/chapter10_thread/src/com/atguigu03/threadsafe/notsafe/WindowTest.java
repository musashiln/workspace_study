package com.atguigu03.threadsafe.notsafe;

import static java.lang.Thread.sleep;

/**
 * ClassName: WindowTest
 * Package: com.atguigu03.threadsafe
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/6 12:47
 * @Version 1.0
 */
public class WindowTest {
    public static void main(String[] args) {
        SaleTicket saleTicket = new SaleTicket();
        Thread thread1 = new Thread(saleTicket);
        Thread thread2 = new Thread(saleTicket);
        Thread thread3 = new Thread(saleTicket);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class SaleTicket implements Runnable{

    int ticket = 100;
    Object object = new Object();
    @Override
    public void run() {
        while(true){
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (this){
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "售票，票号为:" + ticket);
                    ticket--;
                }else {
                    break;
                }

            }

        }
    }
}
