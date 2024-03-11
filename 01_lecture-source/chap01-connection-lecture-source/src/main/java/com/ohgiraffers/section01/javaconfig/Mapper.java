package com.ohgiraffers.section01.javaconfig;

import org.apache.ibatis.annotations.Select;

public interface Mapper {   // DAO 랑 비슷한 역할

    @Select("SELECT CURDATE() FROM DUAL")
    java.util.Date selectSysdate();

}
