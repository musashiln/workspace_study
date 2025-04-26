package com.atguigu03._throws;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: ThrowsTest
 * Package: com.atguigu03._throws
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/5 14:56
 * @Version 1.0
 */
public class ThrowsTest {

    public static void main(String[] args) {
        method3();
    }

    public static void method3(){
        try{
            method2();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void method2() throws IOException {
        method1();
    }

    @Test
    public static void method1() throws FileNotFoundException, IOException {

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
