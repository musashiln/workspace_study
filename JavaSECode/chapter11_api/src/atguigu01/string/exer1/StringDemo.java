package atguigu01.string.exer1;

import org.junit.Test;

/**
 * ClassName: atguigu01.string.exer1.StringDemo
 * Package: atguigu01.string.exer1
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/20 15:41
 * @Version 1.0
 */
public class StringDemo {
    @Test
    public void test1(){
        String s1 = "hello";  //字符串常量池
        String s2 = "hello";
        System.out.println(s1 == s2);
    }
    
    @Test
    public void test2(){
        String s1 = "hello";
        String s2 = "hello";

        s2 = "hi";
        System.out.println(s1);
    }
    
    @Test
    public void test3(){
        String s1 = "hello";
        String s2 = "hello";

        s2 += "world";
        System.out.println(s1);
        System.out.println(s2);
    }
    
    @Test
    public void test4(){
        String s1 = "hello";
        String s2 = "hello";

        String s3 = s2.replace("l","w");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        char[] arr = s1.toCharArray();

    }
}
