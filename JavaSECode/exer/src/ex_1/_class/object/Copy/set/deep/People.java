package ex_1._class.object.Copy.set.deep;

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
        try {
            People people = (People) super.clone();
            people.holder = (Holder) this.holder.clone();
            return people;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static class Holder implements Cloneable {
        int holderValue;

        @Override
        protected Object clone() {
            try {
                return super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}

