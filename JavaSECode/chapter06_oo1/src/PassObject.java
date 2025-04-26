/**
 * ClassName: PassObject
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/13 22:24
 * @Version 1.0
 */
public class PassObject {

    public static void main(String[] args) {
        PassObject passObject = new PassObject();
        Circle circle = new Circle();
        passObject.printAreas(circle,5);

        System.out.println("now radius is :" + circle.radius);
    }

    public void printAreas(Circle c,int time) {

        System.out.println("Radius\tArea");
        int i = 1;
        for(; i <= time; i++) {
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }
        c.radius = i;
    }
}
