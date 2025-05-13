package org.scoula.lib;

public class InputTest {
    public static void main(String[] args) {

        Input input=new Input();
        String name;
        int age=0;
        boolean flag=false;

        name=input.read("이름: ");
        System.out.println("입력값: "+name);
        name=input.read("이름 ",name);
        System.out.println("입력값: "+name);
        age=input.readInt("나이");
        System.out.println("입력값: "+age);

        flag=input.confirm("종료할까요?");
        System.out.println("입력값: "+flag);
        flag=input.confirm("종료할까요?", true);
        System.out.println("입력값: "+flag);
    }
}
