package ch04.sec07;

public class BreakExample {
    public static void main(String[] args) throws Exception {
        int num=0;

        while (!(num==6)) {
            num=(int)(Math.random()*6)+1;
            System.out.println(num);
        }

        System.out.println("프로그램 종료");
    }
}
