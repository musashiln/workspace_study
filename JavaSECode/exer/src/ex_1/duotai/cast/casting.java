package ex_1.duotai.cast;

/**
 * ClassName: casting
 * Package: ex_1.duotai.cast
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/10 15:26
 * @Version 1.0
 */
public class casting {

    public static void main(String[] args) {
        Cat mycat = new Cat();
        Dog mydog = new Dog();
        doAnimaStuff(mycat);
        doAnimaStuff(mydog);
    }

    public static void doAnimaStuff(Animal animal) {
        animal.makeNoise();
        if (animal instanceof Dog) {
            Dog myDog = (Dog)animal;
            myDog.growl();
        }
    }
}

class Animal {

    String name;

    public void makeNoise(){
        System.out.println("noise");
    }
}

class Dog extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("woof!");
    }

    public void growl() {
        System.out.println("grrr!");
    }
}

class Cat extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("meow!");
    }
}
