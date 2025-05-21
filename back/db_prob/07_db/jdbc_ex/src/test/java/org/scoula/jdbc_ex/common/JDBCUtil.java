package org.scoula.jdbc_ex.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCUtil {
    static Connection con=null;

    public static Connection getConnection() {
        if(con!=null) return con;
        try {
            Properties prop = new Properties();
            prop.load(JDBCUtil.class.getResourceAsStream("/application.properties"));
            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");
            String user = prop.getProperty("username");
            String password = prop.getProperty("password");

            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            System.out.println("연결성공");
        } catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }

    public static void close(){
        if(con!=null){
            try{
                con.close();
                System.out.println("connection 닫힘");
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
