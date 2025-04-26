package com.atguigu05.field.exer;

/**
 * ClassName: LeafTest
 * Package: com.atguigu05.field.exer
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/30 13:41
 * @Version 1.0
 */
class Root {
    static {
        System.out.println("root的静态初始化块");
    }
    {
        System.out.println("root的普通初始化块");
    }
    public Root() {
        System.out.println("root的无参数的构造器");
    }
}
class Mid extends Root{
    static {
        System.out.println("mid的静态初始化块");
    }
    {
        System.out.println("mid的普通初始化块");
    }
    public Mid() {
        System.out.println("mid的无参数的构造器");
    }
    public Mid(String msg){
        this();
        System.out.println("mid的带参数构造器，其参数值:" + msg);
    }
}
class Leaf extends Mid{
    static {
        System.out.println("leaf的静态初始化块");
    }
    {
        System.out.println("leaf的普通初始化块");
    }
    public Leaf() {
        super("atguigu");
        System.out.println("leaf的构造器");
    }
}
public class LeafTest {
    public static void main(String[] args) {
        new Leaf();

    }
}
