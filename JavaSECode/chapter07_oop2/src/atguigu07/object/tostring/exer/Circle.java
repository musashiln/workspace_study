package atguigu07.object.tostring.exer;

/**
 * ClassName: Circle
 * Package: atguigu07.object.tostring.exer
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/29 11:15
 * @Version 1.0
 */
public class Circle extends GeometricObject{

    private double radius;

    public Circle() {
        //super();
        //this.color = "white";
        //this.weight = 1.0;
        this.radius = 1.0;
    }

    public Circle(double radius) {
        //super();
        //this.color = "white";
        //this.weight = 1.0;
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return 3.14 * radius * radius;
    }

    public boolean equals(Object object) {
        if(object == this) {
            return true;
        }

        if(object instanceof Circle) {
            Circle circle = (Circle) object;
            return this.radius == circle.radius ;
        }

        return false;
    }

    public String toString() {
        return "Circle[radius = " + this.radius + "]";
    }
}
