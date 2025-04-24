package ch11.sec02.exam01;

//public class ExceptionHandlingExample1 {
//    public static void printLength(String data) {
//        int result = data.length();
//        System.out.println("문자 수: " + result);
//    }
//    public static void main(String[] args) {
//        System.out.println("[프로그램 시작]\n");
//        printLength("ThisIsJava");
//        printLength(null);//매개값으로 null이 대입되면 안됨.
//                               //NullPointException 발생
//        System.out.println("[프로그램 종료]");
//    }
//}

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {

        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            System.out.println("예외처리 발생");
//            System.out.println(e);
//            e.printStackTrace();
//            System.out.println(e.toString());
              System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}
