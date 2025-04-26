package atguigu03.date.exer1;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: Exer01
 * Package: atguigu03.date.exer1
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/24 21:48
 * @Version 1.0
 */
public class Exer01 {
    @Test
    public void test1(){
        Date date1 = new Date();
//错误的:
        //java.sql.Date date2 = (java.sql.Date) date1;
        //System.out.println(date2);

//正确的:
        java.sql.Date date2 = new java.sql.Date(date1.getTime());
        System.out.println(date2);
    }

    @Test
    public void test2() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String pattern = "2022-09-08";
        Date date = simpleDateFormat.parse(pattern);
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        System.out.println(date1);
    }
}
