package com.atguigu12.wrapper;

/**
 * ClassName: IntegerTest
 * Package: com.atguigu12.wrapper
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/4 14:29
 * @Version 1.0
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(1);
        Integer i1 = Integer.valueOf(1);
        System.out.println(i == i1);  //true

        Integer j = 1;
        Integer j1 = 1;
        System.out.println(j == j1);  //true

        Integer k = 128;
        Integer k1 = 128;
        System.out.println(k == k1);  //false

    }
}
