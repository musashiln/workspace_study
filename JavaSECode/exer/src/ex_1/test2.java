package ex_1;

interface doA{
    void sayHello();
}
interface doB{
    void eat();
    //public void eat(){System.out.println("eating");}
}
class Cat2 implements doA,doB{

    @Override
    public void sayHello() {
        System.out.println("hello");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating");
    }
}
public class test2 {
    public static void main(String[] args) {
        Cat2 cat = new Cat2();
        cat.sayHello();
        cat.eat();
    }
}
