import java.util.Scanner;

public class page10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int sum = 0;

//        while(true) {
//            System.out.println("-----------------------------");
//            System.out.println("1.예금 | 2.출금 | 3.잔고 |4.종료");
//            System.out.println("=============================");
//            System.out.println("선택");
//            choice = sc.nextInt();
//
//            if(choice == 1) {
//                System.out.println("예금액>");
//                int in = sc.nextInt();
//                sum += in;
//            } else if(choice == 2) {
//                System.out.println("출금액>");
//                int out = sc.nextInt();
//                sum -= out;
//            } else if(choice == 3) {
//                System.out.println("잔고>"+sum);
//            } else if(choice == 4) {
//                break;
//            }
//        }
//
//        System.out.println("프로그램 종료");

        while(true) {
            System.out.println("-----------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 |4.종료");
            System.out.println("=============================");
            System.out.println("선택");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("예금액>");
                    int in = sc.nextInt();
                    sum += in;
                    break;

                case 2:
                    System.out.println("출금액>");
                    int out = sc.nextInt();
                    sum -= out;
                    break;

                case 3:
                    System.out.println("잔고>" + sum);
                    break;

                case 4:
                    System.out.println("프로그램 종료");
                    return;  // 또는 break 후 루프 종료 처리
            }
        }

    }
}
