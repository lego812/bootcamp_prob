package ch18.sec03.exam03;

import java.io.FileOutputStream;
import java.io.*;

public class CopyExample {
    public static void main(String[] args) throws Exception{
//        String originalFileName = "C:/Temp/test.jpg";
//        String targetFileName = "C:/Temp/test2.jpg";

        OutputStream os = new FileOutputStream("C:\\temp\\test.jpg");
        InputStream is=new FileInputStream("C:/Temp/test2.jpg");

        

    }
}
