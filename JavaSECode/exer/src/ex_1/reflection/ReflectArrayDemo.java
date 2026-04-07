package ex_1.reflection;

import java.lang.reflect.Array;

/**
 * ClassName: ReflectArrayDemo
 * Package: ex_1.reflection
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/18 20:30
 * @Version 1.0
 */
public class ReflectArrayDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.String");
        Object array = Array.newInstance(cls, 25);
        Array.set(array, 0 ,"scala");
        Array.set(array, 1 ,"scala1");
        Array.set(array, 2 ,"scala2");
        Array.set(array, 3 ,"scala3");
        Array.set(array, 4 ,"scala4");
        System.out.println(Array.get(array, 3));
    }
}
