package ex_1.reflection.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ClassName: logHandler
 * Package: ex_1.reflection.Proxy
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/18 17:07
 * @Version 1.0
 */
public class logHandler implements InvocationHandler {
    private Object target;

    public logHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("准备调用方法：" + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("方法调用完成：" + method.getName());
        return result;
    }
}
