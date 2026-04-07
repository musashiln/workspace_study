package ex_1._class.object.hashcode;

import java.util.Objects;

/**
 * ClassName: Employee
 * Package: ex_1._class.object.hashcode
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/13 17:54
 * @Version 1.0
 */
public class Employee {
    private String name;
    private int salary;
    private String hireDay;

//    @Override
//    public boolean equals(Object other) {
//        if (this == other) return true;
//        if (other == null) return false;
//        if (getClass() != other.getClass()) return false;
//        Employee employee = (Employee) other;
//        return Objects.equals(name,employee.name)
//                && salary == employee.salary
//                && Objects.equals(hireDay, employee.hireDay);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(hireDay, employee.hireDay);
    }
}
