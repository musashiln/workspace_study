package com.atguigu05.exer.exer4;

/**
 * ClassName: DivisionDemo
 * Package: com.atguigu05.exer.exer4
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/5 17:29
 * @Version 1.0
 */
public class DivisionDemo {
    public static void main(String[] args) {
        try {
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);

            int result = divide(m,n);
            System.out.println("结果为：" + result);
        } catch (BelowZeroException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("数据类型不一致");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("缺少命令行参数");
        } catch (ArithmeticException e){
            System.out.println("除0");
        }
    }

    public static int method() throws BelowZeroException {
        return divide(12,5);
    }

    public static int divide(int m, int n) throws BelowZeroException{
        if(m < 0 || n < 0){
            throw new BelowZeroException("输入负数了");
        }
        return m / n;
    }
}
