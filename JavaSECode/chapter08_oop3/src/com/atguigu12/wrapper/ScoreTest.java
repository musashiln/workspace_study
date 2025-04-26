package com.atguigu12.wrapper;

import org.junit.Test;

import java.util.Scanner;
import java.util.Vector;

/**
 * ClassName: ScoreTest
 * Package: com.atguigu12.wrapper
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/4 13:57
 * @Version 1.0
 */
public class ScoreTest {
    @Test
    public void test(){
        Vector vector = new Vector();
        Scanner scanner = new Scanner(System.in);
        int maxScore = 0;
        System.out.println("enter score:");
        while (true) {
            int score = scanner.nextInt();
            if(score < 0){
                break;
            }
//            Integer integer = score;
//            vector.addElement(integer);
            vector.addElement(score);
            if(maxScore < score){
                maxScore = score;
            }
        }

        System.out.println("max score is: " + maxScore);

        for (int i = 0; i < vector.size(); i++) {
            Object o = vector.elementAt(i);
            //拆箱
//            Integer o1 = (Integer) o;
//            int score = o1.intValue();
            //自动拆箱
            int score = (Integer) o;
            char grade = ' ';
            if(maxScore - score <= 10){
                grade = 'a';
            } else if (maxScore - score <= 20) {
                grade = 'b';
            } else if (maxScore - score <= 30) {
                grade = 'c';
            }else {
                grade = 'd';
            }
            System.out.println("student " + i + "score is:" + score + ",grade is: " + grade);
        }

        scanner.close();
    }
}
