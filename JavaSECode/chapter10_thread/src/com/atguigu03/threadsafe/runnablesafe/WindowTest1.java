package com.atguigu03.threadsafe.runnablesafe;

import static java.lang.Thread.sleep;

/**
 * ClassName: WindowTest1
 * Package: com.atguigu03.threadsafe.notsafe
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/14 21:44
 * @Version 1.0
 */
public class WindowTest1 {
    public static void main(String[] args) {
        SaleTicket1 saleTicket = new SaleTicket1();
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

class SaleTicket1 implements Runnable{

    int ticket = 100;
    Object object = new Object();
    boolean isFlag = true;
    @Override
    public void run() {
        while(isFlag){
            show();
        }
    }

    public synchronized void show(){
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
                   isFlag = false;
                }

            }

    }
}
