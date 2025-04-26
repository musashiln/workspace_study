package com.atguigu08._interface.exer2;

/**
 * ClassName: ComparableCircle
 * Package: com.atguigu08._interface.exer2
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/1 21:37
 * @Version 1.0
 */
public class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle() {

    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object object) {
        if(this == object){
            return 0;
        }
        if(object instanceof ComparableCircle){
            ComparableCircle comparableCircle = (ComparableCircle) object;
            return Double.compare(this.getRadius(),comparableCircle.getRadius());
        }

        return 2;
    }
}
