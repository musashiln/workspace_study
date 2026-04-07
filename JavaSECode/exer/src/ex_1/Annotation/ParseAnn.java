package ex_1.Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * ClassName: ParseAnn
 * Package: ex_1.Annotation
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/19 13:35
 * @Version 1.0
 */
public class ParseAnn {
    public static void main(String[] args) {
        //1.使用类加载器加载类
        try {
            Class c = Class.forName("ex_1.Annotation.Child");
            //2.找到类上面的注解
            boolean isExist = c.isAnnotationPresent(Description.class);
            if(isExist) {
                //3.拿到注解实例
                Description d = (Description) c.getAnnotation(Description.class);
                System.out.println(d.value());
            }
            //4.找到方法上的注解
            Method[] ms = c.getMethods();
            for(Method m : ms) {
                boolean isMExist = m.isAnnotationPresent(Description.class);
                if(isMExist) {
                    Description d = (Description) m.getAnnotation(Description.class);
                    System.out.println(d.value());
                }
            }

            //另一种解析方法
            for(Method m : ms) {
                Annotation[] annotations = m.getAnnotations();
                for(Annotation annotation: annotations) {
                    if(annotation instanceof Description){
                        Description description = (Description) annotation;
                        System.out.println(description.value());
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
