package ch13.sec03.exam01;

public class Box<T>{
    private T t; //필드선언

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

}
