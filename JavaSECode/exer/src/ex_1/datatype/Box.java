package ex_1.datatype;


/**
 * ClassName: Box
 * Package: ex_1.datatype
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/11 21:31
 * @Version 1.0
 */
public class Box {
    public static void main(String[] args) {
        Integer i1 = 10; // 自动装箱
        Integer i2 = new Integer(10); // 非自动装箱
        Integer i3 = Integer.valueOf(10); // 非自动装箱
        int i4 = new Integer(10); // 自动拆箱
        int i5 = i2.intValue(); // 非自动拆箱
        System.out.println("i1 = [" + i1 + "]");
        System.out.println("i2 = [" + i2 + "]");
        System.out.println("i3 = [" + i3 + "]");
        System.out.println("i4 = [" + i4 + "]");
        System.out.println("i5 = [" + i5 + "]");
        System.out.println("i1 == i2 is [" + (i1 == i2) + "]");
        System.out.println("i1 == i2 is [" + (i1.equals(i2)) + "]");
        System.out.println("i1 == i4 is [" + (i1 == i4) + "]"); // 自动拆箱

        Integer a = 127; //Integer.valueOf(127)
        Integer b = 127; //Integer.valueOf(127)
        System.out.println("\nInteger a = 127;\nInteger b = 127;\na == b ? {}" + (a == b));    // true

        Integer c = 128; //Integer.valueOf(128)
        Integer d = 128; //Integer.valueOf(128)
        System.out.println("\nInteger a = 128;\nInteger b = 128;\na == b ? {}" + (c == d));   //false
//设置-XX:AutoBoxCacheMax=1000再试试

        Integer e = 127; //Integer.valueOf(127)
        Integer e1 = Integer.valueOf(127);   //IntegerCache
        Integer f = new Integer(127); //new instance
        System.out.println("\nInteger a = 127;\nInteger b = 127;\na == b ? {}" + (e == f));   //false
        System.out.println("e equals f?" + e.equals(f));  //true

        Integer g = new Integer(127); //new instance
        Integer h = new Integer(127); //new instance
        System.out.println("\nInteger a = 127;\nInteger b = 127;\na == b ? {}" + (g == h));  //false
        System.out.println("g equals h?" + g.equals(h));  //true

        Integer i = 128; //unbox
        int j = 128;
        System.out.println("\nInteger a = 127;\nInteger b = 127;\na == b ? {}" + (i == j));   //true
        System.out.println("i equals j?" + i.equals(j));  //true


    }
}
