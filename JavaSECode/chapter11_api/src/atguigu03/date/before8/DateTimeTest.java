package atguigu03.date.before8;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: DateTimeTest
 * Package: atguigu03.date.before8
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/23 22:41
 * @Version 1.0
 */
public class DateTimeTest {
    @Test
    public void test1(){
        Date date1 = new Date();
        System.out.println(date1);

        long time = date1.getTime();
        System.out.println(time);

        Date date = new Date(time);
        System.out.println(date);
    }

    @Test
    public void test2(){
        java.sql.Date date1 = new java.sql.Date(1745499168526L);
        System.out.println(date1);
        System.out.println(date1.getTime());
    }

    @Test
    public void test3() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date date = new Date();
        String s = simpleDateFormat.format(date);
        System.out.println(s);

        Date date1 = simpleDateFormat.parse("2025/4/24 21:03");
        System.out.println(date1);
    }

    @Test
    public void test4() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z") ;
        sdf = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        //格式化:日期 --- >字符串
        Date date1 = new Date();
        String strDate = sdf.format(date1);
        System.out.println(strDate);

        //解析:字符串 --- > 日期
        Date date2 = sdf.parse( "2022-12-05 14:27:19");
        System.out.println(date2);

        //解析失败。因为参数的字符串不满足
//        Date date3 = sdf.parse("22-12-5 F42:21");
//        System.out.println(date2);
    }

    @Test
    public void test5(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        //set(int field, xx)
        calendar.set(Calendar.DAY_OF_MONTH,23);
        System. out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //add(int field, xx)
        calendar.add(Calendar.DAY_OF_MONTH,3);
        calendar.add(Calendar.DAY_OF_MONTH, -5);
        System. out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //getTime() : Calender -- > Date
        Date date = calendar.getTime();
        System.out.println(date);

        //setTime():使用指定Date重置Calendar
        Date date1 = new Date();
        calendar.setTime(date1) ;
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));



    }
}
