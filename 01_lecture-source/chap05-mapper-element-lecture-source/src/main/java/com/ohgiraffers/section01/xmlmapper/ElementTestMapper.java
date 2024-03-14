package com.ohgiraffers.section01.xmlmapper;

import com.ohgiraffers.common.MenuDTO;

import java.util.List;

public interface ElementTestMapper {
    List<String> selectCacheTest();

    List<MenuDTO> selectResultMapTest();

    List<MenuDTO> selectResultMapConstructorTest();
}
