/*
 * Assignment11b
 * Output of the code
 */

class Automobile {
    private String drive() {
        return "Driving vehicle";
    }
}

class Car extends Automobile {
    protected String drive() {
        return "Driving car";
    }
}

public class ElectricCar extends Car {

    @Override
    public final String drive() {           //this method can't be overridden by any sub/derived/child class of ElectricCar class
        return "Driving electric car";
    }

    public static void main(String[] args) {
        final Car car = new ElectricCar();
        System.out.println(car.drive());
    }
}