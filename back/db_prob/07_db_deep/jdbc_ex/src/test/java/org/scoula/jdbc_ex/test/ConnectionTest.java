package org.scoula.jdbc_ex.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.scoula.jdbc_ex.common.JDBCUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
    @Test
    @DisplayName("연결 테스트")
    public void testConnection() throws ClassNotFoundException, SQLException {
        //1.db 드라이버
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("드라이버 연결");

        //2.db 접속
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_ex","scoula","1234");
        System.out.println("연결 성공");
        con.close();
    }

    @Test
    @DisplayName("JDBC 테스트")
//    public void testConnection2() throws SQLException {
//        Connection conn = JDBCUtil.getConnection();
//        conn.close();
//    }
    public void testConnection2(){
        try{
            Connection conn=JDBCUtil.getConnection();
            conn.close();
            System.out.println("DB연결 및 해제 성공");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}