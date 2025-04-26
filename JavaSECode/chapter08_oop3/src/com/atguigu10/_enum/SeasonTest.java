package com.atguigu10._enum;

/**
 * ClassName: SeasonTest
 * Package: com.atguigu10._enum
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/4 15:53
 * @Version 1.0
 */
public class SeasonTest {
}

class Season{
    private final String seanName;
    private final String seanDesc;

    private Season(String seanName, String seanDesc) {
        this.seanName = seanName;
        this.seanDesc = seanDesc;
    }

    public String getSeanName() {
        return seanName;
    }

    public String getSeanDesc() {
        return seanDesc;
    }

    public static final Season SPRING = new Season("spring","chun");
    public static final Season SUMMER = new Season("summer","xia");

}
