package com.atguigu04.threadsafemore.singleton;

/**
 * ClassName: BankTest
 * Package: com.atguigu04.threadsafemore.singleton
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/15 20:47
 * @Version 1.0
 */
public class BankTest {
    static Bank bank1 = null;
    static Bank bank2 = null;
    public static void main(String[] args) {

        Thread thread1 = new Thread(){
            @Override
            public void run() {
                bank1 = Bank.getInstance();
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                bank2 = Bank.getInstance();
            }
        };
        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(bank1);
        System.out.println(bank2);
        System.out.println(bank1 == bank2);
    }
}

class Bank{
    private Bank(){

    }
    private volatile static Bank instance = null;

    //方法1
//    public synchronized static Bank getInstance(){//Bank.class
//        if(instance == null){
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            instance = new Bank();
//        }
//        return instance;
//    }

    //方式2
//    public static Bank getInstance(){//Bank.class
//        synchronized (Bank.class) {
//            if(instance == null){
//
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                instance = new Bank();
//            }
//        }
//        return instance;
//    }

    //方式3
    public static Bank getInstance(){//Bank.class
        if (instance == null) {
            synchronized (Bank.class) {
                if(instance == null){

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Bank();
                }
            }
        }
        return instance;
    }

}
