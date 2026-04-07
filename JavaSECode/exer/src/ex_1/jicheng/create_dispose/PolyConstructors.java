package ex_1.jicheng.create_dispose;

/**
 * ClassName: PolyConstructors
 * Package: ex_1.jicheng.create_dispose
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/10 22:30
 * @Version 1.0
 */
// polymorphism/PolyConstructors.java
// Constructors and polymorphism
// don't produce what you might expect

/**
 * 1. 在所有事发生前，分配给对象的存储空间会被初始化为二进制 0。
 * 2. 如前所述调用基类构造器。此时调用重写后的 draw() 方法（是的，在调用 RoundGraph构造器之前调用），由步骤 1 可知，radius 的值为 0。
 * 3. 按声明顺序初始化成员。
 * 4. 最终调用派生类的构造器。
 *
 * 在基类的构造器中能安全调用的只有基类的 final 方法
 * （这也适用于可被看作是 final 的 private 方法）
 *
 * 使用继承表达行为的差异，使用属性表达状态的变化
 */
class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
