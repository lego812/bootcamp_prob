import java.util.Arrays;
import java.util.Scanner;

public class page12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int key;
        int student;
        int[] scores=null;

        while(true){
            System.out.println("-------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4. 분석 | 5.종료");
            System.out.println("-------------------------------------------------");
            System.out.println("선택>");
            key=sc.nextInt();
            switch(key) {
                case 1:
                    System.out.println("학생수> ");
                    student = sc.nextInt();
                    scores = new int[student];
                    break;

                case 2:
                    for(int i=0; i<scores.length; i++){
                        System.out.println("scores["+i+"]> ");
                        scores[i]=sc.nextInt();
                    }
                    break;

                case 3:
                    for(int i=0; i<scores.length; i++){
                        System.out.println("scores["+i+"]: "+scores[i]);
                    }
                    break;

                case 4:
                    System.out.println("최고 점수: "+ Arrays.stream(scores).max().getAsInt());
                    System.out.println("평균 점수: "+ Arrays.stream(scores).average().getAsDouble());
                    break;

                case 5:
                    System.out.println("프로그램 종료");
                    return;
            }
        }
    }
}
