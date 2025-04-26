package com.atguigu01.throwable;

/**
 * ClassName: ErrorTest
 * Package: com.atguigu01.throwable
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/4 21:30
 * @Version 1.0
 */
public class ErrorTest {
    public static void main(String[] args) {
        //example1:.StackOverflowError
//        main(args);

        //example2:OutOfMemoryError
        byte[] arr = new byte[1024 * 1024 * 100]; //100mb
    }
}
