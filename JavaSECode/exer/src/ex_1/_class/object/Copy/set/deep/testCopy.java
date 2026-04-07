package ex_1._class.object.Copy.set.deep;

import java.util.ArrayList;

/**
 * ClassName: testCopy
 * Package: ex_1._class.object.Copy.set.deep
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/14 12:31
 * @Version 1.0
 */
public class testCopy {
    public static void main(String[] args) {
        ArrayList<People> peoples = new ArrayList<>();
        People people1 = new People();
        people1.holder = new People.Holder();
        peoples.add(people1);
        System.out.println("peoples[0]" + peoples.get(0));

        ArrayList<People> peoples1 = new ArrayList<>();
        for (People people : peoples) {
            peoples1.add((People) people.clone());
        }
        System.out.println(peoples1.get(0));
        System.out.println(peoples.get(0).equals(peoples1.get(0)));  //false

        peoples.get(0).holder.holderValue=100;
        System.out.println(peoples1.get(0).holder.holderValue);
    }
}
