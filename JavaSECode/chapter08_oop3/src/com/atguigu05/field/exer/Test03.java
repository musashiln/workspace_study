package com.atguigu05.field.exer;

/**
 * ClassName: Test03
 * Package: com.atguigu05.field.exer
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/30 14:31
 * @Version 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        Sub sub = new Sub();
    }
}

class Base{
    Base(){
        method(100);
    }
    {
        System.out.println("base");
    }
    public void method(int i){
        System.out.println("base:" + i);
    }
}

class Sub extends Base{
    Sub(){
        super.method(70);
    }
    {
        System.out.println("sub");
    }

    @Override
    public void method(int j) {
        System.out.println("sub:" + j);
    }
}
