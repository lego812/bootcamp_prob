package ch16.sec03;


public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        //매개변수가 두 개일 경우
        person.action1(
                (x, y) -> {
                    System.out.println(x + "이 " + y + "을 합니다.");
                }
        );

        person.action1(
                (x, y) -> {
                    System.out.println(x + "이 " + y + "을 하지 않습니다.");
                }
        );

        person.action2(
                (x) -> {
                    System.out.println("\""+x+"\"라고 말합니다.");
                }
        );

        person.action2(
                (x) -> {
                    System.out.println("\""+x+"\"라고 외칩니다.");
                }
        );
    }
}
