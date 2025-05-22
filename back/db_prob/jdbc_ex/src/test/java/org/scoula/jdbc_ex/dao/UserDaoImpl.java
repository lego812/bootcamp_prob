package org.scoula.jdbc_ex.dao;

import org.scoula.jdbc_ex.common.JDBCUtil;
import org.scoula.jdbc_ex.domain.UserVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        try(PreparedStatement ps = con.prepareStatement(USER_INSERT)){
            ps.setString(1, user.getId());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getName());
            ps.setString(4, user.getRole());
            return ps.executeUpdate();
        }
    }

    public UserVO getInfo(ResultSet rs) throws SQLException {
        UserVO user = new UserVO();
        user.setId(rs.getString("id"));
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));
        user.setRole(rs.getString("role"));
        return user;
    }

    @Override
    public List<UserVO> getList() throws SQLException {
        List<UserVO> list = new ArrayList<>();
        try(PreparedStatement ps = con.prepareStatement(USER_LIST);
            ResultSet rs = ps.executeQuery();){
            while(rs.next()){
                UserVO user = getInfo(rs);
                list.add(user);
            }
        }
        return list;
    }

    @Override
    public Optional<UserVO> get(String id) throws SQLException {
        try(PreparedStatement ps = con.prepareStatement(USER_GET)){
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            return Optional.of(rs);
        }
        return Optional.empty();
    }

    @Override
    public int update(UserVO user) throws SQLException {
        return 0;
    }

    @Override
    public int delete(String id) throws SQLException {
        return 0;
    }
}
