package ch06.sec08.exam02;

public class Computer {
    public int sum(int ...values){
        int result = 0;
        for(int i=0; i<values.length; i++){
            result += values[i];
        }
        return result;
    }
}
