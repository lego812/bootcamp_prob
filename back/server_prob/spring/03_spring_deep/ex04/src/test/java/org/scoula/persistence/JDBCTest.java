package org.scoula.persistence;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.junit.jupiter.api.Assertions.fail;

@Log4j2
public class JDBCTest {

    @BeforeAll
    static void setup(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("jdbc연결 성공")
    void testConnection() {
        String url = "jdbc:mysql://localhost:3306/scoula_db";
        String username = "scoula";
        String password = "1234";
        try(Connection conn = DriverManager.getConnection(url, username, password)){
            log.info(conn);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
