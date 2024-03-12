package com.ohgiraffers.section01.javaconfig;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.Date;

public interface Mapper {   // DAO 랑 비슷한 역할

    @Select("SELECT CURDATE() FROM DUAL")
    Date selectSysdate();

}
