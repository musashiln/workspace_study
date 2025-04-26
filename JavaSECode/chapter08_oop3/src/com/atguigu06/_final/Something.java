package com.atguigu06._final;

/**
 * ClassName: Something
 * Package: com.atguigu06._final
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/30 15:53
 * @Version 1.0
 */
public class Something {
    public static void main(String[] args) {
        Other o = new Other();
        new Something().addOne(o);
    }
    public void addOne(final Other other) {
//        other = new Other();
        other.i++;
    }
}

class Other {
    public int i;
}
