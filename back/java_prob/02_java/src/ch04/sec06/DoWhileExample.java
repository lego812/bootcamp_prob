package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");
        String str;

        do {
            System.out.println(">");
            str = scanner.nextLine();
            System.out.println(str);
        } while (!str.equals("q"));

    }
}
