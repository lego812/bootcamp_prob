package org.scoula.jdbc_ex.dao;

import org.scoula.jdbc_ex.common.JDBCUtil;
import org.scoula.jdbc_ex.domain.UserVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {

    Connection con= JDBCUtil.getConnection();

    //users 테이블 관련 sql crud 명령어
    private String user_list="select * from users";
    private String user_get="select * from users where id=?";
    private String user_insert="insert into users values(?,?,?,?)";
    private String user_update="update users set password=?,name=?,role=? where id=?";
    private String user_delete="delete from users where id=?";


    //유저 생성
    @Override
    public int create(UserVO user) throws SQLException {
        UserVO vo=new UserVO();
        try(PreparedStatement ps=con.prepareStatement(user_insert)) {
            ps.setString(1, user.getId());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getUsername());
            ps.setString(4, user.getRole());
        int count= ps.executeUpdate();
        return count;
        }
    }

    //ResultSet에서 UserVO 추출하기
    public UserVO map(ResultSet resultSet) throws SQLException {
        UserVO user=new UserVO();
        user.setId(resultSet.getString("id"));
        user.setPassword(resultSet.getString("password"));
        user.setUsername(resultSet.getString("name"));
        user.setRole(resultSet.getString("role"));
        return user;

    }

    //유저 리스트 조회
    @Override
    public List<UserVO> getList() throws SQLException {
        List<UserVO> list=new ArrayList<>();
        try(PreparedStatement ps=con.prepareStatement(user_list);
            ResultSet rs=ps.executeQuery();) {
            while(rs.next()) {
                UserVO vo=map(rs);
                list.add(vo);
            }
        }
        return list;
    }

    //특정 유저 조회
    @Override
    public Optional<UserVO> get(String id) throws SQLException {
        try(PreparedStatement ps=con.prepareStatement(user_get)) {
            ps.setString(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()) {
                UserVO vo=map(rs);
                return Optional.of(vo);
            }
        }
        return Optional.empty();
    }

    @Override
    public int update(UserVO user) throws SQLException {
        try(PreparedStatement ps=con.prepareStatement(user_update)) {
            ps.setString(1, user.getPassword());
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getRole());
            ps.setString(4, user.getId());
            int count= ps.executeUpdate();
            return count;
        }

    }

    @Override
    public int delete(String id) throws SQLException {
        try(PreparedStatement ps=con.prepareStatement(user_delete)) {
            ps.setString(1, id);
            int count= ps.executeUpdate();
            return count;
        }
    }
}
