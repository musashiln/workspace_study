package com.atguigu04.block.exer;

/**
 * ClassName: User1
 * Package: com.atguigu04.block.exer
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/29 22:18
 * @Version 1.0
 */
public class User1 {
    private String userName;
    private String password;
    private long registRationTime;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistRationTime() {
        return registRationTime;
    }

    {
        System.out.println("新用户注册");
        registRationTime = System.currentTimeMillis();
    }
    public User1() {

        userName = System.currentTimeMillis() + "";
        password = "123456";
    }

    public User1(String userName, String password) {
        //System.out.println("新用户注册");
        //registRationTime = System.currentTimeMillis();
        this.userName = userName;
        this.password = password;
    }

    public String getInfo() {
        return "username:" + userName + ",password:" + password + ",registTime:" + registRationTime;

    }
}
