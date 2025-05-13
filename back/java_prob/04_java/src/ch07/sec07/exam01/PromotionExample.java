package ch07.sec07.exam01;

class A {
}
class B extends A {
}
class C extends A {
}
class D extends B {
}
class E extends C {
}


public class PromotionExample {

    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

//        A a1 = b;
//        A a2 = c;
//        A a3 = d;
//        A a4 = e;
//        B b1 = d;
//        C c1 = e;
//
//        B b3 = e; //상속관계에 있지 않으므로 타입변환불가
//        C c2 = d; //상속관계에 있지 않으므로 타입변환불가

        //자동타입변환.
        //1. 상속관계에 있는 사이에만 가능
        //2. 부모 클래스 타입의 변수애개 자식 클래스 타입의 변수를 대입 시, 부모 타입의 변수에는 자식 타입변수의 주소가 할당됨.

    }
}
