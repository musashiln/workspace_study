package ex_1._class.object.equals;

/**
 * ClassName: Test
 * Package: ex_1._class.object.equals
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/13 17:07
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("aa", 1, "aa");
        Employee employee = new Employee("aa", 1, "aa");
        Employee employee1 = new Employee("bb", 2, "bb");

        System.out.println(employee.equals(manager));
        System.out.println(manager.getClass());
        System.out.println(employee.getClass());

        //manager = null;
        //System.out.println(Objects.equals(manager, manager)); //true

        System.out.println("the current position is " + manager);
    }
}
