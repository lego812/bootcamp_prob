package org.scoula.jdbc_ex;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.scoula.jdbc_ex.dao.UserDao;
import org.scoula.jdbc_ex.dao.UserDaoImpl;
import org.scoula.jdbc_ex.domain.UserVO;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UserMain {
    static UserDao userDao = new UserDaoImpl();
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        while (true) {
            System.out.println("원하는 작업을 선택하시오.");
            System.out.println("=====================");
            System.out.println("1. insert");
            System.out.println("2. selectList");
            System.out.println("3. selectOne");
            System.out.println("4. update");
            System.out.println("5. delete");
            System.out.println("6. exit");
            System.out.println("=====================");
            System.out.print("번호 입력>> ");
            int choice = sc.nextInt();
            if (choice == 1) {
                insert();
            } else if (choice == 2) {
                selectList();
            } else if (choice == 3) {
                selectOne();
            } else if (choice == 4) {
                update();
            } else if (choice == 5) {
                delete();
            } else if (choice == 6) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0); //프로그램 종료
            } else {
                System.out.println("선택이 올바르지 않음.");
            }
        }
    }

    private static void printVO(UserVO userVO) {
        System.out.println("아이디 : " + userVO.getId() + ", 패스워드 : " + userVO.getPassword() + ", 이 름 : " + userVO.getName() + ", 역할 : " + userVO.getRole());
    }

    public static void insert() throws SQLException
    {
        System.out.println("id,pw,name,role을 순서대로 입력하시오.");
        System.out.printf("id(12글자 이내) >>");
        String id = sc.next();
        System.out.printf("pw(12글자 이내) >>");
        String pw = sc.next();
        System.out.printf("name(12글자 이내) >>");
        String name = sc.next();
        System.out.printf("role(12글자 이내) >>");
        String role = sc.next();

        UserVO userVO = new UserVO(id, pw, name, role);
        int num=userDao.create(userVO);

        if(num>0){
            System.out.println("insert 성공!");
        }
    }

    public static void selectList() throws SQLException
    {
        List<UserVO> userList=userDao.getList();
        for(UserVO userVO:userList){
            printVO(userVO);
        }
    }

    public static void selectOne() throws SQLException
    {
        System.out.println("검색하고자하는 id를 입력하시오.");
        System.out.printf("id(12글자 이내) >>");
        String id=sc.next();
        UserVO userVO=userDao.get(id);
        if(userVO.getId()==null) {
            System.out.println("검색 실패, 없는 id입니다!");
        } else {
            printVO(userVO);
        }
    }

    public static void update() throws SQLException
    {
        System.out.println("name, role, id를 순서대로 입력하시오.");
        System.out.printf("name(30글자 이내) >>");
        String name=sc.next();
        System.out.printf("role(30글자 이내) >>");
        String role=sc.next();
        System.out.printf("id(30글자 이내) >>");
        String id=sc.next();

        UserVO uservo=new UserVO(id, null, name, role);
        int rows=userDao.update(uservo);
        if(rows>0){
            System.out.println("update 성공!");
        }else{
            System.out.println("update 실패!");
        }
    }

    public static void delete() throws SQLException
    {
        System.out.println("삭제하고자하는 id를 입력하시오.");
        System.out.printf("id(12글자 이내) >>");
        String id=sc.next();
        int rows=userDao.delete(id);
        if(rows>0) {
            System.out.println("delete 성공!");
        }else {
            System.out.println("delete 실패!");
        }
    }
}
