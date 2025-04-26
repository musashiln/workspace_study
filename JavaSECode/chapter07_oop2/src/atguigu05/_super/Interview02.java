package atguigu05._super;

/**
 * ClassName: Interview02
 * Package: atguigu05._super
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/23 23:00
 * @Version 1.0
 */
public class Interview02 {
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        System.out.println(f.getInfo());  //atguigu
        System.out.println(s.getInfo());  //atguigu
        s.test();  //atguigu   atguigu
        System.out.println("-------------------");
        s.setInfo("大硅谷");
        System.out.println(f.getInfo());  //atguigu
        System.out.println(s.getInfo());  //daguigu
        s.test();  //daguigu //daguigu
    }
}

class Father{
    private String info = "atguigu";

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

class Son extends Father{
    private String info = "尚硅谷";

    public void test(){
        System.out.println(this.getInfo());
        System.out.println(super.getInfo());
    }
}