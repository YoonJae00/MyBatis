package com.ohgiraffers.section01.xml;

import com.ohgiraffers.common.MenuDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.ohgiraffers.common.Template.getSqlSession;

public class MenuService {

    private DynamicSqlMapper mapper;
    public void selectMenuByPrice(int price) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        /* 필기. 기본 자료형으로는 조건문의 값을 비교할 수 없으며 hashmap 의 key
                혹은 dto 의 getter 를 이용하여 값을 확인 할 수 있다.
         */
        Map<String, Integer> map = new HashMap<>();
        map.put("price",price);

        // 우리가 값을 넘겨주면 그 범위에 해당하는 메뉴들을 조회할 것이다.
        List<MenuDTO> menuList = mapper.seletMenuByPrice(map);
        // 굳이 null?
        if(menuList != null && menuList.size() > 0 ){
            for(MenuDTO menu : menuList){
                System.out.println(menu);
            }
        }else System.out.println("검색 결과가 존재하지 않습니다...");

        sqlSession.close();
    }
}
