package ch02.sec13;
import java.util.Scanner;

public class scannerExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("x값: ");
        int x=sc.nextInt();
        System.out.println("y값: ");
        int y=sc.nextInt();

        System.out.println("x+y: "+(x+y));

        while(true) {
            System.out.print("입력 문자열: ");
            String data = sc.nextLine();
            if(data.equals("q")) {
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();
        }
        System.out.println("종료");
    }
}
