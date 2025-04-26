package atguigu03.date.jdk8;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: DateTimeTest
 * Package: atguigu03.date.jdk8
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/24 22:07
 * @Version 1.0
 */
public class DateTimeTest {
    /*
    可变性:像日期和时间这样的类应该是不可变的。
    偏移性:Date中的年份是从1900开始的,而月份都从0开始。
    格式化:格式化只对Date有用,Calendar则不行。
    此外,它们也不是线程安全的;不能处理闰秒等。
*
* */

    @Test
    public void test1(){
        String s1 = "hello";
        String s2 = s1.replace( 'l','w');//String的不可变性
        System.out.println(s1);//hello

        //体会Calendar的可变性
        Calendar calendar = Calendar.getInstance() ;
        calendar.set(Calendar.DAY_OF_MONTH,23);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void test2(){
        Date date = new Date( 2022,  11,  14);
        System.out.println(date);
    }

    @Test
    public void test3(){
        //now():
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //of():获取指定的日期、时间对应的实例
        LocalDate localDate1 = LocalDate.of( 2021, 5,  23);
        LocalDateTime localDateTime1 = LocalDateTime.of(2020,3,4,12,55);
        System.out.println(localDate1);
        System.out.println(localDateTime1);

        //getxxx()
        LocalDateTime localDateTime2 = LocalDateTime.now();
        System.out.println(localDateTime2.getDayOfMonth());
        //体现不可变性
        //withxxx
        LocalDateTime localDateTime3 = localDateTime2.withDayOfMonth(3);
        System.out.println(localDateTime3.getDayOfMonth());
        System.out.println(localDateTime2.getDayOfMonth());
        //plusXxx()
        LocalDateTime localDateTime4 = localDateTime2.plusDays(5);
        System. out.println(localDateTime2);//2022-12-05T15:50:21.864
        System. out.println(localDateTime4);//2022-12-10T15:50:21.864
    }

    @Test
    public void test4(){
        Instant instant = Instant.now();
        System.out.println(instant);//2022-12-05T07:56:27.327Z

        OffsetDateTime instant1 = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochMilli(24123123312L);
        System.out.println(instant2); //1970-10-07T04:52:03.312Z

        long milliTime = instant.toEpochMilli();
        System.out.println(milliTime) ;

        System.out.println(new Date().getTime());
    }

    @Test
    public void test5(){
        //自定义的格式。如:ofPattern("yyyy-MM-dd hh:mm:ss")
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //格式化:日期、时间 -- >字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String strDateTime = dateTimeFormatter.format (localDateTime);
        System.out.println(strDateTime);

        //解析:字符串 --- >日期、时间
        TemporalAccessor temporalAccessor = dateTimeFormatter.parse ( "2022-12-05 15:04:44");
        LocalDateTime localDateTime1 = LocalDateTime.from(temporalAccessor);
        System.out.println(localDateTime1);
    }
}
