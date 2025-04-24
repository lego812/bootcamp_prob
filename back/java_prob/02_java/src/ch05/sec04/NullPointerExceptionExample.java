package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        intArray[0] = 10; //참조형 변수에 배열주소가 할당되지 않음.
        String str = null;
        System.out.println("총 문자 수: " + str.length() );//str변수가 참조하는 String객체가 없음
    }
}
