package ch15.sec02.exam01;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> arrayList=new ArrayList<>();
        arrayList.add(new Board("제목","콘텐츠","글쓴이"));
        arrayList.add(new Board("제목1","콘텐츠1","글쓴이1"));
        arrayList.add(new Board("제목2","콘텐츠2","글쓴이2"));
        arrayList.add(new Board("제목3","콘텐츠3","글쓴이3"));
        arrayList.add(new Board("제목4","콘텐츠4","글쓴이4"));

        int arrayListSize=arrayList.size();
        System.out.println("ArrayList 사이즈: "+arrayListSize);
        System.out.println(arrayList.get(2));


    }
}
