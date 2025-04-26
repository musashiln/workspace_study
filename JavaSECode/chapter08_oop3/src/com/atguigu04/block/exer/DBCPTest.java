package com.atguigu04.block.exer;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ClassName: DBCPTest
 * Package: com.atguigu04.block.exer
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/29 22:21
 * @Version 1.0
 */
public class DBCPTest {
    private static DataSource dataSource = null;

    static {
        InputStream is = null;
        try {
            is = DBCPTest.class.getClassLoader().getResourceAsStream("dbcp.properties");
            Properties pros = new Properties();
            pros.load(is);
            //dataSource = BasicDataSourceFactory.createDataSource(pros);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
