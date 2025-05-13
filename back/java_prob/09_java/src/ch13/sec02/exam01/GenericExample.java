package ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        product<Tv, String> product1=new product<>();
        product1.setKind(new Tv());
        product1.setModel("스마트Tv");

        Tv tv=product1.getKind();
        String tvModel1=product1.getModel();

        product<Car, String> product2=new product<>();
        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        Car car=product2.getKind();
        String carModel1=product2.getModel();
    }
}
