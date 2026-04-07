package ex_1.Annotation;

/**
 * ClassName: Child
 * Package: ex_1.Annotation
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/19 13:21
 * @Version 1.0
 */
//@Description("i am class annotation")
public class Child extends Person {
    @Override
//    @Description("i am method annotation")
    public String name() {
        return null;
    }

    @Override
    public int age() {
        return 0;
    }

    @Override
    public void sing() {

    }
}
