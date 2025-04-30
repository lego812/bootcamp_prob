package ch15.sec06.exam01;

import java.util.ArrayList;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<Coin> stack=new Stack<>();
        stack.push(new Coin(100));
        stack.push(new Coin(50));
        stack.push(new Coin(500));
        stack.push(new Coin(10));

        for(int i=stack.size()-1;i>=0;i--){
            Coin coin=stack.pop(); //stack 반환타입이 코인이므로 가능
            System.out.println("꺼내온 동전 : "+coin.getValue());
        }
    }
}
