package atguigu03.date.exer2;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: Exer02
 * Package: atguigu03.date.exer2
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/24 23:10
 * @Version 1.0
 */
public class Exer02 {
    /**
     * 使用Calendar获取当前时间,把这个时间设置为你的生日,再获取你的百天(出生后100天)日期。
     */
    @Test
    public void test1(){
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        System.out.println(time);

        calendar.add(Calendar.DAY_OF_YEAR,100);
        Date time1 = calendar.getTime();
        System.out.println(time1);

        //System.out.println(calendar);
    }

    /**
     * 使用LocalDateTime获取当前时间,把这个时间设置为你的生日,再获取你的百天(出生后100天)日期。
     */
    @Test
    public void test2(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = localDateTime.plusDays(100);
        System. out.println ( "100: " + localDateTime1);
    }
}
