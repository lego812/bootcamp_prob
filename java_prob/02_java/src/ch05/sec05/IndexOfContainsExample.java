package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";
        System.out.println(subject.indexOf("프로그래밍"));
        if(subject.indexOf("프로그래밍")>-1){
            System.out.println("자바와 관련된 책이군요.");
        }
    }

}
