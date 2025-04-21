package ch05.sec06;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] array={84,9,9};
        int sum=0;
        for(int i=0; i<array.length; i++) {
            sum+=array[i];
        }
        System.out.println(sum);
        System.out.println(sum/array.length);
    }
}
