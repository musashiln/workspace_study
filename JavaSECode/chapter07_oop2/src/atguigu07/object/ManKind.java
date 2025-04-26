package atguigu07.object;

/**
 * ClassName: ManKind
 * Package: atguigu03_extends.exer1
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/20 7:55
 * @Version 1.0
 */
public class ManKind implements Cloneable{
    private int sex;
    private int salary;

    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
