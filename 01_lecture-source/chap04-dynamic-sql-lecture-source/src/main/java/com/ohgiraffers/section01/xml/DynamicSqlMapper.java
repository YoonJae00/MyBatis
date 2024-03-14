package com.ohgiraffers.section01.xml;

import com.ohgiraffers.common.MenuDTO;
import com.ohgiraffers.common.SearchCriteria;

import java.util.List;
import java.util.Map;

public interface DynamicSqlMapper {
    List<MenuDTO> seletMenuByPrice(Map<String, Integer> map);


    List<MenuDTO> searchMenu(SearchCriteria searchCriteria);

    MenuDTO searchUpMenu(int price);

    List<MenuDTO> searchMenuBySubCategory(SearchCriteria searchCriteria);


    List<MenuDTO> searchMenuByRandomMenuCode(Map<String, List<Integer>> criteria);

    List<MenuDTO> searchMenuByCodeOrSearchAll(SearchCriteria searchCriteria);

    List<MenuDTO> searchMenuByNameOrCategory(Map<String, Object> criteria);

    int modifyMenu(Map<String, Object> criteria);
}
