package org.scoula.jdbc_ex.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
    static Connection conn = null;

    public static Connection getConnection(){
        if (conn!=null) return conn;
        try{
            Properties prop = new Properties();
            prop.load(JDBCUtil.class.getClassLoader().getResourceAsStream("db.properties"));
            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");
            String user = prop.getProperty("user");
            String password = prop.getProperty("password");
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close() {
        if(conn!=null) {
            try{
                conn.close();
                conn = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
