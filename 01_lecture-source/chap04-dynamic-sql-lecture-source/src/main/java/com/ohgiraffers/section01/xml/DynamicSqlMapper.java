package com.ohgiraffers.section01.xml;

import com.ohgiraffers.common.MenuDTO;

import java.util.List;
import java.util.Map;

public interface DynamicSqlMapper {
    List<MenuDTO> seletMenuByPrice(Map<String, Integer> map);



}
