package com.ohgiraffers.section01.xmlmapper;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ElementTestService elementTestService = new ElementTestService();
        do{

            System.out.println("========== 매퍼 element 테스트 메뉴 ==========");
            System.out.println("1. <cache> 테스트");
            System.out.println("2. <resultMap> 서브 메뉴");
            System.out.println("3. <sql> 테스트");
            System.out.println("4. <insert> 서브 메뉴");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1: elementTestService.selectCacheTest(); break;
                case 2: elementTestService.resultmapSubMenu(); break;
                case 3: break;
                case 4: break;
                case 9: return;
            }

        } while (true);
    }

}
