package ch05.sec09;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = { 95, 71, 84, 93, 87 };
        int sum=0;
        for(int i:scores){
            sum+=i;
        }
        System.out.println(sum);
        System.out.println((double)sum/scores.length);

    }
}
