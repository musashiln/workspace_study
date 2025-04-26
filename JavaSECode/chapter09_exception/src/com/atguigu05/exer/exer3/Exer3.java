package com.atguigu05.exer.exer3;

/**
 * ClassName: Exer3
 * Package: com.atguigu05.exer.exer3
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/5 17:18
 * @Version 1.0
 */
public class Exer3 {
    public static void main(String[] args) {

        //1.调用有参构造器
        try {
            Person person = new Person("tom",-10);
            System.out.println(person);
        }catch (NoLifeValueException e){
            System.out.println(e.getMessage());
        }

        Person person = new Person("tom",-10);
        System.out.println(person);

        //2.调用空参构造器
        Person person1 = new Person();
        person1.setName("jerry");
        person1.setLifeValue(-10);

    }
}
