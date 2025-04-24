package ch05.sec06;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        int[] arr1=new int[3];
        String[] arr2=new String[3];
        int i=0;
        for(i=0; i<arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        for(i=0; i<arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
