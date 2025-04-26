package com.atguigu05.exer.exer1;

/**
 * ClassName: ReturnExceptionDemo
 * Package: com.atguigu05.exer.exer1
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/5 16:57
 * @Version 1.0
 */
public class ReturnExceptionDemo {

    static void methodA() throws Exception{
        try {
            System.out.println("进入方法A");
            throw new Exception("制造异常");
        }finally {
            System.out.println("用A方法的finally");
        }
    }

    static void methodB(){
        try {
            System.out.println("进入方法B");
            return;
        }finally {
            System.out.println("用B方法的finally");
        }
    }

    public static void main(String[] args) {
        try {
            methodA();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        methodB();
    }
}
