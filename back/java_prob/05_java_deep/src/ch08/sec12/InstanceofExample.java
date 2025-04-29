package ch08.sec12;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();
        ride(taxi);
        System.out.println();
        ride(bus);
    }

//    static void ride(Vehicle vehicle) {
//        if (vehicle instanceof Bus ){
//            vehicle=new Bus();
//            ((Bus) vehicle).checkFare();
//        }
//        vehicle.run();
//    }

//    public static void ride(Vehicle vehicle) {
//        if (vehicle instanceof Bus) {
//            Bus bus=(Bus)vehicle;
//            bus.checkFare();
//        }
//        vehicle.run();
//    }

    public static void ride(Vehicle vehicle) {
        if (vehicle instanceof Bus bus){
            bus.checkFare();
        }
        vehicle.run();
    }
}