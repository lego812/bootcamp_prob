package ch15.sec02.exam01;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        //Board 클래스를 저장하기 위한 ArrayList 인스턴스 생성
        List<Board> arrayList=new ArrayList<>();

        //Board 클래스의 인스턴스 5개를 생성하여 ArrayList에 추가
        arrayList.add(new Board("제목","콘텐츠","글쓴이"));
        arrayList.add(new Board("제목1","콘텐츠1","글쓴이1"));
        arrayList.add(new Board("제목2","콘텐츠2","글쓴이2"));
        arrayList.add(new Board("제목3","콘텐츠3","글쓴이3"));
        arrayList.add(new Board("제목4","콘텐츠4","글쓴이4"));

        //ArrayList에 저장된 요소의 개수 출력
        int listSize=arrayList.size();
        System.out.println("ArrayList 사이즈: "+listSize);

        //3번째 데이터를 출력하여 출력
        System.out.println(arrayList.get(2));

        //일반 for문으로 순회하면서 리스트의 각 요소를 출력
        for(int i=0; i< arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        //인덱스 2에 해당하는 요소 제거
        arrayList.remove(2);


        //인덱스 2에 해당하는 요소 제거
        arrayList.remove(2);

        //향상된 for문으로 순회하면서 리스트의 각 요소를 출력
        for(Board board : arrayList) {
            System.out.println(board);
        }

//        Iterator<Board> iterator=arrayList.iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }






    }
}
