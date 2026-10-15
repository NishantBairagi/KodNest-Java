
import java.util.Scanner;

interface Switchable {

    void switchOn();
}

interface Chargeable {

    void charge();
}

class Phone implements Switchable, Chargeable {

    private String name;

    public Phone(String name) {
        this.name = name;
    }

    public void switchOn() {
        System.out.println(name + " switch on");
    }

    public void charge() {
        System.out.println(name + " charging");
    }

}

public class MultipleInheritance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Phone p = new Phone(name);
        p.switchOn();
        p.charge();
    }
}
