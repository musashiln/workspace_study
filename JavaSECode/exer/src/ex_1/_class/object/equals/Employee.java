package ex_1._class.object.equals;

import java.util.Objects;

/**
 * ClassName: Employee
 * Package: ex_1._class.object.equals
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/13 16:52
 * @Version 1.0
 */
public class Employee {

    public Employee(String name, int salary, String hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getHireDay() {
        return hireDay;
    }

    public void setHireDay(String hireDay) {
        this.hireDay = hireDay;
    }

    private String name;
    private int salary;
    private String hireDay;

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        /**
         * 取决于所有的子类是否都有相同的相等性语义,
         * 即所有的子类都能用后面的return定义相等
         */
        //if (getClass() != otherObject.getClass()) return false;
        if (!(otherObject instanceof Employee)) return false;
        Employee other = (Employee) otherObject;

        /**
         * 提示:为了防备name或hireDay可能为null的情况,需要使用Objects.equals方法。如
         * 果两个参数都为null,Objects.equals(a,b)调用将返回true;如果其中一个参数为null,
         * 则返回false;否则,如果两个参数都不为null,则调用a.equals(b)。
         */
        return Objects.equals(name, other.name)
                && salary == other.salary
                && Objects.equals(hireDay, other.hireDay);

//        return name.equals(other.name)
//                && salary == other.salary
//                && hireDay.equals(other.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay='" + hireDay + '\'' +
                '}';
    }
}

