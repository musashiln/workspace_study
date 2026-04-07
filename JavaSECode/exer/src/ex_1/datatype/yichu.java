package ex_1.datatype;

import java.math.BigInteger;

/**
 * ClassName: yichu
 * Package: ex_1.datatype
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/13 10:10
 * @Version 1.0
 */
public class yichu {
    public static void main(String[] args) {
        long l = Long.MAX_VALUE;
        System.out.println(l + 1); // -9223372036854775808
        System.out.println(l + 1 == Long.MIN_VALUE); // true

//        try {
//            long l1 = Long.MAX_VALUE;
//            System.out.println(Math.addExact(l1, 1));
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

        BigInteger i = new BigInteger(String.valueOf(Long.MAX_VALUE));
        System.out.println(i.add(BigInteger.ONE).toString());

//        try {
//            long l2 = i.add(BigInteger.ONE).longValueExact();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

//        Person person = new Person();
//        person.show();

    }
}

class Person {
    public void show() {
        System.out.println(getClass());
    }
}