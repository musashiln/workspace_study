package com.atguigu12.wrapper;

/**
 * ClassName: InterviewTest
 * Package: com.atguigu12.wrapper
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/4 14:35
 * @Version 1.0
 */
public class InterviewTest {
    public static void main(String[] args) {
        int i = 10;
        double d = 10.2;
        System.out.println(i == d); //false

        Integer i1 = 10;
        Double d1 = 10.2;
//        System.out.println(i1 == d1);

        Integer m = 1000;
        double n = 1000;
        System.out.println(m == n); //true

        Integer x = 1000;
        int y = 1000;
        System.out.println(x == y);  //true

    }
}
