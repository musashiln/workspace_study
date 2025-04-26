package atguigu07.object;

/**
 * ClassName: FinalizeTest
 * Package: atguigu07.object
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/24 20:58
 * @Version 1.0
 */
public class FinalizeTest {
    public static void main(String[] args) {
        Person p = new Person("Peter", 12);
        System.out.println(p);
        p = null;
        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
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
    protected void finalize() throws Throwable {
        System.out.println("对象被释放--->" + this);
    }
}
