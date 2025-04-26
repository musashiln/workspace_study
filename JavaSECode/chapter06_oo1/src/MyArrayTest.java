/**
 * ClassName: MyArrayTest
 * Package: com.exce.one
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/13 23:42
 * @Version 1.0
 */
public class MyArrayTest {
    public static void main(String[] args) {

        MyArrays arrs = new MyArrays();
        int[] arr = new int[]{34,56,223,2,56,24,56,67,778,45};

        System.out.println("max value = " + arrs.getMax(arr));

        System.out.println("min value = " + arrs.getMin(arr));

        System.out.println("avg value = " + arrs.getAvg(arr));

        arrs.print(arr);

        arrs.sort(arr);

        arrs.print(arr);
    }
}
