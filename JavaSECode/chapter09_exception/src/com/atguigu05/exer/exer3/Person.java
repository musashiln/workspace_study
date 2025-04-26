package com.atguigu05.exer.exer3;

/**
 * ClassName: Person
 * Package: com.atguigu05.exer.exer3
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/5 17:12
 * @Version 1.0
 */
public class Person {
    private String Name;
    private int lifeValue;

    public Person() {
    }

    public Person(String name, int lifeValue) {
        Name = name;
        setLifeValue(lifeValue);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        if(lifeValue < 0){
            throw new NoLifeValueException("生命值不能为负数:" + lifeValue);
        }
        this.lifeValue = lifeValue;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", lifeValue=" + lifeValue +
                '}';
    }
}
