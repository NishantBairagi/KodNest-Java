
import java.util.Scanner;

abstract class Vehicle {

    abstract void start();
}

class Bike extends Vehicle {

    private String brand;

    public Bike(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " bike started");
    }

}

public class Abstraction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand = sc.next();
        Vehicle v = new Bike(brand);
        v.start();
    }
}
