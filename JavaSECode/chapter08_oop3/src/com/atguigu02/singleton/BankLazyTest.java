package com.atguigu02.singleton;

/**
 * ClassName: BankLazy
 * Package: com.atguigu02.singleton
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/29 20:27
 * @Version 1.0
 */
public class BankLazyTest {
    public static void main(String[] args) {

    }
}

//懒汉式：线程不安全；占用内存时间短
class BankLazy {
    private BankLazy(){

    }

    private static BankLazy instance = null;

    public static BankLazy getInstance() {
        if (instance == null) {
            instance = new BankLazy();
        }

        return instance;
    }
}
