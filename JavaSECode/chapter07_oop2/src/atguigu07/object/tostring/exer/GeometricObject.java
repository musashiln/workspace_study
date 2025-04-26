package atguigu07.object.tostring.exer;

/**
 * ClassName: GeometricObject
 * Package: atguigu07.object.tostring.exer
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/29 11:11
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject() {
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
