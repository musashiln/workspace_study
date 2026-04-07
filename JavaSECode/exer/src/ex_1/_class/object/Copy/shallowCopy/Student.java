package ex_1._class.object.Copy.shallowCopy;

/**
 * ClassName: Student
 * Package: ex_1._class.object.Copy.shallowCopy
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/14 10:23
 * @Version 1.0
 */
public class Student implements Cloneable{

    private Subject subject;
    private String name;

    public Student(String name, String subj) {
        this.subject = new Subject(subj);
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student student = new Student("zhangsan","math");
        System.out.println("原始对象:" + student.getName() + "-" + student.getSubject().getName());

        Student student1 = (Student) student.clone();
        System.out.println("拷贝对象：" + student1.getName() + "-" + student.getSubject().getName());

        // 原始对象和拷贝对象是否一样：
        System.out.println("原始对象和拷贝对象是否一样: " + (student == student1));
        // 原始对象和拷贝对象的name属性是否一样
        System.out.println("原始对象和拷贝对象的name属性是否一样: " + (student.getName() == student1.getName()));
        // 原始对象和拷贝对象的subj属性是否一样
        System.out.println("原始对象和拷贝对象的subj属性是否一样: " + (student.getSubject() == student1.getSubject()));
        student.setName("lisi");
        student.getSubject().setName("english");
        System.out.println("更新后的原始对象: " + student.getName() + " - " + student.getSubject().getName());
        System.out.println("更新原始对象后的克隆对象: " + student1.getName() + " - " + student1.getSubject().getName());

    }
}
