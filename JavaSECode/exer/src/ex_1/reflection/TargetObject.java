package ex_1.reflection;

/**
 * ClassName: TargetObject
 * Package: ex_1.reflection
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/18 14:45
 * @Version 1.0
 */
public class TargetObject {
    private String value;

    public TargetObject() {
        value = "123456";
    }

    public TargetObject(String value) {
        this.value = value;
    }

    public void publicMethod(String s) {
        System.out.println("i love" + s);
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }
}
