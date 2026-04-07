package ex_1._interface;

/**
 * ClassName: duojicheng1
 * Package: ex_1.abstract_interface
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/11 12:57
 * @Version 1.0
 */

/**
 * 如果同时继承了抽象类和接口，其中拥有同名方法，那么可以不在类中实现接口
 * 用的是抽象类中方法
 */
public class duojicheng1 {
}

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight(){
        System.out.println("fight_extend" + getClass().getSimpleName());
    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
    public void swim() {}

    public void fly() {}
}

class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h); // Treat it as a CanFight
        u(h); // Treat it as a CanSwim
        v(h); // Treat it as a CanFly
        w(h); // Treat it as an ActionCharacter
    }
}
