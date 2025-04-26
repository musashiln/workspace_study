package com.atguigu01._static.exer2;

/**
 * ClassName: MyArrays
 * Package: com.exce.one
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/13 22:39
 * @Version 1.0
 */
public class MyArrays {

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int getAvg(int[] arr){
        return getMax(arr) / arr.length;
    }

    public static void print(int[] arr){
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                System.out.print(arr[i]);
            }else {
                System.out.print("," + arr[i]);
            }
        }
        System.out.println("]");
    }

    public static int[] copy(int[] arr){
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    public static void reverse(int[] arr){
        for (int i = 0,j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }



}
