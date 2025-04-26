package com.atguigu03.threadsafe.exer;

import static java.lang.Thread.sleep;

/**
 * ClassName: AccountTest
 * Package: com.atguigu03.threadsafe.exer
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/14 23:59
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();

        Customer customer = new Customer(account,"1");
        Customer customer1 = new Customer(account,"2");

        customer.start();
        customer1.start();

    }
}

class Account{
    private double balance;

    public synchronized void deposit(double amt){ //动态，this:acct
        if(amt > 0){

            balance += amt;
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + ":deposit,1000,balance:" + balance);
    }
}

class Customer extends Thread{
    Account account;

    public Customer(Account account){
        this.account = account;
    }

    public Customer(Account account, String name){
        super(name);
        this.account = account;
    }

    @Override
    public void run() {

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 3; i++) {
            account.deposit(1000);
        }
    }
}
