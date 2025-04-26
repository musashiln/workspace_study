package com.atguigu01._static.exer1;

/**
 * ClassName: AccountTest
 * Package: com.atguigu01._static.exer1
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/29 19:29
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account();
        System.out.println(account1);

        Account account2 = new Account();
        System.out.println(account2);

        Account.setInterestRate(0.005);
        Account.setMinBalance(10);

        System.out.println(Account.getInterestRate());
        System.out.println(Account.getMinBalance());


    }
}
