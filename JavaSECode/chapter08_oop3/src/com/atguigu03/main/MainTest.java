package com.atguigu03.main;

/**
 * ClassName: MainTest
 * Package: com.atguigu03.main
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/29 21:00
 * @Version 1.0
 */

//控制台：java MainTest "tom" jerry 45
    //idea : run -> edit configuration ->
public class MainTest {
    public static void main(String[] args) {   //看作是程序的入口
        String[] arrs = new String[]{"aa", "bb", "cc"};
        Main.main(arrs);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

class Main {
    public static void main(String[] args) {   //看作是普通的静态方法
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
