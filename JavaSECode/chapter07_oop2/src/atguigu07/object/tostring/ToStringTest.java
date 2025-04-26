package atguigu07.object.tostring;

import java.io.File;
import java.util.Date;

/**
 * ClassName: ToStringTest
 * Package: atguigu07.object.tostring
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/25 7:50
 * @Version 1.0
 */
public class ToStringTest {
    public static void main(String[] args) {
        User user = new User("TOM", 12);
        System.out.println(user.toString());
        System.out.println(user);

        String s1 = new String("abc");
        System.out.println(s1.toString());

        File file = new File("d:\\abc.txt");
        System.out.println(file);

        Date date = new Date();
        System.out.println(date);
    }
}

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "user{ name = " + name + " age = " + age + " }";
    }

}
