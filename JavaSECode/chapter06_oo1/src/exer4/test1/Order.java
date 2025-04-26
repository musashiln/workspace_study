package exer4.test1;

/**
 * ClassName: Order
 * Package: exer4.test1
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/17 22:15
 * @Version 1.0
 */
public class Order {

    //声明不同权限的属性
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    //声明不同权限子女的方法
    private void methodPrivate(){

    }

    void methodDefault(){

    }

    public void methodPublic(){

    }

    public void test(){
        orderDefault = 1;
        orderPrivate = 1;
        orderPublic = 1;

        methodDefault();
        methodPrivate();
        methodPublic();
    }

}
