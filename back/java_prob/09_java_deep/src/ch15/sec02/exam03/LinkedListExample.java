package ch15.sec02.exam03;

import ch15.sec02.exam01.Board;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<Board> list = new LinkedList<>();

        list.add(new Board("제목1","콘텐츠1","글쓴이1"));
        list.add(new Board("제목2","콘텐츠2","글쓴이2"));
        list.add(new Board("제목3","콘텐츠3","글쓴이3"));
        list.add(new Board("제목4","콘텐츠4","글쓴이4"));
        list.add(new Board("제목5","콘텐츠5","글쓴이5"));

        System.out.println("총 요소 : "+list.size());
        System.out.println();

        System.out.println(list.get(2));
        System.out.println();

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        list.remove(2);

        list.remove(2);

        for(Board b : list){
            System.out.println(b);
        }
    }
}
