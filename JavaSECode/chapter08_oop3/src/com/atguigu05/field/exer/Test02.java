package com.atguigu05.field.exer;

/**
 * ClassName: Test02
 * Package: com.atguigu05.field.exer
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/30 13:585;
 * @Version 1.0
 */
public class Test02 {
    static int x, y, z;

    static {
        int x = 5;
        x--;
    }

    static {
        x--; //x=-1
    }

    public static void method() {
        y = z++ + ++z;  //z=0,1  y=-1+1=0
    }

    public static void main(String[] args) {
        System.out.println("x=" + x);
        z--;  //z=-1
        method();
        System.out.println("result:" + (z + y + ++z));  //1+0+2=3
    }
}
