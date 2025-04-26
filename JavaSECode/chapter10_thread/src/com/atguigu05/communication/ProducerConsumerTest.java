package com.atguigu05.communication;

/**
 * ClassName: ProducerConsumerTest
 * Package: com.atguigu05.communication
 * Description:
 *
 * 生产者将产品交给店员，消费者从店员取走产品，
 * 店员一次只能持有固定数量的产品(20)，如果生产者试图生产更多的产品，店员会叫生产者停下，
 * 如果店中有空位放产品了再通知生产者继续生产；如果店中没有产品了，
 * 店员会告诉消费者等一下，如果店中有产品了再通知消费者来取走产品
 *
 * 1.是否时多线程问题？
 * 2.是否有共享数据？
 * 3.是否有线程安全问题？
 * 4.是否有线程安全问题？
 * 5.是否存在线程间的通信？
 *
 * 线程问题，先考虑普通情况下的面向对象设计，再加入同步方法，再考虑线程通信
 *
 * @Author gxy
 * @Create 2025/4/16 21:45
 * @Version 1.0
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer producer = new Producer(clerk);
        Consumer consumer = new Consumer(clerk);
        Consumer consumer1 = new Consumer(clerk);
        producer.setName("生产者1");
        consumer.setName("消费者1");
        consumer1.setName("消费者2");
        producer.start();
        consumer.start();
        consumer1.start();
    }
}

class Clerk{
    private int productNum;

    public synchronized void addProduct(){

        if(productNum >= 20){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            productNum++;
            System.out.println(Thread.currentThread().getName() + "生产了第" + productNum + "个产品");
            notify();

        }

    }

    public synchronized void minusProduct(){
        if(productNum <= 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println(Thread.currentThread().getName() + "消费了第" + productNum + "个产品");
            productNum--;
            notify();

        }
    }
}

class Producer extends Thread{
    private Clerk clerk;
    public Producer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始生产");
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addProduct();
        }
    }
}

class Consumer extends Thread{
    private Clerk clerk;
    public Consumer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始消费");
        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.minusProduct();
        }
    }
}
