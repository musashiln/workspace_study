package ex_1.io.serialize;

import java.io.Serializable;

/**
 * ClassName: Person
 * Package: ex_1.io.serialize
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/14 9:50
 * @Version 1.0
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    private transient String password;

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
