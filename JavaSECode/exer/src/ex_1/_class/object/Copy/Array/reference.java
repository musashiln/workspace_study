package ex_1._class.object.Copy.Array;

import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName: reference
 * Package: ex_1._class.object.Copy.Array
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/14 11:28
 * @Version 1.0
 */
public class reference {
    @Test
    public void test(){
        People[] people = new People[5];
        people[0] = new People();
        People[] people1 = people;
        boolean first = people[0].equals(people1[0]);
        System.out.println(first);

        People[] people2 = new People[5];
        people2[0] = new People();
        People[] people3 = people2.clone();
        boolean second = people2[0].equals(people3[0]);
        System.out.println(second);

        People[] people4 = new People[5];
        people4[0] = new People();
        People[] people5 = Arrays.copyOf(people4,people4.length);
        boolean third = people4[0].equals(people5[0]);
        System.out.println(third);
    }
}

class People implements Cloneable {
    int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
