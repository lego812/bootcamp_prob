package ch18.sec03.exam02;

import java.io.*;

public class ReadExample {
    public static void main(String[] args) {

        try{
            InputStream is=new FileInputStream("c:/temp/test1.txt");

            byte[] data=new byte[1024];


            while(true){
                int buf=is.read(data);
                if(buf==-1){
                    break;
                }

                for(int i=0;i<buf;i++){
                    System.out.print((char)data[i]);
                }
            }
            is.close();

//            for(int i=0;data[i]!=0;i++){
//                System.out.print(data[i]);
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
