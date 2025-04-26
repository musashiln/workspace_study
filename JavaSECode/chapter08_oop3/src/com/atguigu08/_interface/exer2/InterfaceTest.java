package com.atguigu08._interface.exer2;

/**
 * ClassName: InterfaceTest
 * Package: com.atguigu08._interface.exer2
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/1 21:41
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle comparableCircle = new ComparableCircle(2.3);
        ComparableCircle comparableCircle1 = new ComparableCircle(5.3);

        int compareValue = comparableCircle.compareTo(comparableCircle1);
        if(compareValue > 0){
            System.out.println("c1对象大");
        } else if (compareValue < 0) {
            System.out.println("c2对象大");
        }else {
            System.out.println("相等");
        }
    }
}
