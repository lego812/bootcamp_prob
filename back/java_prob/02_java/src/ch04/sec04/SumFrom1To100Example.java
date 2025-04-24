package ch04.sec04;

//for문 사용
//public class SumFrom1To100Example {
//    public static void main(String[] args) {
//        int sum=0;
//        for (int i = 1; i <= 100; i++) {
//            sum+=i;
//        }
//        System.out.println("1~100 합 : "+sum);
//    }
//}

//while문 사용
public class SumFrom1To100Example {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while(i<=100){
            sum+=i;
            i++;
        }

        System.out.println("1~100 합 : "+sum);
    }
}