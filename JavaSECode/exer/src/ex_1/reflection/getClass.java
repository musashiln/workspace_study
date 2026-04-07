package ex_1.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * ClassName: getClass
 * Package: ex_1.reflection
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/18 14:45
 * @Version 1.0
 */
public class getClass {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        //一、获取Class对象
        //1.知道具体类
        Class<TargetObject> targetObjectClass = TargetObject.class;
        //2.Class.forName()传入类的全路径
        Class<?> aClass = Class.forName("ex_1.reflection.TargetObject");
        //3.通过对象实例.getClass()
        TargetObject targetObject = new TargetObject();
        Class<?> aClass1 = targetObject.getClass();
        //4.通过类加载器xxxClassLoader.loadClass()传入类路径获取
        ClassLoader.getSystemClassLoader().loadClass("ex_1.reflection.TargetObject");

        //二、通过反射创建类对象
        //1.通过 Class 对象的 newInstance() 方法
        TargetObject targetObject1 = targetObjectClass.newInstance();
        //2.通过 Constructor 对象的 newInstance() 方法
        //通过 Constructor 对象创建类对象可以选择特定构造方法，
        // 而通过 Class 对象则只能使用默认的无参数构造方法。
        Constructor<TargetObject> constructor = targetObjectClass.getConstructor();
        TargetObject targetObject2 = (TargetObject) constructor.newInstance();
        Constructor<TargetObject> constructor1 = targetObjectClass.getConstructor(String.class);
        TargetObject targetObject3 = (TargetObject) constructor1.newInstance("target有参");
        System.out.println(targetObject2.getClass());
        System.out.println(targetObject3.getClass());



    }
}
