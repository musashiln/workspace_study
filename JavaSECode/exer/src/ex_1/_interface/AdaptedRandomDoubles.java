package ex_1._interface;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * 原功能即RandomDoubles不能直接作为参数传递到scanner中，
 * 想要使用scanner，增加了新类实现了scanner参数中的Readable接口
 * 因为实现接口后能够向上转型，所以能够使用scanner
 *
 * <a href="https://chat.deepseek.com/share/l4nhff4kj6ubwq8yzh">...</a>
 */
public class AdaptedRandomDoubles implements RandomDoubles, Readable {
    private int count;

    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) {
        if (count-- == 0) {
            return -1;
        }
        String result = Double.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));
        while (s.hasNextDouble()) {
            System.out.print(s.nextDouble() + " ");
        }
    }
}

interface RandomDoubles {
    Random RAND = new Random(47);

    default double next() {
        return RAND.nextDouble();
    }

    static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles(){};
        for (int i = 0; i < 7; i++) {
            System.out.println(rd.next() + " ");
        }
    }
}

