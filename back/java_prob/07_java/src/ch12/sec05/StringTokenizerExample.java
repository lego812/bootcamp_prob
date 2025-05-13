package ch12.sec05;

import java.util.StringTokenizer;


public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String[] arr = data1.split("&|,");

        for(String token:arr){
            System.out.println(token);
        }

        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2,"/");
//        int countTokens=st.countTokens();  주의:카운트 토큰을 한번만 호출하기
//        for(int i=0; i<countTokens; i++){
//            String token = st.nextToken();
//            System.out.println(token);
//        }
         while(st.hasMoreTokens()){
             System.out.println(st.nextToken());
         }

    }
}
