package com.atguigu01._static.apply;

/**
 * ClassName: CircleTest
 * Package: com.atguigu01._static.apply
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/29 19:03
 * @Version 1.0
 */
public class CircleTest {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle();
        System.out.println(c2);

        Circle c3 = new Circle();
        System.out.println(c3);

        Circle c4 = new Circle();
        System.out.println(c4);

        System.out.println(Circle.total);
    }


}

class Circle {
    double radius;
    int id;
    static int total;
    private static int init = 1001;

    public Circle() {
        this.id = init;
        init++;
        total++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }
}
