package ex_1.duotai.clockblock;

/**
 * ClassName: wangxiaosi
 * Package: ex_1.duotai
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/10 10:23
 * @Version 1.0
 */

/**
 * 创建子类对象时，会先去调用父类的构造方法，而父类构造方法中又调用了被子类覆盖的多态方法，
 * 由于父类并不清楚子类对象中的字段值是什么，于是把 int 类型的属性暂时初始化为 0，
 * 然后再调用子类的构造方法（子类构造方法知道王小二的年龄是 4）。
 */
public class Wangxiaosan extends Wangsan {
    private int age = 3;
    public Wangxiaosan(int age) {
        this.age = age;
        System.out.println("王小三的年龄：" + this.age);
    }

    public void write() { // 子类覆盖父类方法
        System.out.println("我小三上幼儿园的年龄是：" + this.age);
    }

    public static void main(String[] args) {
        new Wangxiaosan(4);
//      上幼儿园之前
//      我小三上幼儿园的年龄是：0
//      上幼儿园之后
//      王小三的年龄：4
    }
}

class Wangsan {
    Wangsan () {
        System.out.println("上幼儿园之前");
        write();
        System.out.println("上幼儿园之后");
    }
    public void write() {
        System.out.println("老子上幼儿园的年龄是3岁半");
    }
}
