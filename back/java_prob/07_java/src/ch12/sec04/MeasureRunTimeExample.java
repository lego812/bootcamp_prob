package ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int sum = 0;
         for(int i = 1; i <= 1000000; i++) {
             sum += i;
         }
        long time=System.nanoTime();

         System.out.println(sum);
         System.out.println("총 소요시간: "+(time-startTime));
    }
}
