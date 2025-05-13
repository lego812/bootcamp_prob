package ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList< >();
        list1.add("this is java");
        list1.add("i am a best developer");
        //문장 스트림을 단어 스트림으로 변환 후 출력
        list1.stream().flatMap(s->Arrays.stream(s.split(" "))).forEach(System.out::println);

        System.out.println();

        List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
        //문자열 숫자 목록 스트림을 숫자 스트림으로 변환 후 출력
//        list2.stream().flatMapToInt(s->{
//           String[] arr=s.split(",");
//           int[] nums=new int[arr.length];
//           for(int i=0; i<arr.length; i++){
//               arr[i]=arr[i].trim();
//               nums[i]=Integer.parseInt(arr[i]);
//           }
//           return Arrays.stream(nums);
//        }).forEach(System.out::println);


        //함수형 스타일 작성
        list2.stream()
                .flatMapToInt(s->
                        Arrays.stream(s.split(","))
                        .map(String::trim)
                        .mapToInt(Integer::parseInt)
                )
                .forEach(System.out::println);
    }
}
