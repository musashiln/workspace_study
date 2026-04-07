package ex_1._interface;

import java.util.Random;

/**
 * ClassName: TestRandVals
 * Package: ex_1._interface
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/11 14:22
 * @Version 1.0
 */

/**
 * 这些字段不是接口的一部分，它们的值被存储在接口的静态存储区域中。
 */

interface RandVals {
    Random RAND = new Random(47);
    int RANDOM_INT = RAND.nextInt(10);
    long RANDOM_LONG = RAND.nextLong() * 10;
    float RANDOM_FLOAT = RAND.nextLong() * 10;
    double RANDOM_DOUBLE = RAND.nextDouble() * 10;
}

public class TestRandVals {
    public static void main(String[] args) {
        System.out.println(RandVals.RANDOM_INT);
        System.out.println(RandVals.RANDOM_LONG);
        System.out.println(RandVals.RANDOM_FLOAT);
        System.out.println(RandVals.RANDOM_DOUBLE);
    }
}
