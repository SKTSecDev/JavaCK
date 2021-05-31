package com.skt;

import com.skt.Account;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("-----------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("-----------------");
            System.out.println("선택> ");
            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }
        }  // the end of while
        System.out.println("프로그램 종료");
    }  //main

    // 계좌 생성하기
    public static void createAccount() {
        System.out.println("-----------------");
        System.out.println("계좌생성");
        System.out.println("-----------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌번호: ");
        String ano = sc.next();
        System.out.println("계좌주: ");
        String owner = sc.next();
        System.out.println("초기 입금액: ");
        int balance = sc.nextInt();
        Account personAcc = new Account(ano, owner, balance);
        accountArray[0] = personAcc;
        System.out.println(accountArray[0].getAno());
        System.out.println("결과 : 계좌가 생성되었습니다. ");

    }

    // 계좌 목록보기
    public static void accountList() {

    }

    // 예금하기
    public static void deposit() {

    }

    // 출금하기
    public static void withdraw() {

    }

    // com.skt.Account 배열에서 ano와 동일한 com.skt.Account 객체 찾기
    public static void findAccountList(String ano) {

    }
}

