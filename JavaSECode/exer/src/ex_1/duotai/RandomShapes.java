package ex_1.duotai;

/**
 * ClassName: RandomShapes
 * Package: ex_1.duotai
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/10 18:29
 * @Version 1.0
 */
// polymorphism/shape/RandomShapes.java
// A "factory" that randomly creates shapes

import java.util.Random;

public class RandomShapes {
    private Random rand = new Random(47);

    public Shape get() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }

    public Shape[] array(int sz) {
        Shape[] shapes = new Shape[sz];
        // Fill up the array with shapes:
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = get();
        }
        return shapes;
    }


}

class Shapes {
    public static void main(String[] args) {
        RandomShapes gen = new RandomShapes();
        for (Shape shape: gen.array(9)) {
            shape.draw();
        }
    }
}

