package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.*;
import java.util.Arrays;

public class WriteExample {
    public static void main(String[] args) {
        try{
            OutputStream os = new FileOutputStream("c:/Temp/test2.db");
            byte[] array = { 65, 66, 67 };
//            for (int i = 0; i < array.length; i++) {
//                os.write(array[i]);
//            }

            os.write(array);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        byte[] array = { 10, 20, 30 };

    }
}
