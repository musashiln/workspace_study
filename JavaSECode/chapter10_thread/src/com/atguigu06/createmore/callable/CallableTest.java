package com.atguigu06.createmore.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * ClassName: CallableTest
 * Package: com.atguigu06.createmore.callable
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/16 23:22
 * @Version 1.0
 */
class NumThread implements Callable{

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}

public class CallableTest {
    public static void main(String[] args) {
        //3.创建Callable接口实现类的对象
        NumThread numThread = new NumThread();

        //4.将此Callable接口实现类的对象作为传递到FutureTask构造器中,创建FutureTask的对象
        FutureTask futureTask = new FutureTask(numThread);

        //5.将FutureTask的对象作为参数传递到Thread类的构造器中,创建Thread对象,并调用start()
        Thread t1 = new Thread(futureTask);
        t1.start();

        try {
            //6.获取Callable中call方法的返回值
            //get()返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值。
            Object sum = futureTask.get();
            System.out.println(sum);
        }  catch (Exception e) {
            e.printStackTrace();
        }

    }
}
