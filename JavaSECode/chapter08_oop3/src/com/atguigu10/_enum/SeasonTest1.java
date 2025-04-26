package com.atguigu10._enum;

import java.util.Arrays;

/**
 * ClassName: SeasonTest1
 * Package: com.atguigu10._enum
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/4 16:00
 * @Version 1.0
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        System.out.println(Season1.SPRING);
        System.out.println(Season1.SPRING);
        System.out.println(Arrays.toString(Season1.values()));
        Season1[] season1s = Season1.values();
        for (int i = 0; i < season1s.length; i++) {
            System.out.println(season1s[i]);
        }
        Season1 summer = Season1.valueOf("SUMMER");
        System.out.println(summer);

    }
}

enum Season1 implements info{
    SPRING("spring","chun"){
        @Override
        public void show() {

        }
    },
    SUMMER("summer","xia") {
        @Override
        public void show() {

        }
    };
    private final String seanName;
    private final String seanDesc;

    private Season1(String seanName, String seanDesc) {
        this.seanName = seanName;
        this.seanDesc = seanDesc;
    }

    public String getSeanName() {
        return seanName;
    }

    public String getSeanDesc() {
        return seanDesc;
    }



}


interface info{
    public abstract void show();
}