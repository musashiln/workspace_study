package ex_1.io.serialize;

import java.io.*;

/**
 * ClassName: SerializationDemo
 * Package: ex_1.io.serialize
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/14 9:53
 * @Version 1.0
 */
public class SerializationDemo {

    public static void serializeObject (Person person, String filename)
            throws IOException {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(person);
            System.out.println("序列化成功，保存到：" + filename);
        }
    }

    // 从文件反序列化对象
    public static Person deserializeObject(String filename)
            throws IOException, ClassNotFoundException {
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Person person = (Person) in.readObject();
            System.out.println("反序列化成功");
            return person;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("zhangsan", 25, "secret123");

        try {
            //序列化
            serializeObject(person, "person.ser");
            //反序列化
            Person restoredPerson = deserializeObject("person.ser");

            System.out.println("姓名：" + restoredPerson.getName());
            System.out.println("密码字段(应为null):" + restoredPerson.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
