package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        double area = calc.areaCircle(10);
        System.out.println(area);

        Computer ce = new Computer();
        double area2=ce.areaCircle(10);
        System.out.println(area2);

    }
}
