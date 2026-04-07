package ex_1._class.object.String;

/**
 * ClassName: StringTest
 * Package: ex_1._class.object.String
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/15 14:28
 * @Version 1.0
 */
public class StringTest {
    public static void main(String[] args) {
        String text = "Java Programming Java";

// 1. 查找子串位置（从前向后）
        int index1 = text.indexOf("Java"); // 0
        int index2 = text.indexOf("Java", 1); // 16
        System.out.println("index2:" + index2);

// 2. 查找子串位置（从后向前）
        int lastIndex = text.lastIndexOf("Java"); // 16

// 3. 查找字符位置
        int charIndex = text.indexOf('a'); // 1

// 4. 是否包含子串
        boolean contains = text.contains("Pro"); // true

// 5. 是否以...开头/结尾
        boolean starts = text.startsWith("Java"); // true
        boolean ends = text.endsWith("ing"); // false

        String str = "Hello,World,Java";

// 1. 截取子串
        String sub1 = str.substring(7); // "orld,Java"
        String sub2 = str.substring(7, 12); // "orld,"
        System.out.println("sub1:" + sub1);
        System.out.println("sub2:" + sub2);

    }
}
