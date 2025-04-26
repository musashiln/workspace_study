package atguigu01.string.exer1;

/**
 * ClassName: StringTest
 * Package: atguigu01.string.exer1
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/20 20:01
 * @Version 1.0
 */
public class StringTest {

    String str = "good";

    char[] ch = { 't', 'e', 's', 't' };


    public void change(String str, char ch[],Person1 person1,Person1 person2) {
        person1.name = "abc";
        person2 = person1;
        str = "test ok";
        System.out.println(str);
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest ex = new StringTest();
        Person1 person1 = new Person1();
        Person1 person2 = new Person1();
        ex.change(ex.str, ex.ch, person1,person2);
        System.out.println(ex.str); //good
        System.out.println(ex.ch); //best
        System.out.println(person1.name);
        System.out.println(person2.name);
    }
}

class Person1{
    String name;
}
