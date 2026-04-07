package ex_1._static;

/**
 * ClassName: StaticTest
 * Package: ex_1._static
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/11 18:42
 * @Version 1.0
 */
public class StaticTest {
    //static关键字修饰内部类
    public static class InnerClass{
        InnerClass(){
            System.out.println("============= 静态内部类=============");
        }
        public void InnerMethod() {
            System.out.println("============= 静态内部方法=============");
        }
    }
    public static void main(String[] args) {
        //直接通过StaticTest类名访问静态内部类InnerClass
        InnerClass inner=new StaticTest.InnerClass();
        //静态内部类可以和普通类一样使用
        inner.InnerMethod();
    }
}
