package ch04;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {

        System.out.println("메시지를 입력하시오");
        System.out.println("프로그램을 종료하려면 q를 입력하세요");

        Scanner sc = new Scanner(System.in);

        String input;
        do {
            System.out.print(">");
            input = sc.nextLine();
        }
        while (!input.equals("q")); {
            System.out.println();
            System.out.println("프로그램을 종료합니다.");
        }
    }
}

