package ex_1._class.object.String;

/**
 * ClassName: StringConcat
 * Package: ex_1._class.object.String
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/15 17:33
 * @Version 1.0
 */
public class StringConcat {
    public static String concat(String str) {
        return str + "aa" + "bb";
    }

    public static void main(String[] args) {
        System.out.println(StringConcat.concat("ccc"));
    }
}
