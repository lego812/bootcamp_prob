package ch18.sec03.exam02;

import java.io.*;

public class ReadExample {
    public static void main(String[] args) {

        try{
            InputStream is=new FileInputStream("c:/temp/test1.txt");

            byte[] data=new byte[1024];
            int index=0;

            while(true){
                int buf=is.read();
                if(buf==-1){
                    break;
                }

                data[index++]=(byte)buf;

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
