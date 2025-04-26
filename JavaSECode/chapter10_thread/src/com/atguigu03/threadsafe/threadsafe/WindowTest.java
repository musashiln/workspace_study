package com.atguigu03.threadsafe.threadsafe;

/**
 * ClassName: WindowTest
 * Package: com.atguigu03.threadsafe.threadsafe
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/14 23:13
 * @Version 1.0
 */
public class WindowTest {
    public static void main(String[] args) {
        SaleTicket saleTicket1 = new SaleTicket();
        SaleTicket saleTicket2 = new SaleTicket();
        SaleTicket saleTicket3 = new SaleTicket();
        saleTicket1.start();
        saleTicket2.start();
        saleTicket3.start();
    }
}

class SaleTicket extends Thread{
    static int ticket = 100;
    static Object object = new Object();
    static boolean isFlag = true;
    @Override
    public void run() {
        while(isFlag){
            show();
        }
    }

    public static synchronized void show(){
        if(ticket > 0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "售票，票号为:" + ticket);
            ticket--;
        }else {
            isFlag = false;
        }
    }
}
