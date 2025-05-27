package org.scoula.jdbc_ex.dao;

import org.scoula.jdbc_ex.common.JDBCUtil;
import org.scoula.jdbc_ex.domain.UserVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    Connection con= JDBCUtil.getConnection();

    // USERS 테이블 관련 SQL 명령어
    private String USER_LIST = "select * from users";
    private String USER_GET = "select * from users where id = ?";
    private String USER_INSERT = "insert into users values(?, ?, ?, ?)";
    private String USER_UPDATE = "update users set name = ?, role = ? where id = ?";
    private String USER_DELETE = "delete from users where id = ?";



    @Override
    public int create(UserVO user) throws SQLException {
        PreparedStatement ps = con.prepareStatement(USER_INSERT);
        ps.setString(1, user.getId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getName());
        ps.setString(4, user.getRole());
        int rows = ps.executeUpdate();
        return rows;
    }

    @Override
    public List<UserVO> getList() throws SQLException {
        try (PreparedStatement ps = con.prepareStatement(USER_LIST)) {
            ResultSet rs = ps.executeQuery();
            List<UserVO> list = new ArrayList<>();
            while (rs.next()) {
                UserVO vo = new UserVO();
                vo.setId(rs.getString("id"));
                vo.setRole(rs.getString("role"));
                vo.setName(rs.getString("name"));
                vo.setPassword(rs.getString("password"));
                list.add(vo);
            }
            ps.close();
            return list;
        }
    }

    @Override
    public UserVO get(String id) throws SQLException {
        try (PreparedStatement ps = con.prepareStatement(USER_GET)) {
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            UserVO vo = new UserVO();
            if(rs.next()){
                vo.setId(rs.getString("id"));
                vo.setRole(rs.getString("role"));
                vo.setName(rs.getString("name"));
                vo.setPassword(rs.getString("password"));
            }
            ps.close();
            return vo;
        }
    }

    @Override
    public int update(UserVO user) throws SQLException {
        PreparedStatement ps = con.prepareStatement(USER_UPDATE);
        ps.setString(1, user.getName());
        ps.setString(2, user.getRole());
        ps.setString(3, user.getId());
        int rows = ps.executeUpdate();
        ps.close();
        return rows;
    }

    @Override
    public int delete(String id) throws SQLException {
        PreparedStatement ps = con.prepareStatement(USER_DELETE);
        ps.setString(1, id);
        int rows = ps.executeUpdate();
        ps.close();
        return rows;
    }
}
