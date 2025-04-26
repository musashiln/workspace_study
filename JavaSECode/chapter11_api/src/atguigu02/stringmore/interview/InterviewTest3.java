package atguigu02.stringmore.interview;

/**
 * ClassName: InterviewTest3
 * Package: atguigu02.stringmore.interview
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/23 21:57
 * @Version 1.0
 */
public class InterviewTest3 {
    private static void change(String s, StringBuffer sb){
        s = "aaaa";
        sb.setLength(0);
        sb.append("aaaa");

    }

    public static void main(String[] args){
        String s = "bbbb";
        StringBuffer sb = new StringBuffer("bbbb");
        change(s,sb);
        System.out.println(s+sb);//bbbbaaaa
    }


}
