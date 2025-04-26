/**
 * ClassName: Person
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/17 21:38
 * @Version 1.0
 */
public class Person {

    private int age;

    public void setAge(int a){
        if(a >= 0 && a <= 130){
            age = a;
        }else {
            System.out.println("illegal");
        }
    }

    public int getAge() {
        return age;
    }
}
