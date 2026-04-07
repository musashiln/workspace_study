package ex_1._class.object.equals;

import java.util.Objects;

public class Manager extends Employee {
    private int bonus;

    public Manager(String name, int salary, String hireDay) {
        super(name, salary, hireDay);
    }

    public Manager(String name, int salary, String hireDay, int bonus) {
        super(name, salary, hireDay);
        this.bonus = bonus;
    }

    /**
     * 子类中执行父类的equals，如果检测失败一定不相等
     * @param otherObject
     * @return
     */
    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        Manager other = (Manager) otherObject;
        return bonus == other.bonus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus);
    }

    @Override
    public String toString() {
        return super.toString() +
                "bonus=" + bonus +
                '}';
    }
}
