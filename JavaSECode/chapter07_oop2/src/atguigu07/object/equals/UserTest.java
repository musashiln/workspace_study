package atguigu07.object.equals;

import java.io.File;
import java.util.Objects;

/**
 * ClassName: UserTest
 * Package: atguigu07.object.equals
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/24 22:01
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User(15, "tom");
        User u2 = new User(15, "tom");
        System.out.println(u1.equals(u2));

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        File file1 = new File("d:\\abc.txt");
        File file2 = new File("d:\\abc.txt");
        System.out.println(file1.equals(file2));


    }
}

class User{
    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public boolean equals(Object obj){
//        if(this == obj){
//            return true;
//        }
//
//        if(obj instanceof User) {
//            User user = (User) obj;
//            return this.age == ((User) obj).age && this.name.equals(((User) obj).name);
//        }
//
//        return false;
//    }

    //idea auto

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
