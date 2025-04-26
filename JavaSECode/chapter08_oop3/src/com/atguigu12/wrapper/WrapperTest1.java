package com.atguigu12.wrapper;

import org.junit.Test;

/**
 * ClassName: WrapperTest1
 * Package: com.atguigu12.wrapper
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/4 13:07
 * @Version 1.0
 */
public class WrapperTest1 {
    /*
        基本数据类型、包装类--->String 类型：1.调用STRING的重载的静态方法valueOf 2.基本数据类型 + 连接符""
        String ---> 基本数据类型、包装类:调用包装类的静态方法parsexx()
         */
    @Test
    public void test1(){
        String s3 = "123";
        Integer i3 = Integer.parseInt(s3);
        System.out.println(i3);

//        s3 = "123a";
//        i3 = Integer.parseInt(s3);
//        System.out.println(i3);
    }

    @Test
    public void test(){
        int i = 10;
        Integer i1 = i;
        String s = String.valueOf(i);
        String s1 = String.valueOf(i1);
        System.out.println(s);
        System.out.println(s1);

        String s2 = i1 + "";
        System.out.println("s2:" + s2);


    }
}
