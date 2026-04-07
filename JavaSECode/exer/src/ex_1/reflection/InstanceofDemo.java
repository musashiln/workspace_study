package ex_1.reflection;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: InstanceofDemo
 * Package: ex_1.reflection
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/18 19:44
 * @Version 1.0
 */
public class InstanceofDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        if(arrayList instanceof List) {
            System.out.println("ArrayList is List");
        }
        if(List.class.isInstance(arrayList)) {
            System.out.println("ArrayList is List");
        }
    }
}
