package org.scoula.lib;

import java.util.Scanner;

public class Input {

    //정적 scanner 객체 생성
    static Scanner sc = new Scanner(System.in);


    //정적 read 메소드 및 오버로드
    static String read(String title) {
        System.out.printf(title);
        String str = sc.nextLine();
        return str;
    }

    static String read(String title, String defaultValue) {
        System.out.printf("%s(%s): ", title, defaultValue);
        String str = sc.nextLine();
        if (str.isEmpty()) {
            return defaultValue;
        }
        return str;
    }


    //정수 입력
    static int readInt(String title){
        System.out.printf("%s: ", title);
        int num=Integer.parseInt(sc.nextLine());//sc.nextInt
        return num;
    }

    static boolean confirm(String title, boolean defaultValue){
//        String str;
//        if(defaultValue){
//            str="Y/n";
//        } else {
//            str="n/Y";
//        }
        String str=defaultValue?"(Y/n)":"(n/Y)";
        System.out.printf("%s %s: ", title, str);

        String answer = sc.nextLine();

        return answer.isEmpty() ? defaultValue : answer.equalsIgnoreCase("y");
//        if (answer.isEmpty()) {
//            return defaultValue;
//        }
//        return answer.equalsIgnoreCase("y");

    }

    boolean confirm(String title){
        return confirm(title, true);
    }
}
