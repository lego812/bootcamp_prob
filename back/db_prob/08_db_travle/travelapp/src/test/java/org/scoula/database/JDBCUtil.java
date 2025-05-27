package org.scoula.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCUtil {
    static Connection con=null;

    public static Connection getConnection() {
        if(con!=null) return con;
        try{
            Properties prop = new Properties();
            prop.load(JDBCUtil.class.getResourceAsStream("/application.properties"));
            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");
            String user = prop.getProperty("username");
            String password = prop.getProperty("password");
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }

    public static void close() {
        try{
            if(con!=null){
                con.close();
                con=null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
