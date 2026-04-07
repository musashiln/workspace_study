package ex_1.datatype;

/**
 * ClassName: _string
 * Package: ex_1.datatype
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/11 22:08
 * @Version 1.0
 */

/**
 * 在 JVM 中，当代码中出现双引号形式创建字符串对象时，JVM 会先对这个字符串进行检查，
 * 如果字符串常量池中存在相同内容的字符串对象的引用，则将这个引用返回；
 * 否则，创建新的字符串对象，然后将这个引用放入字符串常量池，并返回该引用。
 * 这种机制，就是字符串驻留或池化。
 */
public class _string {
    public static void main(String[] args) {
        String a = "1";
        String b = "1";
        System.out.println(a == b); //true
        System.out.println(a.equals(b)); //true

        String c = new String("2");
        String d = new String("2");
        System.out.println(c == d); //false

        String e = new String("3").intern();
        String f = new String("3").intern();
        System.out.println(e == f);; //true

        String g = new String("4");
        String h = new String("4");
        System.out.println(g.equals(h)); //true

//        //-XX:+PrintStringTableStatistics
////-XX:StringTableSize=10000000
//        List<String> list = new ArrayList<>();
//        long begin = System.currentTimeMillis();
//        list = IntStream.rangeClosed(1, 10000000)
//                .mapToObj(i -> String.valueOf(i).intern())
//                .collect(Collectors.toList());
//        System.out.println("size:" + list.size());
//        System.out.println("time:" + (System.currentTimeMillis() - begin));


    }
}
