package ex_1._class.object.Copy.set.shallow;

/**
 * ClassName: People
 * Package: ex_1._class.object.Copy.set
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/14 11:52
 * @Version 1.0
 */
public class People implements Cloneable{
    int age;
    Holder holder;

    @Override
    protected Object clone() {
        People people = null;
        try {
            people = (People) super.clone();  //没有新建holder引用类型，浅拷贝
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //people.holder = (People.Holder) this.holder.clone();
        return people;
    }

    public static class Holder implements Cloneable {
        int holderValue;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}

