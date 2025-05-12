package ch18.sec03.exam03;

import java.io.FileOutputStream;
import java.io.*;

public class CopyExample {
    public static void main(String[] args) throws Exception{
//        String originalFileName = "C:/Temp/test.jpg";
//        String targetFileName = "C:/Temp/test2.jpg";


        InputStream is=new FileInputStream("C:/Temp/test.jpg");
        OutputStream os = new FileOutputStream("C:/Temp/test2.jpg");

        byte[] buffer = new byte[1024];
        while(true){
            int len=is.read(buffer);
            if (len == -1) {
                break;
            }
            os.write(buffer, 0, len);
        }

        os.flush();
        os.close();
        is.close();

        System.out.println("Done");





        

    }
}
