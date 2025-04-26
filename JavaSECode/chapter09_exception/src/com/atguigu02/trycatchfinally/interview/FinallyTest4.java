package com.atguigu02.trycatchfinally.interview;

/**
 * ClassName: FinallyTest4
 * Package: com.atguigu02.trycatchfinally.interview
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/5 14:08
 * @Version 1.0
 */
public class FinallyTest4 {
    public static void main(String[] args) {
        int result = test(20);
        System.out.println(result);
    }

    public static int test(int num){
        try {
            return num;
        }catch (NumberFormatException e){
            return num--;
        }finally {
            System.out.println("test结束");
//            return ++num;
            ++num;
        }
    }
}
