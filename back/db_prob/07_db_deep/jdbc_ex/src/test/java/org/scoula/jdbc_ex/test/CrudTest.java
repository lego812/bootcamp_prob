package org.scoula.jdbc_ex.test;

import org.junit.jupiter.api.*;
import org.scoula.jdbc_ex.common.JDBCUtil;
import org.scoula.jdbc_ex.domain.UserVO;

import java.sql.*;


public class CrudTest {
    static Connection con = JDBCUtil.getConnection();

    @AfterAll
    public static void tearDown() {
        JDBCUtil.close();
    }

    @Test
    @DisplayName("user 등록")
    @Order(1)
    public void insertUser() throws SQLException {
        String sql = "insert into users(id,password,name,role) values(?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, "ice");
            ps.setString(2, "fire");
            ps.setString(3, "wind");
            ps.setString(4, "ground");

            int count = ps.executeUpdate();
            Assertions.assertEquals(0, count);
        }
    }


    @Test
    @DisplayName("유저 목록 추출")
    @Order(2)
    public void selectUser() throws SQLException {
        String sql = "select * from users";
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql);
        ) {
            while (rs.next()) {
                System.out.println(rs.getString("id") + " " + rs.getString("password") + " " + rs.getString("name") + rs.getString("role")
                );
            }
        }
    }

    @Test
    @DisplayName("유저 Id 별로 추출")
    @Order(2)
    public void selectId() throws SQLException {
        String sql="select * from users where id=?";
        String userid="scoula";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, userid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getString("id") + " " + rs.getString("password") + " " + rs.getString("name"));
            }
        }
    }

    @Test
    @DisplayName("지정한 id에 해당하는 유저의 name 수정")
    @Order(4)
    public void updateUser() throws SQLException {
        String sql="update users set name=? where id=?";

        try(PreparedStatement ps=con.prepareStatement(sql)){
            ps.setString(1,"개이득");
            ps.setString(2,"ice");
            int count=ps.executeUpdate();
            Assertions.assertEquals(0,count);
        }
    }

    @Test
    @DisplayName("지정한 id에 해당하는 유저의 name 수정")
    @Order(5)
    public void deleteUser() throws SQLException {
        String sql="delete from users where id=?";
        try(PreparedStatement ps=con.prepareStatement(sql)){
            ps.setString(1,"cie");
            int count=ps.executeUpdate();
            Assertions.assertEquals(0,count);
        }
    }




}
