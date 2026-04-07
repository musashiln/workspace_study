package ex_1.fanxing;

/**
 * ClassName: Person
 * Package: ex_1.fanxing
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/13 11:09
 * @Version 1.0
 */
public class Person<E> {
    E e;
    Person (E e) {
        this.e = e;
    }


    public void show() {
        System.out.println(e.getClass());
    }
}

class Test {
    public static void main(String[] args) {
        Person<String> stringPerson = new Person<String>("test");
        stringPerson.show();
    }
}
