package atguigu04.compare.comparable;

import atguigu04.compare.Product;
import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName: ComparableTest
 * Package: atguigu04.compare.comparable
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/25 20:43
 * @Version 1.0
 */
public class ComparableTest {
    @Test
    public void test1(){
        String[] arr = new String[]{"Tom", "Jerry", "Tony", "Rose", "Jack", "Lucy"};

        Arrays.sort(arr);

        //排序后,遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void test2(){
        Product[] arr = new Product[5];
        arr[0] = new Product( "HuaweiMate50pro",  6299);
        arr[1] = new Product( "Xiaomi13pro", 4999);
        arr[2] = new Product("VivoX90pro", 5999);
        arr[3] = new Product(  "Iphone14ProMax",9999);
        arr[4] = new Product( "HonorMagic4", 6299);

        Arrays.sort(arr);
        //排序后,遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void test3() {
        Product p1 = new Product("HuaweiMate50pro", 6299);
        Product p2 = new Product("VivoX90pro", 5999);
        int comapre = p1.compareTo(p2);
        if (comapre > 0) {
            System.out.println("p1*");
        } else if (comapre < 0) {
            System.out.println("p2*");
        } else {
            System.out.println("p1f0p2-#¥*");
        }
    }
}
