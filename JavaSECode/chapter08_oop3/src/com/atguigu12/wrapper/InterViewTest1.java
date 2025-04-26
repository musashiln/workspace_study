package com.atguigu12.wrapper;

/**
 * ClassName: InterViewTest1
 * Package: com.atguigu12.wrapper
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/4 14:49
 * @Version 1.0
 */
public class InterViewTest1 {
    public static void main(String[] args) {
        Object o = true? Integer.valueOf(10): Double.valueOf(10.2);
        System.out.println(o);

        if(true){
            o = Integer.valueOf(11);
        }else {
            o = Double.valueOf(11.1);
        }
        System.out.println(o);
    }
}
