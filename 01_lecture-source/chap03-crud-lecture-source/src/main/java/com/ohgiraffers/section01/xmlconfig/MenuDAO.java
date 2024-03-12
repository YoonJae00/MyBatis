package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MenuDAO {

    public static int deleteMenu(SqlSession sqlSession, MenuDTO id) {

        return sqlSession.delete("MenuMapper.deleteMenu",id);
    }

    public List<MenuDTO> selectAllMenu(SqlSession sqlSession) {

        return sqlSession.selectList("MenuMapper.selectAllMenu");
    }


    public MenuDTO selectMenuByCode(SqlSession sqlSession, int code) {

        return sqlSession.selectOne("selectMenuByCode",code);
    }


    public int insertMenu(SqlSession sqlSession, MenuDTO menu) {

        return sqlSession.insert("MenuMapper.insertMenu",menu);
    }

    public static int editMenu(SqlSession sqlSession, MenuDTO menuDTO) {

        return sqlSession.insert("MenuMapper.editMenu",menuDTO);
    }

}
