package atguigu05.other;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

/**
 * ClassName: OtherApiTest
 * Package: atguigu05.other
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/26 11:12
 * @Version 1.0
 */
public class OtherApiTest {
    @Test
    public void test1(){
        String javaVersion = System.getProperty("java.version");
        System.out.println("javamversion:" + javaVersion);

        String javaHome = System.getProperty("java.home");
        System.out.println("javamhome:" + javaHome);

        String osName = System.getProperty("os.name");
        System.out.println("os)name:" + osName);

        String osVersion = System.getProperty("os.version");
        System.out.println("os)version:" + osVersion);

        String userName = System.getProperty("user.name");
        System.out.println("usermname:" + userName);

        String userHome = System.getProperty("user.home");
        System.out.println("userhome:" + userHome);

        String userDir = System.getProperty("user.dir");
        System. out.println("userdir:" + userDir);
    }

    @Test
    public void test2(){
        Runtime runtime = Runtime.getRuntime();
        long initialMemory =runtime.totalMemory();//获取虚拟机初始化时堆内存总量
        long maxMemory= runtime.maxMemory();//获取虚拟机最大堆内存总量
        String str = "";
        //模拟占用内存
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        long freeMemory = runtime.freeMemory();//获取空闲堆内存总量

        System.out.println("总内存:" + initialMemory / 1024 / 1024 * 64 + "MB");
        System.out.println("总内存:" + maxMemory / 1024 / 1024 * 4 + "MB");
        System.out.println("空闲内存:" + freeMemory / 1024 / 1024 + "MB");
        System.out.println("已用内存:" + (initialMemory - freeMemory) / 1024 / 1024 + "MB");
    }

    @Test
    public void test3(){
        System.out.println(Math.round(12.3));//12
        System.out.println(Math.round(12.5));//13
        System.out.println(Math.round(-12.3));//-12
        System.out.println(Math.round(-12.6));//-13
        System.out.println(Math.round(-12.5));//-12
    }

    @Test
    public void test4(){
        //long bigNum = 123456789123456789123456789L;

        BigInteger b1 = new BigInteger( "12345678912345678912345678");
        BigInteger b2 = new BigInteger( "78923456789123456789123456789");

//System.out.println("和:"+(b1+b2));//错误的,无法直接使用+进行求和

        System.out.println("add:"+b1.add(b2));
        System. out.println("sub: "+ b1.subtract(b2));
        System.out.println("mult:"+ b1.multiply(b2));
        System.out.println("divide:" + b2.divide(b1));
        System.out.println("余:" + b2.remainder(b1));
    }

    @Test
    public void test5(){
        BigInteger bi = new BigInteger( "12433241123");
        BigDecimal bd = new BigDecimal( "12435.351");
        BigDecimal bd2 = new BigDecimal( "11");
        System.out.println(bi);
// System.out.println(bd.divide(bd2));
        System.out.println(bd.divide(bd2, BigDecimal.ROUND_HALF_UP));
        System.out.println(bd.divide(bd2, 15, BigDecimal.ROUND_HALF_UP));
    }

    @Test
    public void test6(){
        Random random = new Random();
        int i = random.nextInt();
        System.out.println(i);

        int j = random.nextInt(10); //随机获取[0,10)范围的整数
        System.out.println(j);

        int l = random.nextInt(21); //随机获取[10,30)范围的整数
        System.out.println(l + 10);

    }


}
