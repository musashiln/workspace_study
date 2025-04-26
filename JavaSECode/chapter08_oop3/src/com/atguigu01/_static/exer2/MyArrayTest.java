package com.atguigu01._static.exer2;

/**
 * ClassName: MyArrayTest
 * Package: com.exce.one
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/13 23:42
 * @Version 1.0
 */
public class MyArrayTest {
    public static void main(String[] args) {


        int[] arr = new int[]{34,56,223,2,56,24,56,67,778,45};

        System.out.println("max value = " + MyArrays.getMax(arr));

        System.out.println("min value = " + MyArrays.getMin(arr));

        System.out.println("avg value = " + MyArrays.getAvg(arr));

        MyArrays.print(arr);

        MyArrays.sort(arr);

        MyArrays.print(arr);
    }
}
