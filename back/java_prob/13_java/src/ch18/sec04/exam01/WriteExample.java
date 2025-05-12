package ch18.sec04.exam01;

import java.io.*;

public class WriteExample {
    public static void main(String[] args) {


       try {
           char a = 'A';
           char b = 'B';
           char[] arr = {'C', 'D', 'E'};

           Writer writer = new FileWriter("c:/Temp/test.txt");

           writer.write(a);

           writer.write(b);

           writer.write(arr);

           writer.flush();

           writer.close();

       }catch (IOException e) {
           e.printStackTrace();
       }
    }
}
