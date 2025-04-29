package ch07.sec10.exam02;

public abstract class Animal {
    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }
    public abstract void sound();
}

//추상클래스-->일종의 상속개념
//인터페이스와 비슷하지만 개념과 쓰임새가 다름
//인터페이스=구현, 추상클래스=상속
//인터페이스는 일반 메서드 정의가 불가능한 반면, 추상클래스는 일반메서드 정의가 가능하다.
//기본적으로 인터페이스는 구현 객체의 동일한 실행 기능 보장이 목적
//반면 추상클래스는 상속을 통한 기능 확장이 목적