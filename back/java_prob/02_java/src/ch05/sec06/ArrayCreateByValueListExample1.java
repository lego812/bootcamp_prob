package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = { "Spring", "Summer", "Fall", "Winter" };
        int[] scores = { 83, 90, 87 };
        int sum=0;
        double aev=0;
        for(int i=0; i<season.length;i++){
            System.out.println("season["+i+"] : "+season[i]);
        }

        for(int i=0; i<scores.length; i++){
            sum+=scores[i];
        }

        aev=(double)sum/scores.length;

        System.out.println("총합 : "+sum);
        System.out.println("평균 : "+aev);

    }
}
