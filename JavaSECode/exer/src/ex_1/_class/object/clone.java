package ex_1._class.object;

/**
 * ClassName: clone
 * Package: ex_1._class.object
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/13 14:28
 * @Version 1.0
 */
public class clone implements Cloneable{
    // 声明变量
    String name;
    int likes;

    public static void main(String[] args) {

        // 创建对象
        clone obj1 = new clone();

        // 初始化变量
        obj1.name = "Runoob";
        obj1.likes = 111;

        // 打印输出
        System.out.println(obj1.name); // Runoob
        System.out.println(obj1.likes); // 111

        try {

            // 创建 obj1 的拷贝
            clone obj2 = (clone) obj1.clone();

            // 使用 obj2 输出变量
            System.out.println(obj2.name); // Runoob
            System.out.println(obj2.likes); // 111
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
