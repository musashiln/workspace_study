package atguigu01.string.exer1;

import org.junit.Test;

/**
 * ClassName: StringDemo1
 * Package: atguigu01.string.exer1
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/20 16:09
 * @Version 1.0
 */
public class StringDemo1 {
    @Test
    public void test1(){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");//创建2个对象,new string,byte[] value(string的一个属性)
        String s4 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);

        System.out.println(s1.equals(s2));
    }

    @Test
    public void test2(){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "Tom";
        p2.name = "Tom";
        p1.name = "Jerry";
        System.out.println(p2.name);
    }
    
    @Test
    public void test3(){
        String s1 = "hello";
        String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world";
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s3 == s7);
        System.out.println(s5 == s6);
        System.out.println(s5 == s7);
        System.out.println();
        String s8 = s5.intern();  //intern():返回的是字符串常量池中字面量的地址
        System.out.println(s3 == s8);
    }

    @Test
    public void test4(){
        final String s1 = "hello";
        final String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world";
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s5);  //true
        System.out.println(s3 == s6);  //true
        System.out.println(s3 == s7);  //true
    }
    
    @Test
    public void test5(){
        String s1 = "hello";
        String s2 = "world";

        String s3 = s1.concat(s2);
        String s4 = "hello".concat("world");
        String s5 = s1.concat("world");

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s4 == s5);
    }
}

class Person{
    String name;
}
