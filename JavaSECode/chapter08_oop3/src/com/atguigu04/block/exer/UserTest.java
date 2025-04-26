package com.atguigu04.block.exer;

/**
 * ClassName: UserTest
 * Package: com.atguigu04.block.exer
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/29 22:11
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getInfo());

        User user1 = new User("tom", "654321");
        System.out.println(user1.getInfo());

        User1 user11 = new User1();
        System.out.println(user11.getInfo());
    }
}
