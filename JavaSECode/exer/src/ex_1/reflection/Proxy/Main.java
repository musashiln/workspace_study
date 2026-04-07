package ex_1.reflection.Proxy;/**
         * ClassName: Main
         * Package: ex_1.reflection.Proxy
         * Description:
         * @Author gxy
         * @Create 2025/12/18 20:40
         * @Version 1.0
         */
public class Main {
}
abstract class Subject {
    public abstract void Request();
}
class RealSubject extends Subject {
    @Override
    public void Request() {
        System.out.println("真实的请求");
    }
}
class Proxy extends Subject {
    private RealSubject real;

    @Override
    public void Request() {
        if (null == real) {
            real = new RealSubject();
        }
        real.Request();
    }
}
