package ex_1._static;

/**
 * ClassName: StaticVar
 * Package: ex_1._static
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/11 18:47
 * @Version 1.0
 */
public class StaticVar {
    private static String name="java的架构师技术栈";
    public static void main(String[] args) {
        //直接通过类名
        String name1 = StaticVar.name;
        System.out.println(name1);

        float f = 25.5f;
        int x = (int)f;
        System.out.println("x = " + x);
    }
}
