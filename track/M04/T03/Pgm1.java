
class Car {

    static void convertKmIntoMiles() {
        System.out.println("converting km into miles");
    }

    public void calculateMileage() {
        System.out.println("Calculating mileage");
    }
}

public class Pgm1 {

    public static void main(String[] args) {
        Car.convertKmIntoMiles();
        Car nano = new Car();
        nano.calculateMileage();
    }
}
