package ex_1._class.object.Copy.set.shallow;

import org.junit.Test;

import java.util.ArrayList;

/**
 * ClassName: testCopy
 * Package: ex_1._class.object.Copy.set
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/14 12:00
 * @Version 1.0
 */
public class testCopy {

    @Test
    public void test(){
        ArrayList<People> peoples = new ArrayList<>();
        People people1 = new People();
        people1.holder = new People.Holder();
        peoples.add(people1);
        System.out.println("peoples[0]=" + peoples.get(0));
        ArrayList<People> peoples1 = (ArrayList<People>) peoples.clone();
        System.out.println("peoples[0]=" + peoples1.get(0));
        System.out.println(peoples.equals(peoples1));
        System.out.println(peoples.get(0).equals(peoples1.get(0))); //true

        peoples.get(0).holder.holderValue=100;
        System.out.println(peoples1.get(0).holder.holderValue);

        People p1 = new People();
        p1.holder = new People.Holder();
        People p2 = (People) p1.clone();
        System.out.println("p1 == p2 " + p1.equals(p2));  //false

    }

}
