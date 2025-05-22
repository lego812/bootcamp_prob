package org.scoula.jdbc_ex.test;

import org.junit.jupiter.api.*;
import org.scoula.jdbc_ex.common.JDBCUtil;
import org.scoula.jdbc_ex.dao.UserDao;
import org.scoula.jdbc_ex.dao.UserDaoImpl;
import org.scoula.jdbc_ex.domain.UserVO;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class UserDaoTest {
    UserDao dao=new UserDaoImpl();

    @AfterAll
    static void tearDown() {
        JDBCUtil.close();
    }

    @Test
    @DisplayName("유저생성")
    @Order(1)
    void create() throws SQLException {
        UserVO vo=new UserVO("suwontaran","1234","박다빈","학생");
        int count=dao.create(vo);
        Assertions.assertEquals(1, count);
    }

    @Test
    @DisplayName("유저 목록 조회")
    @Order(1)
    void getList() throws SQLException {
        List<UserVO> list=dao.getList();
        Assertions.assertEquals(4, list.size());
    }

    @Test
    @DisplayName("특정 유저 조회")
    @Order(2)
    void get() throws SQLException {
        Optional<UserVO> vo=dao.get("suwontaran");
        System.out.println(vo.toString());
        Assertions.assertNotNull(vo);
    }

    @Test
    @DisplayName("업데이트")
    @Order(3)
    void update() throws SQLException {
        UserVO vo=dao.get("suwontaran").orElseThrow(NoSuchFieldError::new);
        vo.setUsername("박유빈");
        int count=dao.update(vo);
        Assertions.assertEquals(1, count);
    }

    @Test
    @DisplayName("데이터 삭제")
    @Order(4)
    void delete() throws SQLException {
        int count =dao.delete("suwontaran");
        Assertions.assertEquals(1, count);
    }
}
