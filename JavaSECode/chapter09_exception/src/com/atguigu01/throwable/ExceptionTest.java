package com.atguigu01.throwable;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 * ClassName: ExceptionTest
 * Package: com.atguigu01.throwable
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/4 21:53
 * @Version 1.0
 */
public class ExceptionTest {


    /*******************runtime exception**********************************/

    //ArrayIndexOutOfBoundsException
    @Test
    public void test1(){
        int arr[] = new int[10];
        System.out.println(arr[10]);
    }

    @Test
    public void test2(){
        //NullPointerException
//        String str = "hello";
//        str = null;
//        System.out.println(str.toString());

        //NullPointerException
//        int[] arr1 = new int[10];
//        arr1 = null;
//        System.out.println(arr1[0]);

        //NullPointerException
        int[][] arr2 = new int[10][];
        System.out.println(arr2[0][0]);

    }

    @Test
    public void test3(){
        //ClassCastException
        Object o = new String();
//        String s = (String) o;
        Date d = (Date) o;

    }

    @Test
    public void test4(){
        //NumberFormatException
        String str = "123";
        str = "abc";
        int i = Integer.parseInt(str);
        System.out.println(i);
    }

    @Test
    public void test5(){
        //InputMismatchException
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
    }
    
    @Test
    public void test6(){
        //ArithmeticException
        int num = 10;
        System.out.println(num / 0);
    }

    /***********************compile exception*******************************/

    @Test
    public void test7(){
//        Class clz = Class.forName("java.lang.String");
    }

    @Test
    public void test8() throws IOException {
        File file = new File("D:\\Document\\Java\\code\\workspace_study\\JavaSECode\\chapter09_exception\\src\\com\\atguigu01\\throwable\\hello.txt");
        FileInputStream fis = new FileInputStream(file); //可能FileNotFoundException

        int data =  fis.read();   //可能报IOException
        while (data != -1){
            System.out.print((char) data);
            data = fis.read();   //可能报IOException
        }
        fis.close();  //可能报IOException
    }
}
