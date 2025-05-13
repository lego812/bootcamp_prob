package ch15.sec05.exam04;

import java.util.*;


public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("포도", 3000));
        fruits.add(new Fruit("수박", 10000));
        fruits.add(new Fruit("딸기", 6000));

        TreeSet<Fruit> treeSet=new TreeSet<>(new FruitComparator());
        treeSet.addAll(fruits);

        for (Fruit fruit : treeSet) {
            System.out.println(fruit.name+", "+fruit.price);
        }

    }
}
