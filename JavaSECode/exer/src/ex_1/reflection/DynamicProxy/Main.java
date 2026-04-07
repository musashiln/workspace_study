package ex_1.reflection.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * ClassName: Main
 * Package: ex_1.reflection.Proxy
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/18 17:17
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        InvocationHandler handler = new logHandler(userService);
        UserService proxy = (UserService) Proxy.newProxyInstance(
                userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                handler);
        proxy.addUser("张三");

    }
}
