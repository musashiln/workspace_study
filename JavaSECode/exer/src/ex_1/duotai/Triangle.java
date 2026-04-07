package ex_1.duotai;

/**
 * ClassName: Triangle
 * Package: ex_1.duotai
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/10 18:47
 * @Version 1.0
 */
public class Triangle extends Shape
{
    @Override
    public void draw()
    {
        System.out.println(
                "Triangle.draw()"
        );
    }
    @Override
    public void erase()
    {
        System.out.println(
                "Triangle.erase()"
        );
    }
}
