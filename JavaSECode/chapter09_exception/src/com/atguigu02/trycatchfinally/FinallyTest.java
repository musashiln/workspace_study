package com.atguigu02.trycatchfinally;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: FinallyTest
 * Package: com.atguigu02.trycatchfinally
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/5 13:50
 * @Version 1.0
 */
public class FinallyTest {

    @Test
    public void test1(){
        //NumberFormatException
        try {
            String str = "123";
            str = "abc";
            int i = Integer.parseInt(str);
            System.out.println(i);
        }catch (NumberFormatException e){
            e.printStackTrace();
//            System.out.println(e.getMessage());
            System.out.println(10 / 0);
        }

        System.out.println("程序结束");
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
//            System.out.println(e.getMessage());
            System.out.println(10 / 0);
        }finally {
            System.out.println("程序结束");
        }
    }

    @Test
    public void test3()  {
        FileInputStream fis = null;
        try {
            File file = new File("D:\\Document\\Java\\code\\workspace_study\\JavaSECode\\chapter09_exception\\src\\com\\atguigu01\\throwable\\hello.txt");
            fis = new FileInputStream(file); //可能FileNotFoundException

            int data =  fis.read();   //可能报IOException
            while (data != -1){
                System.out.print((char) data);
                data = fis.read();   //可能报IOException
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(fis != null){
                    fis.close();  //可能报IOException
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println("读取结束");
    }


}
