package ex_1.abstract_interface;

/**
 * ClassName: staticmethod
 * Package: ex_1.abstract_interface
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/11 11:12
 * @Version 1.0
 */
public class staticmethod {
}

/**
 * 创建Operations的不同方式：
 * 一个外部类(Bing)，一个匿名类，一个方法引用和 lambda 表达式
 */

interface Operations {
    void execute();

    static void runOps(Operations... ops) {
        for (Operations op: ops) {
            op.execute();
        }
    }

    static void show(String msg) {
        System.out.println(msg);
    }
}

class Bing implements Operations {
    @Override
    public void execute() {
        Operations.show("Bing");
    }
}

class Crack implements Operations {
    @Override
    public void execute() {
        Operations.show("Crack");
    }
}

class Twist implements Operations {
    @Override
    public void execute() {
        Operations.show("Twist");
    }
}

class Machine {
    public static void main(String[] args) {
        Operations.runOps(
                new Bing(), new Crack(), new Twist());
    }
}

