package com.atguigu06.createmore.callable.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * ClassName: ThreadPool
 * Package: com.atguigu06.createmore.callable.pool
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/17 0:12
 * @Version 1.0
 */
class NumberThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class NumberThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        //1. 提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;

        service1.setMaximumPoolSize(50);

        //2.执行指定的线程的操作。需要提供实现Runnable接口或Callable接口实现类的对象
        service.execute(new NumberThread());
        service.execute(new NumberThread1());
//        service.submit(Callable c);

        //3.关闭连接池
        service.shutdown();

    }
}
