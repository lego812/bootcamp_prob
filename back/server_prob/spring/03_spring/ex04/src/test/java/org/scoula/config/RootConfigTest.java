package org.scoula.config;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = RootConfig.class)
@Log4j2
class RootConfigTest {

    @Autowired
    private DataSource dataSource;

    @Test
    @DisplayName("Datasource 연결 성공")
    void dataSource() {
        try(Connection conn=dataSource.getConnection()){
            log.info("ds 준비완료");
            log.info(conn);
        }catch(Exception e){
            fail(e.getMessage());
        }
    }
}