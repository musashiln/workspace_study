package atguigu01_this;

/**
 * ClassName: UserTest
 * Package: atguigu01_this
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/18 22:01
 * @Version 1.0
 */
public class UserTest {

    private String name;
    private int age;

    public UserTest(){

    }


    public UserTest(String name){
        this();
        this.name = name;
    }
    public UserTest(String name, int age){
        this(name);
        this.age = age;

    }
}
