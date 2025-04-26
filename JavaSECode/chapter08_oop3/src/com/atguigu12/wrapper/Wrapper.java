package com.atguigu12.wrapper;

import org.junit.Test;

/**
 * ClassName: Wrapper
 * Package: com.atguigu12.wrapper
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/4 11:34
 * @Version 1.0
 */
public class Wrapper {
    public static void main(String[] args) {
        A.method();
    }

    @Test
    public void test1() {
        int i1 = 10;
        Integer i = Integer.valueOf(i1);
        System.out.println(i);

        float f1 = 12.3F;
        f1 = 32.2f;
        //自动装箱
        Float ff1 = f1;
        System.out.println(ff1);

        double d1 = 12.4;
        Double dd1 = Double.valueOf(d1);
        System.out.println(dd1);

        String s1 = "32.1";
        Float ff2 = Float.valueOf(s1);

        s1 = "abc";
//        Float.valueOf(s1);

        boolean b1 = true;
        Boolean bb1 = Boolean.valueOf(b1);
        System.out.println(bb1);

        String s2 = "123";
        Boolean bb2 = Boolean.valueOf(s2);
        System.out.println(bb2);
        s2 = "TrUe";
        bb2 = Boolean.valueOf(s2);
        System.out.println(bb2);
    }

    @Test
    public void test2(){

        //语法糖
        //自动装箱：基本数据类型->包装类
        Integer i2 = 10;
        int ii2 = i2.intValue();
        ii2++;
        System.out.println(ii2);

        //自动拆箱：包装类->基本数据类型
        int i3 = i2 + 2;
        System.out.println(i3);


    }


}


class A{
    public int j = 20;
    public static void method(){
        System.out.println("hello");
        B b = new B();
        System.out.println(b.getI());
//        System.out.println(j);
    }
}

class B{
    private int i = 10;

    public int getI() {
        return i;
    }
}
