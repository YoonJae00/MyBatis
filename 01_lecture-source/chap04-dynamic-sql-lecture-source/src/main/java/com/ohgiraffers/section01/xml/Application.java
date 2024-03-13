package com.ohgiraffers.section01.xml;

import java.util.Scanner;

public class Application {



    public static void main(String[] args) {

        // 필기. 마이바티스 동적 SQL 확인하기
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("=========== 마이바티스 동적 SQL ==========");
            System.out.println("1. if 확인하기");
            System.out.println("2. choose(when, otherwise) 확인하기");
            System.out.println("3. foreach 확인하기");
            System.out.println("4. trim(where, set) 확인하기");
            System.out.println("9. 종료하기");
            System.out.print("메뉴를 선택해주세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : ifSubMenu(); break;
                case 2 : break;
                case 3 : break;
                case 4 : break;
                case 9 :
                    System.out.println("시스템을 종료합니다..");
                    return;
            }
        } while (true);

    }

    private static void ifSubMenu() {
        MenuService menuService = new MenuService();
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("========== if 서브 메뉴 ==========");
            System.out.println("1. 원하는 금액대에 적합한 추천 메뉴 목록 보여주기");
            System.out.println("2. 메뉴 이름 or 카테고리명으로 검색하여 메뉴 목록 보여주기");
            System.out.println("9. 이전메뉴로");
            System.out.print("원하는 메뉴를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : menuService.selectMenuByPrice(intputPrice()); break;
                case 2 : break;
                case 9 : return;
            }

        } while (true);
    }

    private static int intputPrice() {

        Scanner sc = new Scanner(System.in);
        System.out.println("검색하실 가격의 최대 금액을 입력해주세요 : ");
        int price = sc.nextInt();

        return price;
    }
}
