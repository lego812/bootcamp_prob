package ch18.sec02.exam01;

import java.io.*;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("c:\\temp\\test1.txt");

            byte a = 65;
            byte b = 66;
            byte c = 6;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();
            os.close();

        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
