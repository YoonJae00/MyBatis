package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.xmlconfig.Template.getSqlSession;

/* 필기.
    Service 의 역할
    1. SqlSession 생성
    2. DAO(데이터베이스 접근 객체)의 메소드 호출
    3. 트랜젝션(commit,rollback) 제어
    4. SqlSession 닫기
 */
public class MenuService {

    private final MenuDAO menuDAO;

    public MenuService() {
        this.menuDAO = new MenuDAO();
    }

    public List<MenuDTO> selectAllMenu() {

        SqlSession sqlSession = getSqlSession();

        List<MenuDTO> menuList = menuDAO.selectAllMenu(sqlSession);


        sqlSession.close();

        return menuList;
    }


    public MenuDTO selectMenuByCode(int code) {

        SqlSession sqlSession = getSqlSession();

        MenuDTO menu = menuDAO.selectMenuByCode(sqlSession, code);

        sqlSession.close();

        return menu;
    }


    public boolean registMenu(MenuDTO menu) {

        SqlSession sqlSession = getSqlSession();

        int result = menuDAO.insertMenu(sqlSession, menu);

        // 트렌젝션 제어
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean editMenu(MenuDTO menuDTO) {
        SqlSession sqlSession = getSqlSession();

        int result = MenuDAO.editMenu(sqlSession, menuDTO);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0 ? true : false;
    }


    public boolean deleteMenu(MenuDTO menuDTO) {
        SqlSession sqlSession = getSqlSession();

        int result = MenuDAO.deleteMenu(sqlSession,menuDTO);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        System.out.println(result);
        return result > 0 ? true : false;
    }
}
