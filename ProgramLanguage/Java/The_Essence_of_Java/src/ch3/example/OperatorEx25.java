package ch3.example;

import java.util.Scanner;

public class OperatorEx25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.printf("문자를 하나 입력하세요> ");
        String input = scanner.nextLine();
        ch = input.charAt(0);       // charAt(), 스트링 문자열 중에서 한 글자만 선택해서 char 타입으로 변환시켜주는 메서드

        if ('0'<=ch && ch<='9') {
            System.out.printf("입력하신 문자는 숫자입니다. %n");
        }

        if (('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z')) {
            System.out.printf("입력하신 문자는 영문자입니다. %n");
        }
    }
}
