package com.atguigu04._throw;

/**
 * ClassName: BelowZeroException
 * Package: com.atguigu04._throw
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/5 16:37
 * @Version 1.0
 */
public class BelowZeroException extends Exception{

    static final long serialVersionUID = -3387513124229948L;
    public BelowZeroException() {
        super();
    }

    public BelowZeroException(String message) {
        super(message);
    }

    public BelowZeroException(String message, Throwable cause) {
        super(message, cause);
    }

}
