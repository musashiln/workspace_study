package com.atguigu05.exer.exer4;

/**
 * ClassName: BelowZeroException
 * Package: com.atguigu05.exer.exer4
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/5 17:32
 * @Version 1.0
 */
public class BelowZeroException extends Exception{

    static final long serialVersionUID = -33875169931242299L;
    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }

}
