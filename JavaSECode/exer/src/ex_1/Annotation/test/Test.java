package ex_1.Annotation.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName: Test
 * Package: ex_1.Annotation.test
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/19 14:16
 * @Version 1.0
 */

public class Test {
    public static void main(String[] args) {
        Filter f1 = new Filter();
        f1.setId(10);

        Filter f2 = new Filter();
        f2.setUserName("lucy");
        f2.setAge(18);

        Filter f3 = new Filter();
        f3.setEmail("liu@sina.com,zh@163.com,77777@qq.com");

        String sql1 = query(f1);
        String sql2 = query(f2);
        String sql3 = query(f3);

        System.out.println(sql1);
        System.out.println(sql2);
        System.out.println(sql3);

        Filter2 filter2 = new Filter2();
        filter2.setAmount(10);
        filter2.setName("技术部");
        System.out.println(query(filter2));
    }

    private static String query(Object f1) {
        StringBuilder sb = new StringBuilder();

        Class cls = f1.getClass();
        boolean isExist = cls.isAnnotationPresent(Table.class);
        if(!isExist) {
            return null;
        }
        Table t = (Table) cls.getAnnotation(Table.class);
        String tableName = t.value();
        sb.append("select * from ").append(tableName).append(" where 1=1");

        //3遍历所有字段
        Field[] fields = cls.getDeclaredFields();
        for(Field field : fields) {
            //4.处理每个字段对应的sql
            //4.1拿到字段名
            boolean isCExist = field.isAnnotationPresent(Column.class);
            if(!isCExist){
                continue;
            }
            Column column = field.getAnnotation(Column.class);
            String columnName = column.value();
            //4.2拿到字段的值
            String fieldName = field.getName();
            String getMethodName = "get" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
            Object fieldValue = null;
            try {
                Method method = cls.getMethod(getMethodName);
                fieldValue = method.invoke(f1);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
            //4.3拼装sql
            if(fieldValue == null || (fieldValue instanceof Integer) && (Integer)fieldValue == 0) {
                continue;
            }
            sb.append(" and ").append(columnName);
            if(fieldValue instanceof String) {
                if(((String) fieldValue).contains(",")) {
                    String[] strings = ((String) fieldValue).split(",");
                    sb.append(" in (");
                    for (String s : strings) {
                        sb.append("'").append(s).append("'").append(",");
                    }
                    sb.deleteCharAt(sb.length() - 1);
                    sb.append(")");
                } else {
                    sb.append("=").append("'").append(fieldValue).append("'");
                }
            } else if(fieldValue instanceof Integer) {
                sb.append("=").append(fieldValue);
            }
        }
        return sb.toString();
    }
}
