package atguigu01.string.exer1;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * ClassName: StringMethodTest
 * Package: atguigu01.string.exer1
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/20 17:23
 * @Version 1.0
 */
public class StringMethodTest {
    /**
     * String构造器
     */
    @Test
    public void test1(){
        String s1 = new String();
        String s2 = new String("");

        String s3 = new String(new char[]{'a','b','c'});
        System.out.println(s3);
    }

    /**
     * 1.String 与基本数据类型、包装类之间的转换
     * 2.String与char[]之间的转换
     * 3.String与byte[]之前的转换
     */
    @Test
    public void test2(){
        int num = 10;
        //基本数据类型 --> String
        String s1 = num + "";
        String s2 = String.valueOf(num);

        //String --> 基本数据类型
        String s3 = "123";
        int i1 = Integer.parseInt(s3);
    }

    @Test
    public void test3(){
        String str = "hello";
        //String -->char[]
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //char[] --> String
        String str1 = new String(arr);
        System.out.println(str1);
    }

    /**
     * String byte[]之间的转换
     * 编码与解码:
     * 编码:String --- > 字节或字节数组
     * 解码:字节或字节数组---- > String
     * 要求:解码时使用的字符集必须与编码时使用的字符集一致!不一致,就会乱码。
     *
     */
    @Test
    public void test4() throws UnsupportedEncodingException {
        String str = new String("abc中国");

        //String --> byte[]:调用String的getBytes[]
        byte[] arr = str.getBytes(); //使用默认的字符集
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

        byte[] arr1 = str.getBytes("gbk");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        //byte[] ---> String
        String str1 = new String(arr);
        System.out.println(str1);
        String str2 = new String(arr, "utf-8");
        System.out.println(str2);
        String str3 = new String(arr, "gbk");
        System.out.println(str3);
        String str4 = new String(arr1, "gbk");
        System.out.println(str4);

    }

    @Test
    public void test5(){

    }
}
