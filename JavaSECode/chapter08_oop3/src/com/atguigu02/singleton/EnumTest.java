package com.atguigu02.singleton;

/**
 * ClassName: EnumTest
 * Package: com.atguigu02.singleton
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/4 15:38
 * @Version 1.0
 */
public class EnumTest {
    public static void main(String[] args) {
        B instance = B.INSTANCE;

    }
}



enum B{
    INSTANCE;
}
