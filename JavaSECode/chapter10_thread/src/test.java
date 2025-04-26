/**
 * ClassName: test
 * Package: com
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/14 21:07
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        NumPrint numPrint = new NumPrint();
        //NumPrint.currentThread().setName("线程1");
        numPrint.start();
        try {
            System.out.println(NumPrint.currentThread().getName());
            System.out.println(Thread.currentThread().getName());
            numPrint.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        NumPrint1 numPrint1 = new NumPrint1();
//        new Thread(numPrint1).start();



        A.Method();
        A a = new A();
        A.Method();
        B b = new B();
        b.Method();
    }

}
class NumPrint extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class NumPrint1 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 1){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
class A {
    public static int num = 0;
    public static void Method(){
        System.out.println("A");
    }
}

class B extends A {
    public static int num = 0;
//    public static void Method(){
//        System.out.println("A");
//    }
}
