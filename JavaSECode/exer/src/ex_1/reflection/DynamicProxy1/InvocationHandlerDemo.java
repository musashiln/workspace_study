package ex_1.reflection.DynamicProxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ClassName: InvocationHandlerDemo
 * Package: ex_1.reflection.DynamicProxy1
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/18 21:20
 * @Version 1.0
 */
public class InvocationHandlerDemo implements InvocationHandler {

    // 这个就是我们要代理的真实对象
    private Object subject;

    // 构造方法，给我们要代理的真实对象赋初值
    public InvocationHandlerDemo(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在代理真实对象前我们可以添加一些自己的操作
        System.out.println("before method");
        System.out.println("call method" + method);
        // 当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        Object obj = method.invoke(subject, args);
        // 在代理真实对象后我们也可以添加一些自己的操作
        System.out.println("after method");
        System.out.println();
        return obj;
    }
}
