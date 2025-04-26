package com.atguigu04._throw;

/**
 * ClassName: ThrowTest
 * Package: com.atguigu04._throw
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/5 16:08
 * @Version 1.0
 */
public class ThrowTest {
    public static void main(String[] args) {
        Student student = new Student();
//        try {
//            student.regist(10);
//            student.regist(-10);
//        }catch (RuntimeException e){
//            System.out.println(e.getMessage());
//        }

        try {
            student.regist(10);
            student.regist(-10);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}

class Student{

    int id;
    public void regist(int id) throws Exception {
        if(id > 0){
            this.id = id;
        }else {
            //throw new RuntimeException("输入的id非法");
            throw new BelowZeroException("输入的id非法");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
