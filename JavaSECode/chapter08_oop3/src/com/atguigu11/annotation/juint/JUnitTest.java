package com.atguigu11.annotation.juint;

import org.junit.Test;

import java.util.Scanner;

/**
 * ClassName: JUnitTest
 * Package: com.atguigu11.annotation.juint
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/4 9:52
 * @Version 1.0
 */

//类:非抽象的，有唯一空参构造器，public
public class JUnitTest {

    //方法 public 非抽象 非静态 无返回值 无参
    //可以在里面调用要测试的方法
    @Test
    public void test1(){
        System.out.println("hello");
    }

    @Test
    public void test3(){
        System.out.println("enter:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter:" + scanner.nextInt());
    }

    @Test
    public void test4(){
        System.out.println("hello");
    }
}
