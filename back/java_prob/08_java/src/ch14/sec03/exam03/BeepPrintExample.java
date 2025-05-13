package ch14.sec03.exam03;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Thread thread=new Thread(){
            @Override
            public void run() {
                toolkit.beep();
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    System.out.println("예외발생");
                }
            }
        };

        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
