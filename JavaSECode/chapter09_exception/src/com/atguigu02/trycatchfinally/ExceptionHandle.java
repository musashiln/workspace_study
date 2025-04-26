package com.atguigu02.trycatchfinally;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ClassName: ExceptionHandle
 * Package: com.atguigu02.trycatchfinally
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/5 13:16
 * @Version 1.0
 */
public class ExceptionHandle {
    @Test
    public void test1(){
        //InputMismatchException
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println(num);

        }catch (InputMismatchException e){
            System.out.println("出现了InputMismatchException 异常");
        }catch (NullPointerException e){
            System.out.println("出现了NullPointerException 异常");
        }catch (RuntimeException e){
            System.out.println("出现了RuntimeException 异常");
        }

        System.out.println("异常处理结束，代码继续...");
    }

    @Test
    public void test2(){
        //NumberFormatException
        try {
            String str = "123";
            str = "abc";
            int i = Integer.parseInt(str);
            System.out.println(i);

        }catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("程序结束");
    }

    @Test
    public void test3()  {
        try {
            File file = new File("D:\\Document\\Java\\code\\workspace_study\\JavaSECode\\chapter09_exception\\src\\com\\atguigu01\\throwable\\hello.txt");
            FileInputStream fis = new FileInputStream(file); //可能FileNotFoundException

            int data =  fis.read();   //可能报IOException
            while (data != -1){
                System.out.print((char) data);
                data = fis.read();   //可能报IOException
            }
            fis.close();  //可能报IOException

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("读取结束");


    }
}
