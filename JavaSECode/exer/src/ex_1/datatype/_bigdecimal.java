package ex_1.datatype;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * ClassName: _bigdecimal
 * Package: ex_1.datatype
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/13 10:00
 * @Version 1.0
 */
public class _bigdecimal {
    private static void wrong1() {
        double num1 = 3.35;
        float num2 = 3.35f;
        System.out.println(String.format("%.1f", num1)); // 3.4
        System.out.println(String.format("%.1f", num2)); // 3.3
    }

    private static void wrong2() {
        double num1 = 3.35;
        float num2 = 3.35f;
        DecimalFormat format = new DecimalFormat("#.##");
        format.setRoundingMode(RoundingMode.DOWN);
        System.out.println(format.format(num1)); // 3.35
        format.setRoundingMode(RoundingMode.DOWN);
        System.out.println(format.format(num2)); // 3.34
    }

    private static void right() {
        BigDecimal num1 = new BigDecimal("3.35");
        BigDecimal num2 = num1.setScale(1, BigDecimal.ROUND_DOWN);
        System.out.println(num2); // 3.3
        BigDecimal num3 = num1.setScale(1, BigDecimal.ROUND_HALF_UP);
        System.out.println(num3); // 3.4
    }

    //BigDecimal 的 equals 方法的注释中说明了原因，equals 比较的是 BigDecimal 的 value 和 scale
    private static void wrong3() {
        System.out.println(new BigDecimal("1.0").equals(new BigDecimal("1")));
    }

    //BigDecimal.compareTo() 方法比较的是两个 BigDecimal 的数值大小，它会忽略精度和格式的差异
    private static void right1() {
        System.out.println(new BigDecimal("1.0").compareTo(new BigDecimal("1")) == 0);
    }

    public static void main(String[] args) {
        _bigdecimal.right();
        _bigdecimal.right1();
    }
}
