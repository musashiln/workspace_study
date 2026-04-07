package ex_1.duotai;

/**
 * ClassName: Circle
 * Package: ex_1.duotai
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/10 18:44
 * @Version 1.0
 */
public class Circle extends Shape
{
    @Override
    public void draw()
    {
        System.out.println(
                "Circle.draw()"
        );
    }
    @Override
    public void erase()
    {
        System.out.println(
                "Circle.erase()"
        );
    }
}
