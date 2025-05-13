package ch09.sec07.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        //Ok 버튼 객체 생성
        Button btnOk = new Button();

        //Ok 버튼 객체에 ClickListener 구현 객체 주입
        btnOk.setClickListener(new Button.ClickListener() {
            //1.익명객체생성하여 바로 주입
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        });

        // 2.오케이클릭리스너 생성 후 btnOk에 주입
//        Button.ClickListener OkclickListener = new Button.ClickListener() {
//            @Override
//            public void onClick() {
//                System.out.println("Ok 버튼을 클릭했습니다.");
//            }
//        };
//
//        btnOk.setClickListener(OkclickListener);

        //3.람다식
        //btnOk.setClickListener(()-> System.out.println("Ok버튼을 클릭했습니다."));

        //Ok 버튼 클릭하기
        btnOk.click();
        //Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        //Cancel 버튼 객체에 ClickListener 구현 객체 주입

        //1.익명객체생성하여 바로 주입

        btnCancel.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick(){
                System.out.println("Cancle 버튼을 클릭했습니다.");
            }
        });
        //2.캔슬클릭리스너 생성 후, btnCancel에 주입
//        Button.ClickListener CancleclickListener = new Button.ClickListener() {
//            @Override
//            public void onClick() {
//                System.out.println("Cancle 버튼을 클릭했습니다.");
//            }
//        };

//        btnCancel.setClickListener(CancleclickListener);

        //3.람다식
//        btnCancel.setClickListener(()-> System.out.println("Cancel버튼을 클릭했습니다."));
        //Cancel 버튼 클릭하기
        btnCancel.click();

    }
}
