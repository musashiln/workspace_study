package atguigu08.constructor;

/**
 * ClassName: StudentTest
 * Package: atguigu08.constructor
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/18 8:10
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student("a",30,"aaa");
        System.out.println(student1.getInfo());

        Student student2 = new Student("a",30,"aaa", "bbb");
        System.out.println(student2.getInfo());

    }
}
