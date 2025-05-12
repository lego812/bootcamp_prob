package ch18.sec04.exam02;

import java.io.*;

public class ReadExample {
    public static void main(String[] args) {
        try{
            Reader reader=new FileReader("c:/temp/test.txt");
            while(true){
                int buf=reader.read();
                if(buf==-1) break;
                System.out.print((char)buf);
            }
            System.out.println();

            int rof=0;//루프확인용
            reader=new FileReader("c:/temp/test.txt");
            char[] buffer=new char[3];//다음과 같이 버퍼의 저장공간이 부족할 경우
            while(true){//while문을 통해 read를 계속 돌려주면서 더 이상 읽을 정보가 없도록 하기
                int buf=reader.read(buffer);
                if (buf==-1) break;
                for(int j=0;j<buf;j++){
                    System.out.print(buffer[j]);
               }
                rof++;
            }
            reader.close();
            System.out.println();
            System.out.println(rof);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
