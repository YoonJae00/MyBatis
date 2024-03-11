package com.ohgiraffers.section01.xmlconfig;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import static com.ohgiraffers.section01.xmlconfig.Template.getSqlSession;

public class Application {

    public static void main(String[] args) {

        System.out.println(getSqlSession());
//        System.out.println(getSqlSession());
//        System.out.println(getSqlSession());
//        System.out.println(getSqlSession());
//        System.out.println(getSqlSession());

    }
}
