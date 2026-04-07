package ex_1.duotai;

/**
 * ClassName: Square
 * Package: ex_1.duotai.clockblock
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/10 18:45
 * @Version 1.0
 */
public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println(
                "Square.draw()"
        );
    }

    @Override
    public void erase() {
        System.out.println(
                "Square.erase()"
        );
    }

}
