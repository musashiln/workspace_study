package ex_1.reflection.DynamicProxy;

/**
 * ClassName: UserServiceImpl
 * Package: ex_1.reflection.Proxy
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/18 17:06
 * @Version 1.0
 */
public class UserServiceImpl implements UserService{
    @Override
    public void addUser(String name) {
        System.out.println("添加用户:" + name);
    }
}
