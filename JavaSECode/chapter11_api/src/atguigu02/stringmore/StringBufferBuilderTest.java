package atguigu02.stringmore;

import org.junit.Test;

/**
 * ClassName: StringBufferBuilderTest
 * Package: atguigu02.stringmore
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/23 21:08
 * @Version 1.0
 */
public class StringBufferBuilderTest {
    /**
     * k
     *
     * *(1)StringBuffer append(xx):提供了很多的append()方法,用于进行字符串追加的方式拼接
     * (2)StringBuffer delete(int start, int end):删除[start,end)之间字符
     * (3)StringBuffer deleteCharAt(int index):删除[index]位置字符
     * (4) StringBuffer replace(int start, int end, String str):替换[start,end)范围的字符序列为str
     * (5)void setCharAt(int index,char c):替换[index]位置字符
     * (6)char charAt(int index):查找指定index位置上的字符
     * (7) StringBuffer insert(int index, xx):在[index]位置插入xx
     * (8)int Length():返回存储的字符数据的长度
     * (9) StringBuffer reverse():
     *
     */

    @Test
    public void test1(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc").append("123").append("def");
        System.out.println(stringBuilder);
    }

    @Test
    public void test2() {
        StringBuilder sBuilder = new StringBuilder("hello");
        sBuilder.insert(2, 1);
        sBuilder.insert(2, "abc");
        System.out.println(sBuilder);

        StringBuilder sBuilder1 = sBuilder.reverse();

        System.out.println(sBuilder);
        System.out.println(sBuilder1);

        System. out.println(sBuilder == sBuilder1) ;

        System.out.println(sBuilder.length());
    }

    @Test
    public void test3(){
        StringBuilder sBuilder = new StringBuilder("hello");
        sBuilder. setLength(2);

        System.out.println(sBuilder);

        sBuilder.append("c");
        System.out.println(sBuilder);

        sBuilder.setLength(10);
        System.out.println(sBuilder);
        System.out.println(sBuilder.charAt(6) == 0); //true

    }
}
