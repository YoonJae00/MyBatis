package com.ohgiraffers.section01.xmlmapper;

import com.ohgiraffers.common.CategoryAndMenuDTO;
import com.ohgiraffers.common.MenuAndCategoryDTO;
import com.ohgiraffers.common.MenuDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Scanner;

import static com.ohgiraffers.common.Template.getSqlSession;

public class ElementTestService {

    private ElementTestMapper mapper;
    public void selectCacheTest() {
        // 조회 시간 확인용 시작시간
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        for(int i = 0; i < 10; i++){
            // 조회 시간 확인용 시간
            Long startTime = System.currentTimeMillis();
            List<String> nameList = mapper.selectCacheTest();
            System.out.println(nameList);

            // 조회 시간 확인용 시간
            Long endTime = System.currentTimeMillis();

            Long interval = endTime - startTime;
            System.out.println("수행시간 : " + interval + "(ms)");

        }
        sqlSession.close();
    }

    public void resultmapSubMenu() {

        Scanner sc = new Scanner(System.in);
        ElementTestService elementTestService = new ElementTestService();

        do{
            System.out.println("========== <resultMap> 서브메뉴 ==========");
            System.out.println("1. <resultMap> 테스트");
            System.out.println("2. <constructor> 테스트");
            System.out.println("3. <association> 테스트");
            System.out.println("4. <collection> 테스트");
            System.out.println("9. 이전 메뉴");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : elementTestService.selectResultMapTest(); break;
                case 2 : elementTestService.selectResultMapConstructorTest(); break;
                case 3 : elementTestService.selectResultMapAssociationTest(); break;
                case 4 : elementTestService.selectResultMapCollectionTest(); break;
                case 9 : return;
            }

        } while (true);


    }

    private void selectResultMapCollectionTest() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<CategoryAndMenuDTO> categoryList = mapper.selectResultMapCollectionTest();
        for(CategoryAndMenuDTO category : categoryList){
            System.out.println(category);
        }

        sqlSession.close();
    }

    private void selectResultMapConstructorTest() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<MenuDTO> menuList = mapper.selectResultMapConstructorTest();

        for (MenuDTO menu : menuList){
            System.out.println(menu);
        }

        sqlSession.close();
    }

    private void selectResultMapTest() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<MenuDTO> menuList = mapper.selectResultMapTest();

        for(MenuDTO menu : menuList){
            System.out.println(menu);
        }

        sqlSession.close();
    }

    public void selectResultMapAssociationTest() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<MenuAndCategoryDTO> menuList = mapper.selectResultMapAssociationTest();

        for(MenuAndCategoryDTO menu : menuList){
            System.out.println(menu);
        }

        sqlSession.close();

    }

    public void selectSqlTest() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<MenuDTO> menuList = mapper.selectSqlTest();
        for(MenuDTO menu : menuList){
            System.out.println(menu);
        }

        sqlSession.close();
    }
}
