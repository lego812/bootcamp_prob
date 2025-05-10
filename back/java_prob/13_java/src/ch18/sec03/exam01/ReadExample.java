package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try{
            InputStream is = new FileInputStream("c:/Temp/test1.txt");


            while(true){
                int buf=is.read();

                if(buf==-1){
                    break;
                }

                System.out.println(buf);
            }

            is.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
