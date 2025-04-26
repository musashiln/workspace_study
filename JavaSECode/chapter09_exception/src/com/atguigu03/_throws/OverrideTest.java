package com.atguigu03._throws;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: OverrideTest
 * Package: com.atguigu03._throws
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/5 15:25
 * @Version 1.0
 */
public class OverrideTest {
    public static void main(String[] args) {
        Father father = new Son();
        try {
            father.method();
        }catch (IOException e){
            e.printStackTrace();
        }

        Number number = father.method3();
    }
}

class Father{
    public void method() throws IOException{

    }

    public void method1() {

    }

    public void method2() {

    }

    public Number method3(){
        return 1;
    }
}

class Son extends Father{
    @Override
    public void method() throws FileNotFoundException{

    }

//    public void method1() throws IOException{
//
//    }

    public void method2() throws RuntimeException{

    }

    public Integer method3(){
        return 1;
    }

    public Integer method4(){
        return 1;
    }




}
