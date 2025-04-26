package com.atguigu02.singleton;

/**
 * ClassName: BankTest
 * Package: com.atguigu02.singleton
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/29 20:09
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {

        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank2 == bank1);

    }
}

//饿汉式：内存中占用时间较长；线程安全
class Bank {

    //1.类的构造器私有化
    private Bank() {

    }

    //2.在类的内部创建当前类的实例
    //4.静态方法访问的属性也必须是静态的
    private static Bank instance = new Bank();

    //3.使用getXxx()方法获取当前类的实例，必须声明为静态的
    public static Bank getInstance() {
        return instance;
    }
}
