package ex_1.datatype;

/**
 * ClassName: equals
 * Package: ex_1.datatype
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/13 9:24
 * @Version 1.0
 */
public class equals {

    class Point {
        private final int x;
        private final int y;
        private final String desc;

        Point(int x, int y, String desc) {
            this.x = x;
            this.y = y;
            this.desc = desc;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point that = (Point) o;
            return x == that.x && y == that.y;
        }
    }


}

