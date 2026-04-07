package ex_1.abstract_interface;

/**
 * ClassName: AbstractAccess
 * Package: ex_1.abstract_interface
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/11 9:47
 * @Version 1.0
 */
public abstract class AbstractAccess {
    private void m1() {}

    //private abstract void m1a(); // illegal

    protected void m2() {}

    protected abstract void m2a();

    void m3() {}

    abstract void m3a();

    public void m4() {}

    public abstract void m4a();
}
