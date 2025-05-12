package ch18.sec07.exam02;

import java.io.*;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
//        FileReader fr = new FileReader("src/h18/sec07/exam02/ReadLineExample.java");

        BufferedReader br=new BufferedReader( new FileReader("c:/temp/test3.txt"));

        while(true){
            String line=br.readLine();
            if(line==null)break;
            System.out.println(line);
        }

    }
}
