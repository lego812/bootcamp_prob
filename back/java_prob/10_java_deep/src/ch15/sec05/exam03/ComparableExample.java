package ch15.sec05.exam03;

import java.util.ArrayList;
import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();

        people.add(new Person("홍길동", 35));
        people.add(new Person("감자바", 25));
        people.add(new Person("박지원", 31));

        TreeSet<Person> treeSet=new TreeSet<>(people);

        for (Person person : treeSet) {
            System.out.println(person.name+", "+person.age);
        }
    }
}
