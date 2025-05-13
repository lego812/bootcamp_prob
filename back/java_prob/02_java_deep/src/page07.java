public class page07 {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};
        //Arrays.stream(array).max().ifPresent(System.out::println);

        int max = 0;

        for(int i=0; i<array.length; i++){
            if(max<array[i]){
                max=array[i];
            }
        }

        System.out.println(max);
    }
}
